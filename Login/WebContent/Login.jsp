<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- <style type="text/css">
.not-selectable {
  -webkit-touch-callout: none;
  -webkit-user-select: none;
  -khtml-user-select: none;
  -moz-user-select: none;
  -ms-user-select: none;
  user-select: none;
}
</style> -->
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>
<div align = center>
<h1>User Login</h1>
</div>
<form action = LoginServlet method = post>
<table>
<tr><td>Enter Name:</td><td><input type=text name = txtName></td></tr> 
<tr><td>Enter PassWord:</td><td><input type=password name = txtPWD></td></tr> 
<tr><td></td><td><input type=submit value = Login></td><br>
<td><input type=reset></td></tr> 
</table>
</form>
<!-- <p class="not-selectable">
This answer has a problem, and it does not work in all cases any more.
 Other browsers use their own vendor prefixes, and you are using MozUserSelect only. 
 New browsers will use no prefix. Look at the list of all possible javascript prefixes:
  ['Moz', 'Webkit', 'ms', 'O', 'Khtml', ''] /*with empty string for no prefix*/. You should correctly deal with camelCase. And it's a serious bug that you are overwriting onselectstart and onmousedown event handlers with your function, 
so previously attached handlers do not work any more. I can Update your code if you like
</p> -->
</body>
</html>