<%-- 
    Document   : ViewOfAdmitted
    Created on : Mar 8, 2023, 4:350:08 PM
    Author     : PAPITI
--%>
<%@page import="org.apache.tomcat.util.codec.binary.Base64"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.pakage.model.AdmissioModel"%>
<%@page import="com.pakage.Service_and_interface.AdmissionMethod"%>
<%@page import="com.pakage.Service_and_interface.AdmissionInterface"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="../cssfiles/table.css" rel="stylesheet" type="text/css"/>
<%@include file="homepage.jsp"%>
<style>
    h1 h3{
        font-family: "Open Sans",
    -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Oxygen-Sans, Ubuntu, Cantarell, "Helvetica Neue", Helvetica, Arial, sans-serif;
    }
</style>

<h1 style="text-align: center">Welcome to the School Administration Panel</h1>

<h3 style="text-align: center">Submission Records</h3>

<table class="wrapper">
  <thead class="table">
    <tr class="header blue">
      <th>First Name</th>
      <th>Middle Name</th>
      <th>Last Name</th>
      <th>Email</th>
      <th>Date of Birth</th>
      <th>Level</th>
      <th>Status</th>
      <th>Gender</th>
      <th>Phone Number</th>
      <th>Action</th>
    </tr>
  </thead>
  <tbody>
    <% 
    List<AdmissioModel> listofadmitted = new ArrayList<AdmissioModel>(); 
    AdmissionInterface admissionService = new AdmissionMethod();
    listofadmitted = admissionService.getAdmitedStudents();

    for (AdmissioModel admission : listofadmitted) {
        %>
        <tr>
            <td><%=admission.getFirstName()%></td>
            <td><%=admission.getMiddleName()%></td>
            <td><%=admission.getLastName()%></td>
            <td><%=admission.getEmail()%></td>
            <td><%=admission.getBirthDay()%></td>
            <td><%=admission.getDegree()%></td>
            <td><%=admission.getStatus()%></td>
            <td><%=admission.getGender()%></td>
            <td><%=admission.getPhoneNumber()%></td>
            <td> 
                <a href="EditAdmissionInfo.jsp?Email=<%=admission.getEmail() %>&action=Edit">Edit</a>
                <a href="EditAdmissionInfo.jsp?Email=<%=admission.getEmail() %>&action=Delete">Delete</a>
            </td>
        </tr>
    <%}%>
  </tbody>
</table>
  
  
 