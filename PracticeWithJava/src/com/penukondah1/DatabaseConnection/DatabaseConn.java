package com.penukondah1.DatabaseConnection;

import java.sql.*;

//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;

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
	
	public static void main (String [] args) throws SQLException, ClassNotFoundException
	{
		//String url = "jdbc:mysql://localhost:3306/HarikaDB";
		String url = "jdbc:mysql://localhost:3306/HarikaDB?serverTimezone=UTC";
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
		
		
		//datasourceName  jdbc/dsName,jdbc/java:dsName
//		Context ct = new InitialContext();
//		DataSource ds = (DataSource) ct.lookup("jdbc/dsName");
//		Connection con = ds.getConnection();
		
		
	}

}
