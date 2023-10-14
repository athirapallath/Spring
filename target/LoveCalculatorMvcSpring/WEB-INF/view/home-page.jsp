<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>

<style type="text/css">
 
 .error{
   color: red;
   position:fixed;
   text-align: left;
   margin-left: 20px;
 }
  
</style>

<script type="text/javascript">
  
  function validateForm(){
	  var userName = document.getElementById("un").value;
	  var crushName = document.getElementById("crushName").value;
	  if((userName.length < 1 ) || (crushName.length < 1)){
		  alert("fields shoudn't be empty");
		  return false;
		}else{
		  return true; 
	  }
	 
  }

</script>

</head>
<body>

<h1 align="center">Love Calculator</h1>
<hr>

<!-- <p> your registration is successful, you can login here </p> -->

<form:form action="process-homepage" method="get" modelAttribute="userInfo"  >
<div align="center">
<p>
<label for="un">Your Name : </label>
<form:input id="un" path="userName"/>
<form:errors path="userName" cssClass="error"></form:errors>
</p>
<p>
<label for="crushName">Crush Name : </label>
<form:input  id="crushName" path="crushName"/>
<form:errors path="crushName" cssClass="error"></form:errors>
</p>
<p>

<form:checkbox path="termandCondition" id="check"/>
<label for="check">I'm agreeing that this is for fun</label>
<form:errors path="termandCondition" cssClass="error"></form:errors>
</p>


<input type="submit" value="calculate"/>

</div>
</form:form>
<p align="center"> if you don't have an account <a href="register">Register</a> here </p>
</body>
</html>