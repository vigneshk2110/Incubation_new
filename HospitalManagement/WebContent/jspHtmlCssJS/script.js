function LOGIN(e) {

	var uname = document.getElementById("uname").value;
	var pass = document.getElementById("password").value;
	var uregex = /[0-9a-zA-Z]{6,}/;
	var pregex = /[0-9a-zA-Z]{6,}/;

	if (pass.match(pregex) && uname.match(uregex)) {
		alert("succesfully logged in");
	} else if (!(pass.match(pregex)) && !(uname.match(uregex))) {
		alert("please enter valid username and valid password");
	} else if (!uname.match(uregex)) {
		alert("please enter valid username");
	} else if (!pass.match(pregex)) {
		alert("please enter valid password");
	} 
}

function callLogin(e){
	alert("Success 1");
	var name = document.getElementById("uname").value;
	var pass = document.getElementById("password").value;
	var role = document.getElementById("loginType").value;
	var url="LoginServlet?a="+name+"&b="+pass+"&c="+role;

	var request = new XMLHttpRequest(); // Object creation for synchronus & Asynchronus calls 
	var value;
	request.open("POST",url,true);
	request.send();
	request.onreadystatechange=function(){
		if(request.readyState==4){
			//value=JSON.parse(request.responseText);
			value = request.responseText;
			console.log(value);
			alert("Success");
		}
	}
}
