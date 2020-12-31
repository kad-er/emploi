package com.aie.beans;

public class Employee {

private String	mailid;
private String FirstName;
private String LastName;
private String MobileNo;
private String password;
	  private String CurrentQualifications;
	  private String CurrentRole;
	  private String expirence;
	  private String Education_X;
	  private String Education_XI;
	  private String Education_Degree;
	  private String CurrentCompany;
	  private String Skills;
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCurrentQualifications() {
		return CurrentQualifications;
	}
	public void setCurrentQualifications(String currentQualifications) {
		CurrentQualifications = currentQualifications;
	}
	public String getCurrentRole() {
		return CurrentRole;
	}
	public void setCurrentRole(String currentRole) {
		CurrentRole = currentRole;
	}
	public String getExpirence() {
		return expirence;
	}
	public void setExpirence(String expirence) {
		this.expirence = expirence;
	}
	public String getEducation_X() {
		return Education_X;
	}
	public void setEducation_X(String education_X) {
		Education_X = education_X;
	}
	public String getEducation_XI() {
		return Education_XI;
	}
	public void setEducation_XI(String education_XI) {
		Education_XI = education_XI;
	}
	public String getEducation_Degree() {
		return Education_Degree;
	}
	public void setEducation_Degree(String education_Degree) {
		Education_Degree = education_Degree;
	}
	public String getCurrentCompany() {
		return CurrentCompany;
	}
	public void setCurrentCompany(String currentCompany) {
		CurrentCompany = currentCompany;
	}
	public String getSkills() {
		return Skills;
	}
	public void setSkills(String skills) {
		Skills = skills;
	}
	public Employee() {
		
	}
	@Override
	public String toString() {
		return "Employee [mailid=" + mailid + ", FirstName=" + FirstName + ", LastName=" + LastName + ", MobileNo="
				+ MobileNo + ", password=" + password + ", CurrentQualifications=" + CurrentQualifications
				+ ", CurrentRole=" + CurrentRole + ", expirence=" + expirence + ", Education_X=" + Education_X
				+ ", Education_XI=" + Education_XI + ", Education_Degree=" + Education_Degree + ", CurrentCompany="
				+ CurrentCompany + ", Skills=" + Skills + "]";
	}
	  
	  
	
}
