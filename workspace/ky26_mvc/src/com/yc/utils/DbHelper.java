package com.yc.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSourceFactory;

public class DbHelper {
	private static DataSource ds;
	static{
		Properties p=new Properties();
		try {
			p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("dbInfo.properties"));
			//获取配置文件，p.load()中的参数代表配置文件的路径，相对于当前项目的路径
			//dbInfo.properties数据库的配置文件,放在src路径下，定义数据库驱动等信息
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		try {
			ds=BasicDataSourceFactory.createDataSource(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static DataSource getDataSource(){
		return ds;
	}
	public static Connection getConnection(){
		try {
			return ds.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	public static void release(ResultSet rs,Statement stat,Connection conn){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(stat !=null){
			try {
				stat.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try {
			if(conn!=null &&!conn.isClosed()){
				conn.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
