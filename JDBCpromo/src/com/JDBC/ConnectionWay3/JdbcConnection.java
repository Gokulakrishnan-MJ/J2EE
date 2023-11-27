package com.JDBC.ConnectionWay3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JdbcConnection {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Loading Drivers Successful");
			File f=new File("./Credentials/Configuration.properties");
			
			FileReader reader=new FileReader(f);  
			Properties prop = new Properties();
			prop.load(reader);
			String dburl=prop.getProperty("dburl");
			
			Connection con=DriverManager.getConnection(dburl, prop);
			if(con!=null)
			{
				System.out.println("Connection Successful");
			}
			else
			{
				System.out.println("Connection Failed ");
			}
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	

}
