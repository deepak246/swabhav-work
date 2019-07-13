<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
<style>
	.errorMessage{
		color: red;
		list-style-type: none;
	}
</style>
</head>
<body>
	<h1>Login Page</h1>

	<s:actionerror />
	<s:form action="validate" method="post">
		<s:textfield name="username" label="Username"></s:textfield>
		<s:password name="password" label="Password"></s:password>
		<s:submit value="login"></s:submit>
	</s:form>
</body>
</html>