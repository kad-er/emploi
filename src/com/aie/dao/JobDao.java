package com.aie.dao;

import java.util.List;

import com.aie.beans.AppliedJobs;
import com.aie.beans.Jobs;

public interface JobDao {
	
	public List<Jobs> FetchJobs();
	public int submitApplication(Jobs j, String s1, String s2, String s3, String s4);
	public List<AppliedJobs> fetchAllAppliedJob();

}
