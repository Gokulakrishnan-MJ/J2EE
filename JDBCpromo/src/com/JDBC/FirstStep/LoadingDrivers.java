package com.JDBC.FirstStep;

import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadingDrivers {
	public static void main(String[] args) {
		try {
			java.sql.Driver driver = new com.mysql.cj.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("HI");
		} catch (SQLException e) {
			e.printStackTrace();
			//.out.println("HI");
		}
	}
}
