package com.yc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbUtils {
	static{
		//System.out.println("进入原来油条");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("数据库驱动加载失败");
		}
	}
	
	public static Connection getConn(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_oa", "root", "root");
		} catch (Exception e) {
			System.out.println("连接数据库失败");
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
		}catch(Exception e){
			System.out.println("sql语句错误");
		}
		return rs;
	}//鏌�
	
	public static int executeCUD(String sql){
		Connection conn=null;
		Statement stat=null;
		int c=0;
		try{
			conn=getConn();
			stat=conn.createStatement();
			c=stat.executeUpdate(sql);
			stat.close();
			conn.close();
		}catch(Exception e){
			System.out.println("sql语句错误");
		}
		return c;
	}//澧炲垹鏀�
}
