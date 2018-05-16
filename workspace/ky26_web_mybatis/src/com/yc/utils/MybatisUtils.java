package com.yc.utils;

import java.io.InputStream;

import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtils {
	public static SqlSessionFactory getSqlSessionF(){
		InputStream in=Thread.currentThread().getContextClassLoader().getResourceAsStream("mybatis.xml");
		SqlSessionFactory ssf=new SqlSessionFactoryBuilder().build(in);
		return ssf;
	}
}
