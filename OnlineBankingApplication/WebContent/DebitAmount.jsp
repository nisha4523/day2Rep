<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%String acNo=request.getParameter("account"); %>
<h2 align="center">Debit the amount from <%=acNo%> Account</h2>
<form action="debit.htm" method="post">
<h3 align="center">Enter Amount : <input type="number" name="amount" min=1 max=${balance }></h3>
<br>
<input type="hidden" name="acNo" value="<%=acNo%>"/>
<h3 align="center"><input type="submit" name="submit"></h3>
</form>
</body>
</html>