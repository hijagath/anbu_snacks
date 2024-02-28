<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="mywebsignin.css">
</head>
<body>
 <div class="set">
    
        <div class="logo">
            <img src="webcontent/logo.png">
        </div>
            
            <div class="user">
    
                <form action="signin" method="get">
                    <label class="login">SIGN UP</label>
                    
                    <label class="name">Enter Your Name</label>
                    <input type="text" class="nameplace" name="name">

                    <label class="mobile">Enter Your Mobile Number</label>
                    <input type="number" class="mobileplace" name="mobile">

                    <label class="email">Enter Your Email</label>
                    <input type="email" class="emailplace" name="email">
    
                    <label class="pass">Enter your Password</label>
                    <input type="password" class="passplace" name="password">
    
                    <button class="submit">SUBMIT</button>
    
    
                </form>
    
                <div class="sign_up">
                    Have an account? <a href="myweblogin.jsp"> Login </a>
                </div>
    
                
    
            </div>
    </div>
</body>
</html>