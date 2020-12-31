package com.aie.service;

import com.aie.beans.Employee;

public interface EmployeeService {

	public int RegisterEmployee(Employee emp);
	
	public void ApplyforJob(String MailId,String JobId);
	
}
