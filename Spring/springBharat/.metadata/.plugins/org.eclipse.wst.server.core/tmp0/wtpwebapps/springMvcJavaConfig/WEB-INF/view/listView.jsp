<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Hello</title>
</head>
<body>

	<%
		Integer id = (Integer) request.getAttribute("id");
		String name = (String) request.getAttribute("name");
		String dept = (String) request.getAttribute("Dept");
		out.println("ID: " + id);
		out.println("Name: " + name);
		out.println("dept: " + dept);
	%>
	<br /> 
	Id:
	<b>${id}</b> 
	 Name
	<b>${name}</b> 
	dept:
	<b>${dept}</b>
</body>
</html>