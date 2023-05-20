<%-- 
    Document   : ViewSearched
    Created on : Mar 8, 2023, 4:350:08 PM
    Author     : PAPITI
--%>


<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.pakage.model.AdmissioModel"%>
<%@page import="com.pakage.Service_and_interface.AdmissionMethod"%>
<%@page import="com.pakage.Service_and_interface.AdmissionInterface"%>
<jsp:useBean id="Admissionbean" class="com.pakage.model.AdmissioModel" scope="session"/>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="../cssfiles/table.css" rel="stylesheet" type="text/css"/>
<%@include file="homepage.jsp"%>

<h5 style="text-align: center">List of Admitted Students</h5>

<table class="wrapper">
  <thead class="table">
    <tr class="header blue">
      <th>First Name</th>
      <th>Middle Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Birth Day Date</th>
      <th>Degree</th>
      <th>Status</th>
      <th>Gender</th>
      <th>Phone Number</th>
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
    <% 
        
    Admissionbean.setEmail(request.getParameter("seach"));
    AdmissioModel listofadmitted = new AdmissioModel(); 
    AdmissionInterface admissionService = new AdmissionMethod();
    listofadmitted = admissionService.getonestudent(Admissionbean.getEmail());
    System.out.println("the mail found "+ Admissionbean.getEmail());
        %>
        <tr>
            <td><%=listofadmitted.getFirstName()%></td>
            <td><%=listofadmitted.getMiddleName()%></td>
            <td><%=listofadmitted.getLastName()%></td>
            <td><%=listofadmitted.getEmail()%></td> 
            <td><%=listofadmitted.getBirthDay()%></td>
            <td><%=listofadmitted.getDegree()%></td>
            <td><%=listofadmitted.getStatus()%></td>
            <td><%=listofadmitted.getGender()%></td>
            <td><%=listofadmitted.getPhoneNumber()%></td>
            <td> 
                <a href="EditAdmissionInfo.jsp?Email=<%=listofadmitted.getEmail() %>&action=Edit">Edit</a>
                <a href="EditAdmissionInfo.jsp?Email=<%=listofadmitted.getEmail() %>&action=Delete">Delete</a>
            </td>
        </tr>
  </tbody>
</table>