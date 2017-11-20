<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Account Info</title>
</head>
<body>
<h1>Summary of accounts held by ${conL[0].customerName}</h1>

<table border="1">
<tr><th>Account Number<th>Account type<th> Account location <th>Balance
<c:forEach var="consumer" items="${conL}">
<tr><td>${consumer.accountNumber }
<td>${consumer.accountType }
<td>${consumer.accountLocation }
<td>${consumer.balance }
<td><a href="BankController?action=2&accNo=${consumer.accountNumber}">Debit</a>
</c:forEach>

</table>
</body>
</html>