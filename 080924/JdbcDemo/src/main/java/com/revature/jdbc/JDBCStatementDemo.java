package com.revature.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCStatementDemo {
public static void main(String[] args) {
	Connection connection=null;
	Statement statement=null;
	ResultSet resultSet=null;
	String url="jdbc:mysql://localhost:3306/my_db";
	String uname="root";
	String pwd="admin@123";
	
	// STEP -1 : LOAD THE DRIVER -- optional from java 6 onwards
	try {
		//Class.forName("com.mysql.cj.jdbc.Driver");
		// STEP 2 - Create the connection Object
		connection=DriverManager.getConnection(url,uname,pwd);
		
		// STEP 3- Create a Statement/PS /CS Object
		statement=connection.createStatement();
		String sql1="select * from contacts";
		
		// Step 4 - Execute Query and get ResultSet
		resultSet=statement.executeQuery(sql1);
		
		// Step 5 - Process the result set
		while(resultSet.next()) {
			System.out.println(resultSet.getInt("id")+" , "+
					resultSet.getString(2)+" , "+resultSet.getString("email"));
		}
		
		// step 6 - Close the connection
		connection.close();
	} catch ( SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
