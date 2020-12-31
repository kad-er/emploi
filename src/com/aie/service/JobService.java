package com.aie.service;

import java.util.List;

import com.aie.beans.AppliedJobs;
import com.aie.beans.Jobs;

public interface JobService {

	public List<Jobs> fetchAllJobs();
	public int SubmitJobForm(Jobs j,String s1, String s2, String s3, String  s4);
	public List<AppliedJobs> fetchAllAppliedJobs();
	
}
