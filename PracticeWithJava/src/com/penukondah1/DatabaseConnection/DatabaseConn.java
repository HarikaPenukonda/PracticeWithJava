package com.penukondah1.DatabaseConnection;

import java.sql.*;

//Java DataBase Connectivity

/* 1. import --> java.sql 
* 2. load and register driver --> com.mysql.jdbc.Driver
* 3. create connection
* 4. create a statement
* 5. execute a query 
* 6. process the results
* 7. close the connection
* */

public class DatabaseConn {
	
	public static void main (String [] args) throws Exception
	{
		String url = "jdbc:mysql://localhost:3306/HarikaDB";
		String username = "root";
		String password = "rootuser";
		String query = "select sname from student where rollno=2";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,username,password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(query);
		rs.next();
		
		String name = rs.getString("sname");
		System.out.println(name);
		
		stmt.close();
		con.close();
	}


}
