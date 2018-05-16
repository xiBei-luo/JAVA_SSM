package com.yc.reflection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbUtils {
	static{
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("加载驱动失败");
		}
	}
	
	public static Connection getConn() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/db_crud", "root", "root");
		} catch (Exception e) {
			System.out.println("获取连接对象失败");
		}
		return conn;
	}
	
	public static ResultSet executeQ(String sql){
		Connection conn=null;
		Statement stat=null;
		ResultSet rs=null;
		try{
			conn=getConn();
			stat=conn.createStatement();
			rs=stat.executeQuery(sql);
			return rs;
		}catch(Exception e){
			System.out.println("sql语句错误");
		}
		
		return null;
	}
	public static void executeCUD(String sql){
		Connection conn=null;
		Statement stat=null;
		try{
			conn=getConn();
			stat=conn.createStatement();
			stat.executeUpdate(sql);
			stat.close();
			conn.close();
		}catch(Exception e){
			System.out.println("sql语句错误");
		}
		

	}
}
