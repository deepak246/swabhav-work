package com.techlabs.controller;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class MutationAuthFilter
 */
@WebFilter({ "/AddCustomerController", "/EditCustomerController", "/DeleteCustomerController" })
public class MutationAuthFilter implements Filter {

    /**
     * Default constructor. 
     */
    public MutationAuthFilter() {
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
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		String url = "";
		String reqURL = req.getRequestURI();
		String[] arrOfStr = reqURL.split("/");
		url = url + arrOfStr[2];
		
		if(req.getParameter("id")!=null) {
			System.out.println("id = "+req.getParameter("id"));
			url = url + "?id=" + Integer.parseInt(req.getParameter("id"));
		}
		HttpSession session = req.getSession();
		if(!session.getAttribute("username").equals("")) {
			chain.doFilter(request, response);
			return;
		}
		request.setAttribute("requestedURL", url);
		RequestDispatcher rd =request.getRequestDispatcher("LoginController");
		rd.forward(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
