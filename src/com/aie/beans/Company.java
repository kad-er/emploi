package com.aie.beans;

public class Company {

	private String Companyname;
	private String CompanyEmailId;
	private String Password;
	private String CompanyHR;
	private String CompanyHRName;
	private String JobPostedCount;
	public String getCompanyname() {
		return Companyname;
	}
	public void setCompanyname(String companyname) {
		Companyname = companyname;
	}
	public String getCompanyEmailId() {
		return CompanyEmailId;
	}
	public void setCompanyEmailId(String companyEmailId) {
		CompanyEmailId = companyEmailId;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getCompanyHR() {
		return CompanyHR;
	}
	public void setCompanyHR(String companyHR) {
		CompanyHR = companyHR;
	}
	public String getCompanyHRName() {
		return CompanyHRName;
	}
	public void setCompanyHRName(String companyHRName) {
		CompanyHRName = companyHRName;
	}
	public String getJobPostedCount() {
		return JobPostedCount;
	}
	public void setJobPostedCount(String jobPostedCount) {
		JobPostedCount = jobPostedCount;
	}
	@Override
	public String toString() {
		return "Company [Companyname=" + Companyname + ", CompanyEmailId=" + CompanyEmailId + ", Password=" + Password
				+ ", CompanyHR=" + CompanyHR + ", CompanyHRName=" + CompanyHRName + ", JobPostedCount=" + JobPostedCount
				+ "]";
	}
	public Company() {
	
	}
	
	
}
