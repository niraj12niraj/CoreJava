 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>JLC BookStore</h1>
<h2>Book Search</h2>
<form action="searchbooks.jlc"method="post">
<table><tr><td><h2>Select Category</h2></td></tr>
<tr><td><select name="category">
<option value="Select">select</option>
<option value="Java">Java</option>
<option value="Testing">Testing</option>
<option value=".Net">.Net</option>
<option value="Sap">Sap</option>
</select></td></tr>
<tr><td><input type="submit"value="SearchBooks"/></td></tr>
</table>
</form>
</center>
</body>
</html>