<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Crate Location</title>
</head>
<body>

	<form action="saveLoc" method="post">
		<pre>
		Id:<input type="text" name="id">
		 Code:<input type="text" name="code">
		 Name:<input type="text" name="name">
         Type:Urban:<input type="radio" name="type" value="Urban">
		       Rural:<input type="radio" name="type" value="Rural"> 
		 <input type="submit" name="save">
         </pre>
	</form>
	${message}
	
	<a href="display">View ALl</a> 
</body>
</html>