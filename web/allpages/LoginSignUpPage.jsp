<%-- 
    Document   : LoginSignUpPage
    Created on : Mar 8, 2023, 4:350:08 PM
    Author     : PAPITI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:include page="homepage.jsp"/>


<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- custome css  -->
    <link href="../cssfiles/styles.css" rel="stylesheet" type="text/css"/>
    <title>Login</title>
</head>
<body>
    <div class="main-parent">
        <div class="form-wrap">
            <form style="background: transparent;" method="post" action="LoginOperation.jsp">
                <h1><span style="color:  #1049a3">Login</span>Form</h1>
                <div class="single-input">
                    <input id="username" name="u" type="text" placeholder="User Name" required>
                </div>
                <div class="single-input">
                    <input id="pass" name="p" type="password" placeholder="Password" required>
                </div>
                <div class="submit-button">
                    <button style="background-color:  #1049a3" class="button">Login</button>
                </div>
                <div class="account-have">
                    <a href="#">Forget Password</a>
                    <a href="LoginSignUpPage_1.jsp">Create new account</a>
                </div>
            </form>
        </div>
    </div>
    <script src="./sweetalert.js"></script>
    <script src="./app.js"></script>
    <script type="text/javascript" src="js.js"></script>
    <script src="../jsfile/script.js"></script> 
</body>
</html>