<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Trainee</title>
</head>
<body>
<div>

		<h1>Trainee Details</h1>

		<c:if test="${traineeList ne null}">
			<table border="2">
				<tr>
					<th>Trainee Id</th>
					<th>Trainee Name</th>
					<th>Trainee Location</th>
					<th>Trainee Domain</th>
				</tr>
				<c:forEach items="${traineeList}" var="trainee">
					<tr>
						<td>${trainee.traineeId}</td>
						<td>${trainee.traineeName}</td>
						<td>${trainee.traineeDomain}</td>
						<td>${trainee.traineeLocation}</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
	</div>
</body>
</html>