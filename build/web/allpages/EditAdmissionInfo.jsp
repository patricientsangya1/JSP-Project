google<%-- 
    Document   : EditAdmissionInfo
    Created on : Mar 8, 2023, 3:10:04 PM
    Author     : PAPITI
--%>
<%@page import="java.util.Date"%>
<%@page import="java.util.Base64"%>
<%@page import="com.itextpdf.text.pdf.PdfReader"%>
<%@page import="com.itextpdf.text.pdf.parser.PdfTextExtractor"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page import="com.pakage.model.AdmissioModel"%>
<%@page import="com.pakage.Service_and_interface.AdmissionMethod"%>
<%@page import="com.pakage.Service_and_interface.AdmissionInterface"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Admissionbean" class="com.pakage.model.AdmissioModel" scope="session"/>
<jsp:include page="homepage.jsp"/>

<%
        Admissionbean.setEmail(request.getParameter("Email"));
        String action = request.getParameter("action");
        AdmissionInterface stud = new AdmissionMethod();
        AdmissioModel adm = stud.getonestudent(Admissionbean.getEmail());
        Admissionbean.setFirstName(adm.getFirstName());
        Admissionbean.setMiddleName(adm.getMiddleName());
        Admissionbean.setLastName(adm.getLastName());
        Admissionbean.setEmail(adm.getEmail());
        Admissionbean.setPhoneNumber(adm.getPhoneNumber());
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Admissionbean.setBirthDay(formatter.format(adm.getBirthDay()));
        System.out.println("the birth day gotten is this "+adm.getBirthDay());
        String base64Image = Base64.getEncoder().encodeToString(adm.getPhotoPasspport());
        request.setAttribute("photos", base64Image);
        String base64Pdf = Base64.getEncoder().encodeToString(adm.getDiplomat());
        request.setAttribute("diplomats", base64Pdf);
        Admissionbean.setGender(adm.getGender());
        Admissionbean.setStatus(adm.getStatus());
        request.setAttribute("action", action);
        request.getRequestDispatcher("AdmissionPage.jsp").forward(request, response);
%>