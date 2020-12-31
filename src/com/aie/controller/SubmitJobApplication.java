package com.aie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aie.beans.Jobs;
import com.aie.service.JobService;
import com.aie.service.JobServiceImple;


@WebServlet("/SubmitJobApplication")
public class SubmitJobApplication extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SubmitJobApplication() {
        super();
 
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Jobs j=new Jobs();
		JobService js=new JobServiceImple();
		j.setJobId(Integer.parseInt((request.getParameter("jid"))));
		j.setCompanyName(request.getParameter("Cname"));
		j.setCompanymailId(request.getParameter("Cmail"));
		j.setJobName(request.getParameter("Jtitle"));
		String umail=request.getParameter("umail");
		String fname=request.getParameter("Fname");
		String mobile=request.getParameter("Mobile");
		String skills=request.getParameter("skill");
		
		int flag=js.SubmitJobForm(j, umail, fname, mobile, skills);
		if(flag>0) {
			response.sendRedirect("FetchAllJobs");
		}else {
			response.sendRedirect("EmployeeDashboard.jsp");
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
