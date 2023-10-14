<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<br/>
	<div align="left">
		<h3>The Love calculator predicts :</h3>
		<h4>${userInfo.userName} and ${userInfo.crushName} are </h4>
		<br/>
		<h2>Friend</h2>
	</div>
	
	
	<div align="left">
	
	 <%--  <a href="/LoveCalculatorMvcSpring/sendEmail/${userInfo.userName}">send result to email</a> --%> <!-- using pathVariable -->
	  <a href="/LoveCalculatorMvcSpring/sendEmail/">send result to email</a>
	 <br/> <a href="LoveCalculatorMvcSpring/" >try with somebody else</a>
	  <br/><a href="LoveCalculatorMvcSpring/history">check user history</a>
	</div>
</body>
</html>