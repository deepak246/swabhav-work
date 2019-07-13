<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
<style>
.errorMessage{
	color: red;
	list-style-type: none;
}
</style>
</head>
<body>
	<h1>edit contact</h1>
	
	<s:actionerror />
	<s:form action="validateEdit" method="post">
		<s:textfield name="name" label="Name"></s:textfield>
		<s:textfield name="email" label="Email"></s:textfield>
		<s:textfield name="contactNo" label="contactNo"></s:textfield>
		<s:submit value="Edit" type="validateEdit"></s:submit>
	</s:form>
</body>
</html>