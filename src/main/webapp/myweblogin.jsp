<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="myweblogin.css">
</head>
<body>
<div class="set">
    
    <div class="logo">
      <img src="webcontent/logo.png">
    </div>
        
        <div class="user">

            <form action="login" >
                <label class="login">LOGIN</label>

                <label class="email">Enter Your Email</label>
                <input type="email" class="emaillogin" name="email1">
                <% String ms= (String) request.getAttribute("msg1"); 
				if(ms!= null){%>
				 <h6 class="invalidmail"><%= ms %></h6>
				<% } %>

                <label class="pass">Enter your Password</label>
                <input type="password" class="passlogin" name="pass1">
                <% String ms1= (String) request.getAttribute("msg"); 
				if(ms1!= null){%>
				 <h6 class="invalidpass"><%= ms1 %></h6>
				<% } %>
                

                <button class="submit">SUBMIT</button>


            </form>

            <div class="sign_up">
                Don't have a account? <a href="mywebsignin.jsp"> Sign Up </a>
            </div>

            
</div>
</div>
</body>
</html>