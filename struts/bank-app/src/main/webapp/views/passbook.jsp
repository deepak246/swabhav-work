<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
	
<style type="text/css">
	th{
		text-align: center;
	}
</style>
<title>Passbook</title>
</head>
<body>

	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Bank-App</a>
			</div>
			<ul class="nav navbar-nav">
				<li><a href="home">Home</a></li>
				<li><a href="transaction">Transaction</a></li>
				<li class="active"><a href="passbook">Passbook</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span>
						Sign Up</a></li>
				<li><a href="logout"><span
						class="glyphicon glyphicon-log-in"></span> Logout</a></li>
			</ul>
		</div>
	</nav>

	<h1>Passbook Details</h1>

	<table border="1" width="80%">
		<thead>
			<tr>
				<th>Date</th>
				<th>Type</th>
				<th>Amount</th>
			<tr>
		</thead>
		<tbody>
			<s:iterator status="stat" value="passbook">
				<tr style="text-align: center">
					<td><s:property value="date" /></td>
					<td><s:property value="type" /></td>
					<td><s:property value="amount" /></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>