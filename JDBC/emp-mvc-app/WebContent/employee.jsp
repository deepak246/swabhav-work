<%@ page import="java.util.*"%>
<%@ page import= "com.techlabs.model.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>HELLO</h3>
	
	<%
		List<Employee> employees = (List)request.getAttribute("employees");
		out.print("<table>");
		out.print("<thead><tr><th>EmpNo</th><th>ENAME</th><th>Job</th>");
		out.print("<th>MGR</th><th>HireDate</th><th>Salary</th><th>COMM</th><th>DeptNo</th>");
		out.print("<tbody>");
		//Iterator it = customers.iterator();
		//out.print("Employees = "+employees);
		
		for(Employee e : employees){
			out.print("<tr>");
			out.print("<td>"+  e.getEmpno() + "</td>");
			out.print("<td>"+e.getEname()+"</td>");
			out.print("<td>"+e.getJob()+"</td>");
			out.print("<td>"+e.getMgr()+"</td>");
			out.print("<td>"+e.getHiredate()+"</td>");
			out.print("<td>"+e.getSal()+"</td>");
			out.print("<td>"+e.getComm()+"</td>");
			out.print("<td>"+e.getDeptno()+"</td>");
			out.print("</tr>");
		}
		out.print("</tbody>");
	%>
</body>
</html>