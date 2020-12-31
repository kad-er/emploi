package com.aie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aie.beans.Jobs;
import com.aie.service.CompanyService;
import com.aie.service.CompanyServiceImple;

@WebServlet("/AddJob")
public class AddJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public AddJob() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String mail=(String) session.getAttribute("mail");
		
		String jtitle=request.getParameter("jtitle");
		String reqskills=request.getParameter("reqskills");
		String desc=request.getParameter("desc");
		
		Jobs j=new Jobs();
		j.setJobName(jtitle);
		j.setRequiredSkills(reqskills);
		j.setJobdescription(desc);
		j.setCompanymailId(mail);
		
		CompanyService cs=new CompanyServiceImple();
		int flag=cs.addJob(j, mail);
		if(flag>0) {
			response.sendRedirect("CompanyDashboard.jsp");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
