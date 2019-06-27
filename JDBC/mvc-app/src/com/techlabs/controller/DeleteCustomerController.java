package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

/**
 * Servlet implementation class deleteCustomerController
 */
@WebServlet("/DeleteCustomerController")
public class DeleteCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int id;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteCustomerController() {
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

		id = Integer.parseInt(request.getParameter("id"));
		CustomerService.getInstance().deleteCustomerById(id);
		out.println("customer deleted");
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
