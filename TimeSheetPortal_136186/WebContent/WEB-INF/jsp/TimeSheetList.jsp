<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
th, td {
	padding: 8px;
	text-align: center;
	border-bottom: 1px solid #ddd;
}
</style>
</head>
<body>
	<h1>BlueBrains Auditing Services Internal Portal - TimeSheets List
	</h1>
	<hr>
	<form action="listAllTimeSheets.obj" method="post">
		<h4 align="center">
			Enter Employee Id:<input type="text" name="empId"
				pattern="[A-Z]{3}[0-9]{5}" title="Enter valid Employee Id" required>
			<input type="submit" name="submit" value="fetch">
		</h4>
	</form>


	<c:if test="${timeSheetList ne null}">
		<div id="list">
			<table align="center">
				<tr>
					<th rowspan="2">EmpId</th>
					<th rowspan="2">Date</th>
					<th colspan="8" align="center">Hour Wise Activities</th>
				</tr>
				<tr>
					<th>1<sup>st</sup></th>
					<th>2<sup>nd</sup></th>
					<th>3<sup>rd</sup></th>
					<th>4<sup>th</sup></th>
					<th>5<sup>th</sup></th>
					<th>6<sup>th</sup></th>
					<th>7<sup>th</sup></th>
					<th>8<sup>th</sup></th>
				</tr>

				<c:forEach items="${timeSheetList}" var="timeSheet">
					<tr>
						<td>${timeSheet.empId}</td>
						<td>${timeSheet.timeSheetDate}</td>
						<td>${timeSheet.hour1}</td>
						<td>${timeSheet.hour2}</td>
						<td>${timeSheet.hour3}</td>
						<td>${timeSheet.hour4}</td>
						<td>${timeSheet.hour5}</td>
						<td>${timeSheet.hour6}</td>
						<td>${timeSheet.hour7}</td>
						<td>${timeSheet.hour8}</td>
					</tr>
				</c:forEach>

			</table>
		</div>
	</c:if>
	<h4>
		<a href="home.obj">Home</a>
	</h4>

</body>
</html>