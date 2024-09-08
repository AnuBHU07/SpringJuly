<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page isELIgnored= "false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Form Success</title>
</head>
<body>
	<div class="text-center">
		<h2 class="text-center">${Header}</h2>
    	<h3 class="text-center">${Desc}</h3>
		<h1>Hello, Thanks for filling form.</h1>
		<h3>Here is your details.</h3>
		<h3>Email: ${user.email}</h3>
		<h3>UserName: ${user.username}.</h3>
		<h3>Password: ${user.password}.</h3>
		<h3>Password: ${msg}.</h3>
	</div>	
</body>
</html>