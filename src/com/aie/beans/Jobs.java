package com.aie.beans;

public class Jobs {

	private int JobId;
	private String JobName;
	private String CompanyName;
	private String CompanyContactPerson;
	private String RequiredSkills;
	private String CompanymailId;
	private String Jobdescription;
	public int getJobId() {
		return JobId;
	}
	public void setJobId(int i) {
		JobId = i;
	}
	public String getJobName() {
		return JobName;
	}
	public void setJobName(String jobName) {
		JobName = jobName;
	}
	public String getCompanyName() {
		return CompanyName;
	}
	public void setCompanyName(String companyName) {
		CompanyName = companyName;
	}
	public String getCompanyContactPerson() {
		return CompanyContactPerson;
	}
	public void setCompanyContactPerson(String companyContactPerson) {
		CompanyContactPerson = companyContactPerson;
	}
	public String getRequiredSkills() {
		return RequiredSkills;
	}
	public void setRequiredSkills(String requiredSkills) {
		RequiredSkills = requiredSkills;
	}
	public String getCompanymailId() {
		return CompanymailId;
	}
	public void setCompanymailId(String companymailId) {
		CompanymailId = companymailId;
	}
	public String getJobdescription() {
		return Jobdescription;
	}
	public void setJobdescription(String jobdescription) {
		Jobdescription = jobdescription;
	}
	@Override
	public String toString() {
		return "Jobs [JobId=" + JobId + ", JobName=" + JobName + ", CompanyName=" + CompanyName
				+ ", CompanyContactPerson=" + CompanyContactPerson + ", RequiredSkills=" + RequiredSkills
				+ ", CompanymailId=" + CompanymailId + ", Jobdescription=" + Jobdescription + "]";
	}
	public Jobs() {
		
	}
	
	
}
