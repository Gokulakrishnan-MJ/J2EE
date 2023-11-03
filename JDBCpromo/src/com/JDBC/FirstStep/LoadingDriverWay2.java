package com.JDBC.FirstStep;

public class LoadingDriverWay2 {
		public static void main(String[] args) {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Loading Drivers way 2 successfully done");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
}
