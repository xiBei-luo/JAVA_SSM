package com.yc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public abstract class DynamicSubject {
	public Object getProxy(final Object ox){
		Object op=null;
		op=Proxy.newProxyInstance(ox.getClass().getClassLoader(),ox.getClass().getInterfaces(),new InvocationHandler(){
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				// TODO Auto-generated method stub
				System.out.println("----");
				before();
				Object obj=method.invoke(ox, args);
				System.out.println("+++++");
				after();
				return obj;
			}
			
		});
		return op;
	}

	public abstract void before() ;
	public abstract void after() ;
}
