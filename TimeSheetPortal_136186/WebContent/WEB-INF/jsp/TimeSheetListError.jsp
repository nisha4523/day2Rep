<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>
		BlueBrains Auditing Services Internal Portal - <br>TimeSheet List
	</h1>
	<hr>

	<form action="listAllTimeSheets.obj" method="post">
		<h4 align="center">
			Enter Employee Id:<input type="text" name="empId"
				pattern="[A-Z]{3}[0-9]{5}" title="Enter valid Employee Id" required>
			<input type="submit" name="submit" value="fetch">
		</h4>
	</form>

	<c:if test="${message ne null }">
		<div id="message">
			<h4>${message }</h4>
		</div>
	</c:if>

	<h4>
		<a href="home.obj">Home</a>
	</h4>
</body>
</html>