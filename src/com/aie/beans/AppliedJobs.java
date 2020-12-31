package com.aie.beans;

public class AppliedJobs {

	private int JobId;
	private String emp_mailid;
	private String empName;
	private String jobitle;
	private String companyName;
	private String companyMail;
	private String status;

	public int getJobId() {
		return JobId;
	}

	public void setJobId(int jobId) {
		JobId = jobId;
	}

	public String getEmp_mailid() {
		return emp_mailid;
	}

	public void setEmp_mailid(String emp_mailid) {
		this.emp_mailid = emp_mailid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getJobitle() {
		return jobitle;
	}

	public void setJobitle(String jobitle) {
		this.jobitle = jobitle;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyMail() {
		return companyMail;
	}

	public void setCompanyMail(String companyMail) {
		this.companyMail = companyMail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public AppliedJobs() {

	}

	@Override
	public String toString() {
		return "AppliedJobs [JobId=" + JobId + ", emp_mailid=" + emp_mailid + ", empName=" + empName + ", jobitle="
				+ jobitle + ", companyName=" + companyName + ", companyMail=" + companyMail + ", status=" + status
				+ "]";
	}

}
