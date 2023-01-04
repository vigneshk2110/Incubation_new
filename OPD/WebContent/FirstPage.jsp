<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>WelcomePage</title>
</head>
<body>
	<h1>Welcome to OP Portal</h1>
	<form action="RegisterOrLogin" method="post">
		
		<table>
			<tr>
				<td>Patient Name:</td>
				<td><input type="text" name="uName"></td>
			</tr>
			<tr>
				<td>Patient Phone:</td>
				<td><input type="tel" name="phone" pattern="[0-9]{3,10}"></td>
			</tr>
			<tr>
				<td><br></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Register" ></td>
				
			</tr>
		</table>
	</form>
	<h2>View Patient History & Current Status</h2>
	<form action="Display" method="post">
		<table>
			<tr>
				<td></td>
				<td><input  type="submit" value="Display" ></td>
			</tr>
		</table>
	</form>

</body>
</html>