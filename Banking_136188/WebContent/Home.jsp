<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home</title>
</head>
<body>
<h1>Welcome to MyBank's Online Banking</h1>
<form action="BankController?action=1" method="post">
Enter Customer Name <input type="text" name="cname" required pattern="^[A-Za-z\s]{1,}$" title="Only Characters">
<br>
<input type="submit" name="submit" value="Get All Accounts">
</form>
</body>
</html>