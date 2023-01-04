<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>StaffLoginPage</title>
</head>
<body>
	
	<header>
		<nav>
			<ul>
				<li>

					<div class="dropdown">
						<a href="#profile" class="dropbtn" name = "profile" id = "profile"> Profile </a>
						<div class="dropdown-content">
							<a href="viewProfile.jsp" name = "Viewprofile" id = "Viewprofile">View Profile</a> 
							<a href="editProfile.jsp" name = "editProfile" id = "editProfile">Edit Profile</a> 
						</div>
					</div>
				</li>
				<li>
					<div class="dropdown">
						<a href="#ManageAppointments" class="dropbtn" name = "manageAppointments" id = "manageAppointments"> Manage Appointments </a>
						<div class="dropdown-content">
						<a href="bookAppointments.jsp" name = "bookAppointments" id = "bookAppointments">Book Appointments</a> 
							<a href="viewAppointments.jsp" name = "viewAppointments" id = "viewAppointments">View Appointments</a> 
							
						</div>
					</div>
				</li>
				<li>
					<div class="dropdown" >
						<a href="#patientReports" class="dropbtn" name = "patientReports" id = "patientReports"> Manage Patient Reports </a>
						<div class="dropdown-content">
							<a href="inPatientReport.jsp" name = "inPatientReport" id = "inPatientReport">In-Patients Reports</a> 
							<a href="outPatientReport.jsp" name = "outPatientReport" id = "outPatientReport">Out-Patients Reports</a>
						</div>
					</div>
				</li>
				<li >
				<div class="dropdown" >
						<a href="homePage.html" class = "signout" name = "logOut" id = "logOut"> Log Out </a>
				</div>
				</li>
			</ul>
		</nav>
	</header>
	
	
	<p >
<img src = "getting-business-finances-in-order.jpg"  />
</p>
	<p align = "center">
&lt;&lt;&lt; &copy; Vignesh &gt;&gt;&gt;
</p>
</body>
</html>