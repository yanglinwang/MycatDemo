package com.mycat.test;

import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.PreparedStatement;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:8066/TESTDB";
		String username = "root";
		String password = "123456";
		Connection conn = DriverManager.getConnection(url, username, password);
		String sql = "insert into travelrecord(id,user_id,traveldate,fee,days)  values(1002,'Victor',20160101,100,10);";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.executeUpdate();
		conn.close();
		ps.close();	
	}

}
