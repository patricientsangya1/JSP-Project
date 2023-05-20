<%-- 
    Document   : SignUpOpperation
    Created on : Mar 8, 2023, 4:350:08 PM
    Author     : PAPITI
--%>

<%@page import="com.pakage.model.SignUpModel"%>
<%@page import="com.pakage.Service_and_interface.SignUpMethod"%>
<%@page import="com.pakage.Service_and_interface.SignUpInterface"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    
    String fullname = request.getParameter("fname").trim();
    String userpassword = request.getParameter("password").trim();
    String confirmpossword = request.getParameter("cpassword").trim();
    SignUpModel signmodel = new SignUpModel();
    signmodel.setUsername(fullname);
    signmodel.setUserpassword(userpassword);
    signmodel.setConfirm_userpassword(confirmpossword);
    SignUpInterface sign = new SignUpMethod();
    sign.saveAccount(signmodel);
    request.setAttribute("message", "You have successfully Signed Up with us:)!");
    request.getRequestDispatcher("LoginSignUpPage.jsp").forward(request, response);
    
%>
