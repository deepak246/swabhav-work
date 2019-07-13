<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Contacts are displayed here</h2>
	<h3>
		Total Contacts =
		<s:property value="count" />
	</h3>
	<table border="1" width="80%">
		<thead>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
			<th>Contact No.</th>
			<th>Edit</th>
			<th>Delete</th>
		</thead>
		<tbody>
			<s:iterator status="stat" value="contactsList">
				<tr style="text-align: center">
					<td><s:property value="id" /></td>
					<td><s:property value="name" /></td>
					<td><s:property value="email" /></td>
					<td><s:property value="contactNo" /></td>
					<td><s:a href="edit?id=%{id}">
							<button type="submit" value="Edit">Edit</button>
						</s:a></td>
					<td><s:a href="delete?id=%{id}">
							<button type="submit" value="Delete">Delete</button>
						</s:a></td>
				</tr>
			</s:iterator>
		</tbody>
	</table>
</body>
</html>