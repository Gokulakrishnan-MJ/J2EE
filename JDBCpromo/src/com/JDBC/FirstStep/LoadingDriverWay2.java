package com.JDBC.FirstStep;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadingDriverWay2 {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Loading Drivers way 2 successfully done");
				
				//Creating Connection Using Way 1
				
		//		String dburl="jdbc:mysql://localhost:3306/user?user=root&password=root";
		//		Connection con=DriverManager.getConnection(dburl);
				
				//Creating Connection Using Way 2
				
//				String dburl="jdbc:mysql://localhost:3306/user";
//				String user="root";
//				String password="root";
//				Connection con=DriverManager.getConnection(dburl, user, password);

				//creating connection using way 3
				
				String dburl="jdbc:mysql://localhost:3306/user?user=root&password=root";
				
				Connection con=DriverManager.getConnection(dburl);
				
				if(con!=null)
				{
					System.out.println("Connection Successful");
				}
				else
				{
					System.out.println("Connectino Failed");
				}
				
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
