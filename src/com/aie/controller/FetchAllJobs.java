package com.aie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aie.beans.Jobs;
import com.aie.service.JobService;
import com.aie.service.JobServiceImple;


@WebServlet("/FetchAllJobs")
public class FetchAllJobs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public FetchAllJobs() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		JobService js=new JobServiceImple();
		List<Jobs>job=js.fetchAllJobs();
		request.setAttribute("JobList",job);
		request.getRequestDispatcher("AllPostedJobs.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
