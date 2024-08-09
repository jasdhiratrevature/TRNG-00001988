package com.revature.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.jdbc.utils.DatabaseConnection;

public class PSDemo2 {
	
	public static void main(String[] args) {
		  DatabaseConnection databaseConnection = null;
		  Connection connection=null;
		  PreparedStatement preparedStatement=null;
		  String sql="select * from contacts where id=?";
		try {
			// Using Connection Util here
			databaseConnection = DatabaseConnection.getInstance();
			  connection = databaseConnection.getConnection();
			  preparedStatement=connection.prepareStatement(sql);
			  preparedStatement.setInt(1, 5);
			  ResultSet resultSet=preparedStatement.executeQuery();
			  while(resultSet.next()) {
				  System.out.println("Id : "+resultSet.getInt(1)+
						  " - Name : "+resultSet.getString(2));
			  }
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	      
	}
}
