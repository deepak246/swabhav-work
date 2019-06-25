<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String firstname, lastname, dob, id, balance;
		
		firstname = request.getParameter("firstname");
		lastname = request.getParameter("lastname");
		dob = request.getParameter("dob");
		//id = request.getParameter("id");
		balance = request.getParameter("balance");
		
		if(firstname==null && lastname==null && dob==null && balance==null){
			firstname = "";
			lastname = "";
			dob = "";
			id = "";
			balance = "";
		}
		
	%>
	<form action="AddCustomerController" method="POST">
		FirstName:<br> <input type="text" name="firstname" value='<%=firstname%>'><br>
		LastName: <br><input type="text" name="lastname" value='<%=lastname%>'><br>
		DOB: <br><input type="text" name="dob" value='<%=dob%>'><br>
		Balance: <br><input type="text" name="balance" value='<%=balance%>'><br>
		Card Type: <br><select name="card">
			<option value="CREDIT">CREDIT</option>
			<option value="DEBIT">DEBIT</option>
		</select><br><br>
		<input type="submit" name="submit"><br>
	</form>
</body>
</html>