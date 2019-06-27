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

import com.techlabs.model.CardType;
import com.techlabs.model.Customer;
import com.techlabs.service.CustomerService;

/**
 * Servlet implementation class AddCustomerController
 */
@WebServlet("/AddCustomerController")
public class AddCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CardType card;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddCustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			RequestDispatcher view = request.getRequestDispatcher("addCustomer.jsp");
			view.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// String id = request.getParameter("id");
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		double balance = Double.parseDouble(request.getParameter("balance"));
		// System.out.println(request.getParameter("card"));
		if (request.getParameter("card").equals("CREDIT")) {
			card = card.CREDIT;
		} else {
			card = card.DEBIT;
		}

		Customer customer = new Customer(101,firstname, lastname, dob, balance, card);
		CustomerService.getInstance().addCustomers(customer);
		
		out.println("Customer Added Successfully");

	}

}
