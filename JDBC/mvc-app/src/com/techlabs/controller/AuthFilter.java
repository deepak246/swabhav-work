package com.techlabs.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

import com.techlabs.service.CustomerService;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter("/LoginController")
public class AuthFilter implements Filter {

	/**
	 * Default constructor.
	 */
	public AuthFilter() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
		PrintWriter out = response.getWriter();
		if (req.getParameterNames().hasMoreElements()) {
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			
			String usernameExpected = CustomerService.getInstance().getUsername("admin");
			String passwordExpected = CustomerService.getInstance().getPassword("admin");
			
			if (username.equals(usernameExpected) && password.equals(passwordExpected)) {
				chain.doFilter(request, response);
			} else {
				out.println("Invalid Credentials");
			}

		}
		else {
			chain.doFilter(request, response);
		}

	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
