<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- 
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
</link>
-->
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<title>Transaction</title>
<style type="text/css">
.errorMessage {
	color: red;
	list-style-type: none;
}
</style>
</head>
<body>
	<!-- 
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Bank-App</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="home">Home</a></li>
				<li class="active"><a href="transaction">Transaction</a></li>
				<li><a href="passbook">Passbook</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="logout"><span
						class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			</ul>
		</div>
	</nav>
-->

	<h1>Perform Transaction</h1>

	<s:actionerror />
	<s:form action="validateTransaction" method="post">
		<s:textfield name="amount" label="Amount"></s:textfield>
		<s:radio label="Transaction Type" name="type"
			list="#{'D':'Deposit','W':'Withdraw'}" />
		<s:submit value="Submit"></s:submit>
	</s:form>

</body>
</html>