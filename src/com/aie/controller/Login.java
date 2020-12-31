package com.aie.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.aie.service.LoginService;
import com.aie.service.LoginServiceImple;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Login() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String mail=request.getParameter("mail");
		String pass=request.getParameter("pass");
		
		LoginService ls=new LoginServiceImple();
		List<String>li=ls.checkUser(mail, pass);
		HttpSession session=request.getSession();
		if(li!=null) {
		if(li.get(1).equals("Success")) {//0,1
			session.setAttribute("mail", mail);
			System.out.println(li.get(0));
			if(li.get(0)!=null && li.get(0).equals("ROLE_EMPLOYEE")) {
				
			response.sendRedirect("EmployeeDashboard.jsp");}
			else
			if(li.get(0)!=null && li.get(0).equals("ROLE_COMPANY")){
				response.sendRedirect("CompanyDashboard.jsp");
			}
			else
				if(li.get(0)!=null && li.get(0).equals("ROLE_HR"))
			{
				response.sendRedirect("HR_DashBoard.jsp");
			}
				else {
					response.sendRedirect("Error.jsp");
				}
		}
		else {
			response.sendRedirect("Error.jsp");
		}
		}else {
			response.sendRedirect("Error.jsp");
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
