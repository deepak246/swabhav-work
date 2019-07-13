<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<style type="text/css">
.errorMessage {
	color: red;
	list-style-type: none;
}
</style>
</head>
<body>
	<h1>Login</h1>

	<s:actionerror />
	<s:form action="validateLogin" method="post">
		<s:textfield name="model.username" label="UserName"></s:textfield>
		<s:password name="model.password" label="Password"></s:password>
		<s:submit value="Login"></s:submit>
	</s:form>

</body>
</html>