package com.yc.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo {
	public static void main(String[] args) throws Exception {
		Class clazz=Class.forName("com.yc.reflection.User");
		Object obj=clazz.newInstance();
		//System.out.println(obj.getClass().getName());
//		Field[] fs=clazz.getFields();
//		for(Field f:fs){
//			System.out.println(f);
//		}
		Field[] fs=clazz.getDeclaredFields();
		for(Field f:fs){
			//System.out.println(f.getName());
		}
//		Field fname=clazz.getDeclaredField("name");
//		fname.setAccessible(true);
//		fname.set(obj, "zs");
//		System.out.println(obj);
//		System.out.println(fname.get(obj));
//		System.out.println(Modifier.toString(fname.getModifiers()));
//		System.out.println(fname.getType());
//		Method[] ms=clazz.getMethods();
//		for(Method m:ms){
//			System.out.println(m.getName());
//		}
		Method[] ms=clazz.getDeclaredMethods();
		for(Method m:ms){
			System.out.println(m.getName());
		}
//		Method m=clazz.getDeclaredMethod("setName", new Class[]{String.class});
//		m.invoke(obj, new Object[]{"zs"});
//		System.out.println(obj);
		clazz.getComponentType();
		clazz.getSuperclass();
		Constructor con=clazz.getConstructor(new Class[]{int.class,String.class,int.class});
		//Object o=con.newInstance(new Object[]{1,"zs",5});
	}
}
