<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register-Member</title>
</head>
<body>
<h1>
Member Register
</h1>
<form action = "Register" method = "post">
<div>
<table >
<tr><td>User Name:</td><td><input type="text" name = "uName"></td></tr>
<tr><td>PassWord:</td><td><input type="password" name = "pWd"></td></tr>
<tr><td>Email:</td><td><input type= "email" name = "email"></td></tr>
<tr><td>Phone:</td><td><input type="tel" name="phone" pattern="[0-9]{10}"></td></tr>
<tr><td><br></td></tr>
<tr><td></td><td><input type= "submit" value = "Register"></td></tr>
</table>
</div>
</form>
</body>
</html>