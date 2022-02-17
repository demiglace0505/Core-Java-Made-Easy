package com.demiglace.anonymousinner;

public class DriverManager {
	static Connection getConnection() {
		Connection con = new Connection() {
			@Override
			public void createStatemenet() {
				System.out.println("Inside anonymous inner class method");
			}
		};
		return con;
	}
}
