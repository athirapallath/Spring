<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Hi ${userInfo.userName} !</h1>
<h2>send result to your email</h2>
<%-- 
  <form:form  action="/LoveCalculatorMvcSpring/processEmail/${userName}" method="GET" modelAttribute="emailInfo">
     <label for="emailId">  Enter Your Email </label>
     <form:input path="emailId"/>
     <input type="submit" value="send"/>
  
   
  </form:form> --%>
 
 <form:form  action="/LoveCalculatorMvcSpring/processEmail" method="GET" modelAttribute="emailInfo">
     <label for="emailId">  Enter Your Email </label>
     <form:input path="emailId"/>
     <input type="submit" value="send"/>
  
   
  </form:form>


</body>
</html>