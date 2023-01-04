<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html bgcolor = "olive">
<head>
<meta charset="UTF-8">
<title>Complaints</title>
<style>
body {
  background-image: url('../Images/Inventory.jpg');
  background-repeat: no-repeat;
  background-size: 100%;
}
</style>
</head>
<body>
<div align = "center">
<h1 >Welcome to Online Complaints portal</h1>
<h3>We are here to Hear you speak</h3>
<form>
  <label for="fname">Name     :&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</label>
  <input type="text" id="fname" name="fname"><br><br>
  <label for="contact">Contact  :&nbsp;&nbsp;&nbsp;</label>
  <input type="tel" id="contact" name="contact"><br><br>
  
   <label for="complaint">complaint:&nbsp;</label>
  <input type="text"><br><br>
  
 
</form>

<p>

<input  type="button" onClick="alert('Your Complaint has been received sucessfully, We will resolve it ASAP')" value="Register Complaint" align = "center">

 </p>
 
 <button >
        <a href = "homePage.html">
           Main Page
          </a>
        </button>
        </div>
</body>
</html>