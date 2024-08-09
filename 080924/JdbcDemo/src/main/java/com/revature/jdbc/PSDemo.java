package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class PSDemo {
	static Connection connection=null;
	static PreparedStatement preparedStatement=null;
	static String url="jdbc:mysql://localhost:3306/my_db";
	static String uname="root";
	static String pwd="admin@123";
	
	public static void main(String[] args) {
		try {
			connection=DriverManager.getConnection(url,uname,pwd);
			String insertSql="insert into contacts(name,email) values(?,?)";
			preparedStatement= connection.prepareStatement(insertSql);	
			//preparedStatement.setInt(1, 5);
			preparedStatement.setString(1, "Siddhi");
			preparedStatement.setString(2, "Siddhi@gmial.com");
			//preparedStatement.setString(4, "abc");
			preparedStatement.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
}
}
