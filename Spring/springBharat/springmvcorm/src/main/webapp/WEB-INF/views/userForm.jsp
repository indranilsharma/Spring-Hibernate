<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User registration form</title>
</head>
<body>
	<form action="registarUser" method="post">
		<pre>
	  Id: <input type="text" name="userId" value="enter the id" />
	  Name: <input type="text" name="userName" value="enter the name" />
	  Email: <input type="text" name="userEmail" value="enter the email" />
	    <input type="submit" name="registartion" />
	</pre>
	</form>
	
	<br/>${result}
</body>
</html>