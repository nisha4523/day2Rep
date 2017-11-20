<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form name="frm" method="post" action="">
	Enter Product id: <input type="text" name="prodId" required pattern="[1-9]{1,3}"/><br>
	Enter Product name: <input type="text" name="prodName" required pattern="[A-Za-z]+"/><br>
	Enter Product Price: <input type="text" name="prodPrice" required pattern="[1-9]{1}[0-9]{3,}"/><br>
	
	<input type="submit" value="Add Product" />
</form>

</body>
</html>