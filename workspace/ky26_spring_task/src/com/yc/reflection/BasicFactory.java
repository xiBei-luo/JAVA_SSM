package com.yc.reflection;

import java.io.FileReader;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Properties;

public class BasicFactory{
	private static BasicFactory factory=new BasicFactory();
	private BasicFactory(){}
	private static Properties prop=null;
	static{
		try {
			prop=new Properties();
			prop.load(new FileReader(BasicFactory.class.getClassLoader().getResource("reflection.properties").getPath()));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("配置信息读取失败");
		}
	}
	public static BasicFactory getFactory(){
		return factory;
	}
	public <T extends Service> T getService(Class<T> clazz){
		try {	
			String infName=clazz.getSimpleName();
			String implName=prop.getProperty(infName);
			final T service =(T) clazz.forName(implName).newInstance();
			//实现AOP,生成Service代理
			T proxyService =(T) Proxy.newProxyInstance(service.getClass().getClassLoader(),service.getClass().getInterfaces(), new InvocationHandler(){

				@Override
				public Object invoke(Object proxy, Method method, Object[] args)
						throws Throwable {
					// TODO Auto-generated method stub
					if(method.isAnnotationPresent(Tran.class)){
						try{
							TransactionManager.startTran();
							Object obj=method.invoke(service, args);
							TransactionManager.commit();
							return obj;
						}catch(Exception e){
							TransactionManager.rollback();
							throw new RuntimeException(e);
						}finally{
							TransactionManager.release();
						}
					}else{
						return method.invoke(service, args);
					}
				}
				
			});
			
			return proxyService;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	
		
	}
	/**
	 * 获取实例对象
	 */
	public <T extends Dao> T getDao(Class<T> clazz){
		
		try{
			String infName=clazz.getSimpleName();
			String implName=prop.getProperty(infName);
			return (T)Class.forName(implName).newInstance();
			}catch(Exception e){
				throw new RuntimeException(e);
			}
	
	}
}
