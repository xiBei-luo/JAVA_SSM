package com.yc.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.InvocationHandler;
import org.springframework.cglib.proxy.Proxy;

public abstract class JDKProxySubject{
	
	public Object getProxy(final Object ox){
		Object op=null;
		op=Proxy.newProxyInstance(ox.getClass().getClassLoader(), ox.getClass().getInterfaces(),new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("invoke方法被调用了");
				before();
				Object obj=method.invoke(ox, args);
				after();
				return null;
			}
		});
		return op;
	}
	
	public abstract void before();
	public abstract void after();


	

}
