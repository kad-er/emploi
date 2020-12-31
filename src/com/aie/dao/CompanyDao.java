package com.aie.dao;

import com.aie.beans.Company;
import com.aie.beans.Jobs;

public interface CompanyDao {

	public int addCompany(Company c);
	public int addJob(Jobs j,String mail);
}
