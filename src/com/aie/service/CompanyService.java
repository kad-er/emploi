package com.aie.service;

import com.aie.beans.Company;
import com.aie.beans.Jobs;


public interface CompanyService {
	public int RegisterCompany(Company c);
	public int addJob(Jobs j,String mail);
	
}
