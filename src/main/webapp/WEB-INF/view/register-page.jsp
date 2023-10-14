<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration page</title>

<style type="text/css">
 
 .error{
   color: red;
   position:fixed;
   text-align: left;
   margin-left: 20px;
 }
  
</style>
</head>
<body>
  <h3>LOVE CALCULATOR</h3>
  <div align="center">
    <form:form action="success" method="get" modelAttribute="registerInfo">
     <p>
     <label for="name"> Name : </label>
     <form:input type="text" id="name" path="name"/>
     <form:errors path="name" cssClass="error" ></form:errors>
      </p>
     <p>
     <label for="uname"> user Name : </label>
     <form:input type="text" id="uname" path="uName" />
     <form:errors path="uName" cssClass="error" ></form:errors>
     </p> 
     
     <p>
     <label for="password"> Password : </label>
     <form:input type="password" id="password" path="password" />
     </p>
     
     <p>
     <label for="country"> Country : </label>
     <form:select id="country" path="country">
     <form:option value="Ind" label="India"> </form:option>
     <form:option value="USA" label="United States"> </form:option>
     <form:option value="Pak" label="Pakistan"> </form:option>
     <form:option value="Ind" label="India"></form:option>
     <form:option value="SL" label="Srilanka"></form:option>
     <form:option value="Can" label="Canada"></form:option>
     </form:select>
     </p>
         
     <p>
     <label for="hobby"> Hobby : </label>
     cricket: <form:checkbox value="cricket" path="hobby" />
     reading: <form:checkbox value="reading" path="hobby" />
     travel: <form:checkbox value="travel" path="hobby" />
     blogging: <form:checkbox value="blogging" path="hobby" />
     coding: <form:checkbox value="coding" path="hobby" />
     </p>
     
      <p>
      <label for="gender"> Gender : </label>
      male<form:radiobutton value="male" path="gender"/>
      female<form:radiobutton value="female" path="gender"/>
      </p>
      
      <p>
      <label for="age">Age: </label>
      <form:input path="age" />
      <form:errors path="age" cssClass="error"></form:errors>
      </p>
      
      
      <div align="center">
       <h1 align="left" >Communication</h1>
         <!-- nested object-communicationDTO inside RegisterDTO -->
         <p>
         <label for="communicationDTO.email"></label>
         <form:input path="communicationDTO.email"/>
          <form:errors path="communicationDTO.email" cssClass="error"></form:errors>
       </p>
       <p>
      <label for="communicationDTO.phone"></label>
      <form:input path="communicationDTO.phone"/>
      </p> 
      
      </div>
      
      <input type="submit" value="Register" />
    </form:form> 
  
  
  </div>
  
</body>
</html>