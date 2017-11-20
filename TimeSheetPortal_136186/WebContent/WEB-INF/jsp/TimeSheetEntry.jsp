<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
#form {
    border-radius: 25px;
    border: 2px solid #73AD21;
    padding: 20px; 
    margin-right : 100px;
    margin-left : 100px;
}

th, td {
    padding: 8px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

</style>
<title>Insert title here</title>
</head>
<body>
	<h1>
		<b>BlueBrains Auditing Services Internal Portal - TimeSheet Entry</b>
	</h1>
	<hr>
	<div id="form">
	<form:form action="addTimeSheet.obj" modelAttribute="timeSheet"
		method="post">
		<table align="center">
			<tr>
				<td><form:label path="empId">Employee ID:</form:label></td>
				<td><form:input path="empId" required="true" /></td>
				<td><form:errors path="empId" style="color:red" /></td>
			</tr>
			<tr>
				<td><form:label path="timeSheetDate">Time Sheet Date:</form:label></td>
				<td><form:input type="date" path="timeSheetDate"
						required="true" value="${date}" max="${date}" /></td>
			</tr>
			<tr>
				<td><form:label path="hour1">First Hour Activity</form:label></td>
				<td><form:select path="hour1">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="hour2">Second Hour Activity</form:label></td>
				<td><form:select path="hour2">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="hour3">Third Hour Activity</form:label></td>
				<td><form:select path="hour3">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="hour4">Fourth Hour Activity</form:label></td>
				<td><form:select path="hour4">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="hour5">Fifth Hour Activity</form:label></td>
				<td><form:select path="hour5">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="hour6">Sixth Hour Activity</form:label></td>
				<td><form:select path="hour6">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="hour7">Seventh Hour Activity</form:label></td>
				<td><form:select path="hour7">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td><form:label path="hour8">Eighth Hour Activity</form:label></td>
				<td><form:select path="hour8">
						<form:options items="${hourActivity}" />
					</form:select></td>
			</tr>
			<tr>
				<td colspan="2" align="right"><form:button type="submit">Save</form:button></td>
			</tr>
		</table>
	</form:form>
	</div>
</body>
</html>