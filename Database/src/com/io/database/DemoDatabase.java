package com.io.database;

import java.sql.*;


// 1.Import the package - java.sql.*
// 2.Register and load the driver
// 3.Create a connection
// 4.create a statement
// 5.Execute the statement
// 6.Capture and process the result
// 7. Close the connection

public class DemoDatabase {

	public static void main(String[] args) throws Exception {
		String url = "jdbc:mysql://localhost:3306/record_company";
		String uName = "root";
		String pass = "Misys123$";
		int id = 8;
		String Name = "Juri";
		String query = "insert into student (userid, userName) values (?, ?)" ;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
//		DriverManager.registerDriver(new  com.mysql.cj.jdbc.Driver());
		
		Connection con = DriverManager.getConnection(url, uName, pass);
		
		PreparedStatement preparedSt = con.prepareStatement(query);
		preparedSt.setInt(1, id);
		preparedSt.setString(2, Name);
		int count = preparedSt.executeUpdate();
		
		System.out.println(count + " row(s) affected");
		
//		while(rs.next()) {
//			String userData = rs.getInt(1) + " " + rs.getString(2);
//			System.out.println(userData);
//		}
		
		preparedSt.close();
		con.close();
		
	}

}









