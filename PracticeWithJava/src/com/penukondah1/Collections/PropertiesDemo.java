package com.penukondah1.Collections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("/Users/harikapenukonda/git/PracticeWithJava/PracticeWithJava/src/com/penukondah1/Collections/abc.properties");
		p.load(fis);
		System.out.println(p); // {password=tiger, username=scott, Harika=1234} no insertion order
		
		String s = p.getProperty("Harika");
		System.out.println(s); // 1234
		
		p.setProperty("Anjali", "1999");
		FileOutputStream fos = new FileOutputStream("/Users/harikapenukonda/git/PracticeWithJava/PracticeWithJava/src/com/penukondah1/Collections/abc.properties");
		p.store(fos, "The file is updated with new values");

	}

}
