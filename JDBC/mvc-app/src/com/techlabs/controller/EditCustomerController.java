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
 * Servlet implementation class EditCustomerController
 */
@WebServlet("/EditCustomerController")
public class EditCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CardType card;
	private String id;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EditCustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		id = request.getParameter("id");
		Customer customer = CustomerService.getInstance().getCustomerById(id);
		request.setAttribute("editCustomer", customer);
		RequestDispatcher view = request.getRequestDispatcher("editCustomer.jsp");
		view.forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String firstname = request.getParameter("firstname");
		String lastname = request.getParameter("lastname");
		String dob = request.getParameter("dob");
		double balance = Double.parseDouble(request.getParameter("balance"));
		if (request.getParameter("card").equals("CREDIT")) {
			card = card.CREDIT;
		} else {
			card = card.DEBIT;
		}

		if (CustomerService.getInstance().getCustomerById(id) != null) {
			Customer customer = CustomerService.getInstance().getCustomerById(id);
			customer.setFirstname(firstname);
			customer.setLastname(lastname);
			customer.setCard(card);
			customer.setBalance(balance);
			customer.setDob(dob);
			out.println("Customer Updated Successfully");
			return;
		}

	}

}
