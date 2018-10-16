package com.nttduong.matchingme.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class ConnectMysql {		
	public static Connection getJDBCConnection() {
		final String url="jdbc:mysql://localhost:3306/funix_project";
		final String userDB="root";
		final String passwordDB="thuyduong056";
		Connection con = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = (Connection) DriverManager.getConnection(url, userDB, passwordDB);
//			if(con != null) {
//				System.out.println("get connecion successfull");
//			}
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (SQLException e) {
			//select * from accounts where username='admin' and pw='123'
			System.out.println(e.getMessage());
		}
		return con;
	}
	public static boolean checkLogin(String user, String pass) {
		Connection con = ConnectMysql.getJDBCConnection();
		String sql = "select Username from user where Username='" + user + "' and PassWord='" + pass + "'";
		// Statement stmt = null;
		System.out.println(sql);
		boolean check = false;

		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			// stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next()) {
				con.close();
				check = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return check;
	}
	
	public static int degree(String user) {
		int de = 0;
		Connection con = ConnectMysql.getJDBCConnection();
		String sql = "select * from user where Username='" + user + "'";
		// Statement stmt = null;
		System.out.println(sql);
		try {
			PreparedStatement stmt = con.prepareStatement(sql);
			// stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			rs.first();
			String degree = rs.getString("Id_right");
			switch (degree) {
			case "1":
				de = 1;
				break;
			case "2":
				de = 2;
				break;
			case "3":
				de = 3;
				break;
			default:
				de = 0;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return de;

	}
	
	public static void main(String[] args) {
//		Connection con = getJDBCConnection();
//		if(con!=null) {
//			System.out.println("thanh cong");
//		}else {
//			System.out.println("that bai");
//		}
		System.out.println(checkLogin("duong123","pass"));
//		System.out.println(degree("duong123"));
	
	}
}
