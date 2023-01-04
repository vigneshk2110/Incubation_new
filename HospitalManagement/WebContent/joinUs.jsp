<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Join Us</title>
<style>
body {
	background-image: url("join.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}
</style>
</head>
<body bgcolor = "yellow">
<h2>Join to be a part of a great Institution for a life cherishing journey.</h2>
<h4>Please fill the below details to submit your Application.</h4>

	<form action="applicationSucessful.jsp" >
		<label for="name" style="font-size:20px"><b>Name:</b></label><br> <input type="text" id="name"
			name="name" ><br>
				<br>  <label for="contact" style="font-size:20px"><b>Contact:</b></label><br>
		
		<input type="number" id="contact" name="contact" ><br>
		<br> <label for="role" style="font-size:20px"><b>Role:</b></label><br>
		 <select
			name="LoginType" id="LoginType">
			<option value="Doctors">Doctor</option>
			<option value="Nurse">Staff Nurse</option>
			<option value="Office Staffs">Office Staff</option>
			<option value="Business Partner">Business Partner</option>
		</select>
		<br><br>
		<label for="role" style="font-size:20px"><b>Upload Resume:</b></label><br>
		<input name="userfile" type="file" accept="application/pdf" />
<br><br>
		 <input type="submit" value="Submit">
	</form>
	
	

</body>
</html>