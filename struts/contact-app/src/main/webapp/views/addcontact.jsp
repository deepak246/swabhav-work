<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Contact</title>
<style>
.errorMessage{
	color: red;
	list-style-type: none;
}
</style>
</head>
<body>
	<h3>Contact ADD form</h3>
	
	<s:actionerror />
	<s:form action="validateAdd" method="post">
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="contactNo" label="contactNo"></s:textfield>
		<s:submit value="Add" type="validateAdd"></s:submit>
	</s:form>
</body>
</html>