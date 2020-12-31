package com.aie.dao;

import com.aie.beans.Employee;

public interface EmployeeDAO {

	public int addEmployee(Employee e);
	public void CheckEmployee(String User,String Password);
}
