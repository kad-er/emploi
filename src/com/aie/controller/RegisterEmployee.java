package com.aie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aie.beans.Employee;
import com.aie.service.EmployeeService;
import com.aie.service.EmployeeServiceImple;


@WebServlet("/RegisterEmployee")
public class RegisterEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public RegisterEmployee() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//fetch data from request and store in Employeee
		Employee e=new Employee();
		e.setFirstName(request.getParameter("fname"));
		e.setLastName(request.getParameter("lname"));
		e.setMailid(request.getParameter("mail"));
		e.setMobileNo(request.getParameter("mobile"));
		e.setPassword(request.getParameter("pass"));
		e.setCurrentQualifications(request.getParameter("qual"));
		e.setCurrentRole(request.getParameter("erole"));
		e.setExpirence(request.getParameter("exp"));
		e.setCurrentCompany(request.getParameter("ecompany"));
		e.setEducation_X(request.getParameter("ex"));
		e.setEducation_XI(request.getParameter("exi"));
		e.setEducation_Degree(request.getParameter("cdegree"));
		e.setSkills(request.getParameter("skills"));
		
		
		
		//call the respective Service to register
		EmployeeService es=new EmployeeServiceImple();
		int flag=es.RegisterEmployee(e);
		
		//HttpSession session=request.getSession();  
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
		
		doGet(request, response);
	}

}
