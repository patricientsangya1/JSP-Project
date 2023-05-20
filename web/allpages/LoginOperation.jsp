<%-- 
    Document   : LoginOperation
    Created on : Mar 8, 2023, 4:350:08 PM
    Author     : PAPITI
--%>

<%@page import="com.pakage.model.loginModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.pakage.model.SignUpModel"%>
<%@page import="java.util.List"%>
<%@page import="com.pakage.Service_and_interface.SignUpMethod"%>
<%@page import="com.pakage.Service_and_interface.SignUpInterface"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
       String fulname = request.getParameter("u").trim();
       String password = request.getParameter("p").trim();
       loginModel lg = new loginModel();
       lg.setUsername(fulname);
       lg.setUserpassword(password);
      
       
       List<SignUpModel> userAccounts = new ArrayList<SignUpModel>(); 
       SignUpInterface login = new SignUpMethod();
        userAccounts = login.getAllAcounts();
         for (SignUpModel account : userAccounts){
                
             if(lg.getUsername().equals(account.getUsername()) && lg.getUserpassword().equals(account.getConfirm_userpassword())){
                 System.out.println("accoutfromdb:::::"+ account.getUsername().equals(lg.getUsername())+" :::::::::: "+  account.getConfirm_userpassword().equals(lg.getUserpassword()));
                 System.out.println("accoutfromdb:::::"+ account.getUsername().equals(lg.getUsername())+" ::::::::::"+  account.getConfirm_userpassword().equals(lg.getUserpassword()));
                 request.setAttribute("message", "You have been logged in successfully:)!");
                 request.getRequestDispatcher("AdmissionPage.jsp").forward(request, response); 
             }else{
                 request.setAttribute("info", " no such account found");
//                 request.getRequestDispatcher("LoginSignUpPage.jsp").forward(request, response); 
             
             }
         }
%>