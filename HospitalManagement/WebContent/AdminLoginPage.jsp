<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="UTF-8">
<title>adminMainPage</title>
<style>
body {
	background-image: url("getting-business-finances-in-order.jpg");
	background-repeat: no-repeat;
	background-size: 100%;
}
</style>
</head>
<body>

	<header>
		<nav>
			<ul>
				<li>

					<div class="dropdown">
						<a href="#profile" class="dropbtn" name="profile" id="profile">
							Profile </a>
						<div class="dropdown-content">
							<a href="viewProfile.jsp" name="Viewprofile" id="Viewprofile">View
								Profile</a> 
								<a href="editProfile.jsp" name="editProfile"
								id="editProfile">Edit Profile</a>
						</div>
					</div>
				</li>
				<li>
					<div class="dropdown">
						<a href="#employees" class="dropbtn" name="employees"
							id="employees"> Manage Employee </a>
						<div class="dropdown-content">
							<a href="doctor.jsp" name="employees" id="employees">Doctors</a>
							<a href="officeStaffs.jsp" name="offStaff" id="offStaff">Office
								Staffs</a> <a href="nurse.jsp" name="nurse" id="nurse">Staff
								Nurses</a> <a href="AdminList.jsp" name="admins" id="admins">Admins</a>
						</div>
					</div>
				</li>
				<li>
					<div class="dropdown">
						<a href="#payments" class="dropbtn" name="payments" id="payments">
							Manage Payments </a>
						<div class="dropdown-content">
							<a href="financialReports.jsp" name="finReports" id="finReports">View
								Financial Reports</a> <a href="manageTransactions.jsp"
								name="manageTransactions" id="manageTransactions">Manage
								Transactions</a> <a href="manageTransactions.jsp" name="transfer"
								id="transfer">Bank Transfer</a>

						</div>
					</div>
				</li>
				<li>
					<div class="dropdown">
						<a href="#inventory" class="dropbtn" name="inventory"
							id="inventory">Manage Inventory</a>

						<div class="dropdown-content">
							<a href="pharmacy.jsp" name="pharmacy" id="pharmacy">Pharmacy</a>

							<a href="Ambulence.jsp" name="ambulence" id="ambulence">Ambulence</a>

							<a href="LifeSupplies.jsp" name="lifeSupplies" id="lifeSupplies">Medical
								Life Supplies</a>

						</div>
					</div>
				</li>
				
				<li>
					<div class="dropdown">
						<a href="#complaints" class="dropbtn" name="complaints"
							id="complaints">Manage Complaints</a>

						<div class="dropdown-content">
							<a href="ComplaintsList.jsp" name="complaintsList" id="complaintsList">View Complaints</a>

							<a href="TakeAction.jsp" name="ambulence" id="ambulence">Take Action</a>

						</div>
					</div>
				</li>

				<li>
					<div class="dropdown">
						<a href="homePage.html" class="signout" name="logOut" id="logOut">
							Log Out </a>
					</div>
				</li>
			</ul>
		</nav>
	</header>



	<p align="center">&lt;&lt;&lt; &copy; Vignesh &gt;&gt;&gt;</p>
</body>
</html>


<!-- 	<p>
		<img src="getting-business-finances-in-order.jpg" />
	</p> -->