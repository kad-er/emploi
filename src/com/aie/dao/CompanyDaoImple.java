package com.aie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.aie.DBConnect.DbConnect;
import com.aie.beans.Company;
import com.aie.beans.Jobs;

public class CompanyDaoImple implements CompanyDao{

	@Override
	public int addCompany(Company c) {
		System.out.println("Company dao--Add");
		try {
			Connection con=DbConnect.DbConnector();
			PreparedStatement prep=con.prepareStatement("insert into Company values(?,?,?,?,?,?,?)");
			prep.setString(1, c.getCompanyEmailId());
			prep.setNString(2, c.getCompanyname());
			prep.setString(3, "");
			prep.setString(4, c.getPassword());
			prep.setString(5, "");
			prep.setString(6, c.getCompanyHR());
			prep.setString(7, c.getCompanyHRName());
			
			
			int flag1=prep.executeUpdate();
			
			PreparedStatement prep2=con.prepareStatement("insert into logindata values(?,?,?,?)");
			prep2.setString(1,"");
			prep2.setString(2, c.getPassword());
			prep2.setString(3, "ROLE_COMPANY");
			prep2.setString(4, c.getCompanyEmailId());
			
			
			int flag2=prep2.executeUpdate();
			
			if(flag1==1 && flag2==1) {
				return 1;
			}
		}
		catch (Exception e) {
			System.out.println("register company fail "+ e);
		}
		return 0;
	}

	@Override
	public int addJob(Jobs j, String mail) {
		
		try {
			Connection con=DbConnect.DbConnector();
			PreparedStatement prep1=con.prepareStatement("select * from Company where Cmail=?");
			prep1.setString(1, mail);
			ResultSet rs=prep1.executeQuery();
			rs.next();
			String CompanyName=rs.getString(1);
			String CHR=rs.getString(5);
			
			PreparedStatement prep2=con.prepareStatement("insert into Jobs(Jname,Cname,Jcontact,Jskill,Cmail,Jdesc) values(?,?,?,?,?,?)");
			prep2.setString(1,j.getJobName());
			prep2.setString(2, CompanyName);
			prep2.setString(3, CHR);
			prep2.setString(4, j.getRequiredSkills());
			prep2.setString(5, mail);
			prep2.setString(6,j.getJobdescription());
			
			int flag=prep2.executeUpdate();
			return flag;
		}catch (SQLException e) {
			System.out.println(" add job error "+e);
		}
		return 0;
	}

}
