<%@ page import="java.util.*"%>
<%@ page import= "com.techlabs.model.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Customer</title>

</head>
<body>

	<%
		List<Customer> customers = (List) request.getAttribute("customers");
		out.print("<table>");
		out.print("<thead><tr><th>Id</th><th>FirstName</th><th>LastName</th>");
		out.print("<th>DOB</th><th>Balance</th><th>Card Type</th><th>Edit</th><th>Delete</th>");
		out.print("<tbody>");
		//Iterator it = customers.iterator();
		
		for(Customer c : customers){
			out.print("<tr>");
			out.print("<td>"+  c.getId() + "</td>");
			out.print("<td>"+c.getFirstname()+"</td>");
			out.print("<td>"+c.getLastname()+"</td>");
			out.print("<td>"+c.getDob()+"</td>");
			out.print("<td>"+c.getBalance()+"</td>");
			out.print("<td>"+c.getCard()+"</td>");
			out.print("<td><a href='EditCustomerController?id="+c.getId()+"'>Edit</a></td>");
			out.print("<td><a href='DeleteCustomerController?id="+c.getId()+"'>Delete</a></td>");
			out.print("</tr>");
		}
		out.print("</tbody>");
	%>
</body>
</html>