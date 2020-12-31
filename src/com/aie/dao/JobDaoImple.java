package com.aie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.aie.DBConnect.DbConnect;
import com.aie.beans.AppliedJobs;
import com.aie.beans.Jobs;

public class JobDaoImple implements JobDao {

	@Override
	public List<Jobs> FetchJobs() {
		List<Jobs>li=new ArrayList<Jobs>();
		Connection con=DbConnect.DbConnector();
		try {
			
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Jobs");
			while(rs.next()) {
				Jobs job=new Jobs();
				job.setJobId(rs.getInt(1));
				job.setJobName(rs.getString(2));
				job.setCompanyName(rs.getString(3));
				job.setCompanyContactPerson(rs.getString(4));
				job.setRequiredSkills(rs.getString(5));
				job.setCompanymailId(rs.getString(6));
				job.setJobdescription(rs.getString(7));
				li.add(job);
				
				
			}
			System.out.println("Job added");
			return li;
		}catch (SQLException e) {
			System.out.println("Job add failed");
		}
		return null;
	}

	@Override
	public int submitApplication(Jobs j, String s1, String s2, String s3, String s4) {
		
		try {
			Connection con=DbConnect.DbConnector();
			PreparedStatement prep=con.prepareStatement("insert into appliedjobs values(?,?,?,?,?,?,?)");
			prep.setInt(1, j.getJobId());
			prep.setString(2, s1);
			prep.setString(3, s2);
			prep.setString(4, j.getJobName());
			prep.setString(5,j.getCompanyName());
			prep.setString(6, j.getCompanymailId());
			prep.setString(7,"APPLIED");
			
			int flag=prep.executeUpdate();
			return flag;
			
		}catch (SQLException e) {
			System.out.println("submit appli error "+e);
		}
		return 0;
	}

	@Override
	public List<AppliedJobs> fetchAllAppliedJob() {
		List<AppliedJobs> li=new ArrayList<>();
		try {
			Connection con=DbConnect.DbConnector();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from appliedjobs");
			
			while(rs.next()) {
				AppliedJobs aj=new AppliedJobs();
				aj.setJobId(rs.getInt(1));
				aj.setEmp_mailid(rs.getString(2));
				aj.setEmpName(rs.getString(3));
				aj.setJobitle(rs.getString(4));
				aj.setCompanyName(rs.getString(5));
				aj.setCompanyMail(rs.getString(6));
				aj.setStatus(rs.getString(7));
				li.add(aj);
			}
			return li;
		}
		catch (SQLException e) {
			System.out.println("fetch applied jobs erroe "+e);
		}
		return null;
	}

}
