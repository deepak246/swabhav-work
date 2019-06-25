package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ApplicationController
 */
@WebServlet("/application")
public class ApplicationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ApplicationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		ServletContext application = getServletContext();
		HttpSession session = request.getSession();
		if (application.getAttribute("count") == null) {
			application.setAttribute("count", 0);
		}

		Object oldvalue = application.getAttribute("count");
		int oldvalueInt = (int) oldvalue;
		int newvalue = oldvalueInt + 1;
		application.setAttribute("count", newvalue);

		out.println("<h1>Old Value = " + oldvalue + "</h1>");
		out.println("<h1>New Value = " + newvalue + "</h1>");
		out.println("Session Id: " + session.getId());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
