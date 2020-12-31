package com.aie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.aie.DBConnect.DbConnect;
import com.aie.beans.Employee;

public class EmployeDAOImple  implements EmployeeDAO{

	@Override
	public int addEmployee(Employee e) {
		System.out.println("EMP DAO called");
		Connection con=DbConnect.DbConnector();	
		
		try {
			PreparedStatement prep=con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?,?,?,?)");
			prep.setString(1, e.getMailid());
			prep.setString(2,e.getFirstName());
			prep.setString(3, e.getLastName());
			prep.setString(4, e.getMobileNo());
			prep.setString(5, e.getPassword());
			prep.setString(6,e.getCurrentQualifications());
			prep.setString(7,e.getCurrentRole());
			prep.setString(8, e.getExpirence());
			prep.setString(9,e.getEducation_Degree());
			prep.setString(10,e.getCurrentCompany());
			prep.setString(11,e.getSkills());
			
			int flag1=prep.executeUpdate();
			
			System.out.println("candidate="+flag1);
			
			PreparedStatement prep2=con.prepareStatement("insert into logindata values(?,?,?,?)");
			prep2.setString(1,"");
			prep2.setString(2, e.getPassword());
			prep2.setString(3, "ROLE_EMPLOYEE");
			prep2.setString(4, e.getMailid());
			//prep2.setString(5,"");
			
			int flag2=prep2.executeUpdate();
			System.out.println("login="+flag2);
			if(flag1==1 && flag2==1) {
				return 1;
			}
			
			
		} catch (SQLException e1) {
			System.out.println("Register emp error "+e1);
		}
	return 0;
		
	}

	@Override
	public void CheckEmployee(String User, String Password) {
		
		
		
	}

}
