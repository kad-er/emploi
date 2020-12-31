package com.aie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.aie.DBConnect.DbConnect;

public class LoginDaoImple implements LoginDao {

	@Override
	public List<String> login(String mail, String pass) {
		System.out.println(mail+" "+pass);
		List<String> list=new ArrayList<>();
		try{
			Connection con=DbConnect.DbConnector();
			PreparedStatement prep=con.prepareStatement("select * from logindata where mail=? and pass=?");
			prep.setString(1, mail);
			prep.setString(2, pass);
			ResultSet rs=prep.executeQuery();
			String role=null;
		while(rs.next()) {
			System.out.println(rs.getString(3));
			role=rs.getString(3);
		}
		
		//String role=rs.getString(3);
		String flag="Success";
		list.add(role);
		list.add(flag);
		
			return list;
		
		}
		catch (Exception e) {
			System.out.println(" Login failed "+e);
		}
		return null;
	}

}
