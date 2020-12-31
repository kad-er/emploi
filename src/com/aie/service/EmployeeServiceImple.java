package com.aie.service;

import com.aie.beans.Employee;
import com.aie.dao.EmployeDAOImple;
import com.aie.dao.EmployeeDAO;

public class EmployeeServiceImple implements EmployeeService{

	EmployeeDAO ed;
	@Override
	public int RegisterEmployee(Employee emp) {
		
		System.out.println("Service called");
		ed=new EmployeDAOImple();
		int flag=ed.addEmployee(emp);
		return flag;
		
		
	}

	

	@Override
	public void ApplyforJob(String MailId, String JobId) {
	
		
	}

}
