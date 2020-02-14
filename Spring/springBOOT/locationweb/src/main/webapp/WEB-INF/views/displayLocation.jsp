<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>allLocation1</h1>
	<table>

		<tr>
			<td>Id</td>
			<td>Code</td>
			<td>Name</td>
			<td>Type</td>
		</tr>

		<c:forEach items="${allLocation1}" var="allLocation1">

			<tr>
				<td>${allLocation1.id}</td>
				<td>${allLocation1.name}</td>
				<td>${allLocation1.code}</td>
				<td>${allLocation1.type}</td>
				<td><a href="deleteLoc?id=${allLocation1.id}">delete</a></td>
				<td><a href="displayUpdateLocation?id=${allLocation1.id}">edit</a></td>
				
			</tr>
		</c:forEach>
	</table>
	
	<a href="show">Add Location</a>
</body>
</html>