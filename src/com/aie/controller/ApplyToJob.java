package com.aie.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ApplyToJob")
public class ApplyToJob extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public ApplyToJob() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Jid=request.getParameter("id");
		String title=request.getParameter("title");
		String Company=request.getParameter("comp");
		String cmail=request.getParameter("mail");
		
		HttpSession session =request.getSession();
		
		String Umail=(String) session.getAttribute("mail");
		request.setAttribute("title", title);
		request.setAttribute("jid", Jid);
		request.setAttribute("Company", Company);
		request.setAttribute("cmail", cmail);
		request.setAttribute("umail", Umail);
		
		request.getRequestDispatcher("Apply.jsp").forward(request, response);
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
