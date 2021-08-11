<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="addUser">
Enter the Id : <input type="text" name="id"><br><br />
Enter Name : <input type="text" name="name"><br><br />
<input type="submit" /><br />
</form>

<h2>Display User Information</h2>
<form action="displayUser">
Enter the Id : <input type="text" name="id"><br><br />
<input type="submit" /><br />
</form>

<h2>Enter the Details To deleted</h2>
<form action="deleteUser">
Enter the Id : <input type="text" name="id"><br><br />
<input type="submit" /><br />
</form>

<h2>Enter the Details To Update</h2>
<form action="updateUser">
Enter the Id : <input type="text" name="id"><br><br />
<input type="submit" /><br />
</form>
</body>
</html>