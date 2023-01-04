<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>loginPage</title>
<script>
function LOGIN(e) {
	//alert("Sucess");
	var name = document.getElementById("uname").value;
	var pass = document.getElementById("password").value;
	var role = document.getElementById("loginType").value;
	//alert("Sucess1");
	 /* var uregex = "/[0-9a-zA-Z]{4,}/";
	var pregex = "/[0-9a-zA-Z]{4,}/"; 
	//alert("Sucess10");
	if (!(pass.test(pregex)) && !(uname.test(uregex))) {
		alert("please enter valid username and valid password");
	}
	if (!uname.test(uregex)) {
		alert("please enter valid username");
	}
	if (!pass.test(pregex)) {
		alert("please enter valid password");
	}  
	 if (pass.test(pregex) && uname.test(uregex)) { */  
		var url = "LoginServlet?a=" + name + "&b=" + pass + "&c=" + role;
		alert(name+"    "+pass+"     "+role);
		var request = new XMLHttpRequest(); // Object creation for synchronus & Asynchronus calls 
		var value;
		request.open("POST", url, true);
	//	alert("Sucess2");
		request.send();
		//alert("Sucess3");
		request.onreadystatechange = function() {

			if (request.readyState == 4) {
				//	value=JSON.parse(request.responseText);
				value = request.responseText;
				//alert(value);
				if (value == "Admin") {
					//alert("admin");
					window.location.href = "AdminLoginPage.jsp";
				} else if (value == "Doctor") {
					//	alert("doctor");
					window.location.href = "DoctorLoginPage.jsp"
				} else if (value == "Staff") {
					//alert("Staff")
					window.location.href = "StaffLoginPage.jsp"
				}

			}
		}
	/* }  */ 
	
}
</script>
</head>
<body bgcolor="gold">
	<div align="center">
		<h1>Welcome to Employee & Employer Login page</h1>
		<form action = "LoginServlet" method = "post">
			<table>
				<tr>
					<td><h4>User name:</h4></td>
					<td><input type="text" id="uname" name="uname"
						placeholder="UserName*" required></td>
				</tr>
				<tr>
					<td><h4>Password:</td>
					</h4>
					<td><input type="password" id="password" name="password"
						placeholder="Password*" required></td>
				</tr>
				<tr>
					<td><h4>Login Type:</td>
					</h4>
					<td><select name="loginType" id="loginType">
							<option value="Doctor" id="doctor" name="doctor">Doctor</option>
							<option value="Admin" id="admin" name="admin">Admin</option>
							<option value="Office Staff" id="officeStaff" name="officeStaff">Office
								Staff</option>
					</select></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="button" value="Submit"  onclick = "LOGIN()"></td>
				</tr>
			</table>
		</form>
	</div>
</body>


</html>

<!--  

Valid Email Address
var uregex = /[\w-\.]+@([\w-]+\.)+[\w-]{2,4}/;

 pattern="[a-z0-9._%+-]+@[a-z0-9.-]+\.[a-z]{2, 4}$"


<form action = "loginAuthorise" method = "post">
			<label for="uname">User name:</label><br> <input type="text"
				id="uname" name="uname"><br> <br> 
				<label
				for="password">Password:</label><br> <input type="password"
				id="password" name="password"><br> <br> <label
				for="role">Login Type:</label><br> <select name="LoginType"
				id="LoginType">
				<option href ="DoctorLoginPage.jsp" value="Doctors">Doctor</option>
				<option href ="AdminLoginPage.jsp" value="Admin">Admin</option>
				<option href ="StaffLoginPage.jsp" value="Office Staffs">Office Staff</option>
			</select> <br>
			<br> <input type="submit" value="Submit">
		</form>
		
		
		<form action = "loginAuthorise" method = "post">
		<table>
		<tr>
		<td ><h4>User name:</h4></td> <td><input type="text"
				id="uname" name="uname"></td></tr>
				<tr>
		<td ><h4>Password:</td></h4><td> <input type="password"
				id="password" name="password"></td></tr>
				<tr>
		<td ><h4>Login Type:</td></h4><td> <select name="LoginType"
				id="LoginType">
				<option href ="DoctorLoginPage.jsp" value="Doctors">Doctor</option>
				<option href ="AdminLoginPage.jsp" value="Admin">Admin</option>
				<option href ="StaffLoginPage.jsp" value="Office Staffs">Office Staff</option>
			</select></td> </tr>
			<tr>
		<td ></td><td >
			 <input type="submit" value="Submit"></td></tr>
			</table>
		</form>
		
	
	
	Rajesh Code	
		var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function () {
          if (this.readyState == 4 && this.status == 200) {
            // var x=JSON.parse(xhttp.responseText);
            var x = xhttp.responseText;
            alert("success" + x);
          }
        };
        xhttp.open("GET", "registerServlet", true);
        xhttp.send();

      


		
		
		
		
		
-->

