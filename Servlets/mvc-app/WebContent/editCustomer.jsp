
<%@ page import= "com.techlabs.model.Customer"%>
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
		String firstname, lastname, dob, id, balance,card;
	
		Customer customer = (Customer) request.getAttribute("editCustomer");

		firstname = customer.getFirstname();
		lastname = customer.getLastname();
		dob = customer.getDob();
		//id = customer.getId();
		double cbalance = customer.getBalance();
		balance = String.valueOf(cbalance);
		card = String.valueOf(customer.getCard());
		
	%>
	<form action="EditCustomerController" method="POST">
		FirstName:<br> <input type="text" name="firstname" value='<%=firstname%>'><br>
		LastName: <br><input type="text" name="lastname" value='<%=lastname%>'><br>
		DOB: <br><input type="text" name="dob" value='<%=dob%>'><br>
		Balance: <br><input type="text" name="balance" value='<%=balance%>'><br>
		Card Type: <br><select name="card">
			<option selected hidden value='<%=card%>'><% out.println(card); %></option>
			<option value="CREDIT">CREDIT</option>
			<option value="DEBIT">DEBIT</option>
		</select><br><br>
		<input type="submit" name="submit"><br>
	</form>

</body>
</html>