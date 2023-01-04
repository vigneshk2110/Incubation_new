<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
function validate(){
	  var phoneNumber = document.getElementById('phone-number').value;
	  var postalCode = document.getElementById('postal-code').value;
	  var phoneRGEX = /^[(]{0,1}[0-9]{3}[)]{0,1}[-\s\.]{0,1}[0-9]{3}[-\s\.]{0,1}[0-9]{4}$/;
	  var postalRGEX = /^[A-Z]{1,2}[0-9]{1,2} ?[0-9][A-Z]{2}$/i;
	  var phoneResult = phoneRGEX.test(phoneNumber);
	  var postalResult = postalRGEX.test(postalCode);
	  if(phoneResult == false)
	  {
	    alert('Please enter a valid phone number');
	    return false;
	  }

	  if(postalResult == false)
	  {
	    alert('Please enter a valid postal number');
	    return false;
	  }
		
	  alert("true");
	  window.location.href = 'http://www.google.com'; 
	  return true;
	}
</script>
</head>
<body>
	<form action="" onsubmit="validate()">
		<input type="text" id="phone-number" placeholder="phone number" /> <br>
		<input type="text" id="postal-code" placeholder="postal code" /><br>
		<input type="submit" />
	</form>
</body>
</html>