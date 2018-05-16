package com.yc.proxy;

public class SubjectImpl implements Subject {

	public void add() {
		// TODO Auto-generated method stub
		System.out.println("对象方法被调用");
	}

	public void del() {
		// TODO Auto-generated method stub
		System.out.println("对象移除");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("对象更新");
	}

}
