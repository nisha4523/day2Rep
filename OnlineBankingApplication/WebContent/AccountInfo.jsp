<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Summary of accounts held by <c:out value="${Name}"></c:out></h2>
<table border=1 align="center"><tr><th>Account Number</th><th>Account Type</th><th>Account Location</th><th>Balance</th><th></th></tr>
<c:forEach items="${list}" var="account">
<tr><td>${account.accountNumber}</td><td>${account.accountType}</td><td>${account.accountLocation}</td><td>${account.balance}</td><td><a href="DebitAmount.jsp?account=${account.accountNumber}">Debit</a></td></tr>
</c:forEach>
</table>
</body>
</html>