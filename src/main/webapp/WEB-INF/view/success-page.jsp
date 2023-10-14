
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Love Calculator</title>
</head>
<body>
 
 <p>registration successful ${registerInfo.name}</p>
 
 <p> user name : ${registerInfo.uName}</p>
 <p> password : ${registerInfo.password}</p>
 <p> country : ${registerInfo.country}</p>
 <p> hobby : 
    
    <c:forEach var="temp" items="${registerInfo.hobby}">
    
    ${temp}
    
    </c:forEach>

 </p>
 <p> gender : ${registerInfo.gender}</p>
  
  <p>Age : ${registerInfo.age} </p>
  
  <br/>
  
  Email:  ${registerInfo.communicationDTO.email}
  Phone:  ${registerInfo.communicationDTO.phone}
 
</body>
</html>