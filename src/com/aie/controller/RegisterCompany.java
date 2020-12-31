package com.aie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.aie.beans.Company;
import com.aie.service.CompanyService;
import com.aie.service.CompanyServiceImple;


@WebServlet("/RegisterCompany")
public class RegisterCompany extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public RegisterCompany() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Company c=new Company();
		c.setCompanyEmailId(request.getParameter("mail"));
		c.setCompanyname(request.getParameter("cname"));
		c.setCompanyHRName(request.getParameter("hrname"));
		c.setCompanyHR(request.getParameter("mobile"));
		c.setPassword(request.getParameter("pass"));
		
		CompanyService cs=new CompanyServiceImple();
		int flag=cs.RegisterCompany(c);
		if(flag>0) {
			//session.setAttribute("message","successful");
			
			response.sendRedirect("login.jsp");
		}
		else {
			//session.setAttribute("error","registration failed");
			
			response.sendRedirect("Error.jsp");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
