package com.yc.proxy;

public class ProxySubject implements Subject {
	//Subject rs=new SubjectImpl();
	SubjectImpl rs=new SubjectImpl();
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("方法调用前");
		rs.add();
		System.out.println("方法调用后");
	}

	public void del() {
		// TODO Auto-generated method stub
		//System.out.println("方法调用前");
		rs.del();
	}

}
