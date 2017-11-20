<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Welcome to MyBank's Online Banking</h1>
<form action="display.htm" method="post">
<h3 align="center">Enter Customer Name <input type="text" name="custName" pattern="^[A-Za-z ]*$" title="Customer Name include characters only" required></h3>
<h3 align="center"><input type="submit" name="submit" value="Get All Accounts"></h3>
</form>
</body>
</html>