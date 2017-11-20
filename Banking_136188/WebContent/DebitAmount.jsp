<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Debit Amount</title>
</head>
<body>
<h3>Debit the Amount From<<${accNo}>> Account</h3>
<form action="BankController?action=3&accNo=${accNo}" method="post">
Enter Amount :<input type="number" name="amount" required min="1" title="greater than 0.01">
<br>
<input type="submit" name="submit" value="Debit">
</form>
</body>
</html>