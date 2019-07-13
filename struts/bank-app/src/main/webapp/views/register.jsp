<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style type="text/css">
	.errorMessage{
		color: red;
		list-style-type: none;
	}
</style>
</head>
<body>
	<h1>Register page</h1>
	
	<s:actionerror />
	<s:form action="validateRegister" method="post">
		<s:textfield name="username" label="Name"></s:textfield>
		<s:textfield name="password" label="Password"></s:textfield>
		<s:textfield name="cpassword" label="Confirm Password"></s:textfield>
		<s:textfield name="amount" label="amount"></s:textfield>
		<s:submit value="Register"></s:submit>
	</s:form>
</body>
</html>