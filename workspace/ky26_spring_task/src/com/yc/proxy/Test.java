package com.yc.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	public static void main(String[] args) {
		/*SubjectImpl rs=new SubjectImpl();
		DynamicSubject ds=new DynamicSubject(){

			@Override
			public void after() {
				// TODO Auto-generated method stub
				System.out.println("aaa");
			}

			@Override
			public void before() {
				// TODO Auto-generated method stub
				System.out.println("bbb");
			}
			
		};
		
		//参考对比spring-aop代码
		Subject s=(Subject)ds.getProxy(rs);
		s.del();*/
		
		
		/*Subject subject=new ProxySubject();
		subject.add();
		subject.del();//静态代理*/	
		/*SubjectImpl rs=new SubjectImpl();
		JDKProxySubject js=new JDKProxySubject(){

			@Override
			public void before() {
				// TODO Auto-generated method stub
				System.out.println("方法调用前");
			}

			@Override
			public void after() {
				// TODO Auto-generated method stub
				System.out.println("方法调用后");
			}
			
		};
		Subject s=(Subject) js.getProxy(rs);*/
		/*s.update();*/
		
	}
}
