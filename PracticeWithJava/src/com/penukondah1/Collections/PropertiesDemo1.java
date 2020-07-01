package com.penukondah1.Collections;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class PropertiesDemo1 {
	
	public static void main (String []args) throws IOException, SQLException {
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("db.properties");
		p.load(fis);
		String url = p.getProperty("url");
		String user = p.getProperty("user");
		String pwd = p.getProperty("pwd");
		Connection con = DriverManager.getConnection(url,user,pwd);
	}

}
