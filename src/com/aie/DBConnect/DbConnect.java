package com.aie.DBConnect;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnect {
	
	public static Connection DbConnector() {
	
		try {
		String url="jdbc:mysql://localhost:3306/bdd1?useSSL= false&allowPublicKeyRetrieval=true";
		String user="root";
		String pass="kadertag";
			
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,pass);
		System.out.println("Connection SucessFull");
		return con;
	}
		catch (Exception e) {
			System.out.println("Connection Error!!"+ e);
		}
		return null;
}
}
