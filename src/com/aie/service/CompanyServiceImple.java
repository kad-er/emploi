package com.aie.service;

import com.aie.beans.Company;
import com.aie.beans.Jobs;
import com.aie.dao.CompanyDao;
import com.aie.dao.CompanyDaoImple;

public class CompanyServiceImple implements CompanyService {

	CompanyDao cd=new CompanyDaoImple();
	@Override
	public int RegisterCompany(Company c) {
		
		
		int flag=cd.addCompany(c);
		return flag;
	}

	@Override
	public int addJob(Jobs j,String mail) {
		int flag=cd.addJob(j, mail);
		return flag;
	}

}
