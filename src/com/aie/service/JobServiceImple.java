package com.aie.service;

import java.util.List;

import com.aie.beans.AppliedJobs;
import com.aie.beans.Jobs;
import com.aie.dao.JobDao;
import com.aie.dao.JobDaoImple;

public class JobServiceImple implements JobService {

	JobDao jd=new JobDaoImple();
	@Override
	public List<Jobs> fetchAllJobs() {
		List<Jobs>li=jd.FetchJobs();
		return li;
	}
	@Override
	public int SubmitJobForm(Jobs j, String s1, String s2, String s3, String s4) {
	
		int flag=jd.submitApplication( j,  s1,  s2,  s3,  s4);
		return flag;
	}
	@Override
	public List<AppliedJobs> fetchAllAppliedJobs() {
		List<AppliedJobs>li=jd.fetchAllAppliedJob();
		return li;
	}
	
	

}
