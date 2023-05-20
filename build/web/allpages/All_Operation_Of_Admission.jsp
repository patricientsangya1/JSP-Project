<%-- 
    Document   : All_Operation_Of_Admission
    Created on : Mar 8, 2023, 3:25:01 PM
    Author     : PAPITI
--%>
<%@page import="java.util.Properties"%>
<%@page import="javax.mail.Session"%>
<%@page import="javax.mail.PasswordAuthentication"%>
<%@page import="javax.mail.MessagingException"%>
<%@page import="javax.mail.Transport"%>
<%@page import="javax.mail.internet.MimeMessage"%>
<%@page import="javax.mail.internet.InternetAddress"%>
<%@page import="javax.mail.Message"%>
<%@page import="com.pakage.Service_and_interface.AdmissionMethod"%>
<%@page import="com.pakage.Service_and_interface.AdmissionInterface"%>
<%@page import="java.text.ParseException"%>
<%@page import="java.util.*"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Admissionbean" class="com.pakage.model.AdmissioModel" scope="session"/>


<% 
        try {
          
            Admissionbean.setFirstName(request.getParameter("fn").trim());
            Admissionbean.setMiddleName(request.getParameter("mn").trim());
            Admissionbean.setLastName(request.getParameter("ln").trim());
            Admissionbean.setEmail(request.getParameter("email").trim());
            int phoneNumber = Integer.parseInt(request.getParameter("phone").trim());
            Admissionbean.setPhoneNumber(phoneNumber);
            Admissionbean.setDegree(request.getParameter("degree").trim());
            Admissionbean.setBirthDay(request.getParameter("dob"));
            String ppr = request.getParameter("passport");
            byte[]passport = ppr.getBytes();
            Admissionbean.setPhotoPasspport(passport);
            String diplomat = request.getParameter("diplomat");
            byte[]diploma = diplomat.getBytes();
            Admissionbean.setDiplomat(diploma);
            Admissionbean.setGender(request.getParameter("gender").trim());
            Admissionbean.setStatus(request.getParameter("status").trim());
            
            
            AdmissionInterface admissionService = new AdmissionMethod();
            
            if (request.getParameter("action").equals("Edit")){
                 admissionService.updateAdmission(Admissionbean);
                 request.setAttribute("message", "Record has been successfully Updated :)!");
                 request.getRequestDispatcher("homepage.jsp").forward(request, response);
            } else if(request.getParameter("action").equals("Delete")){
                 admissionService.deleteAdmission(Admissionbean);
                 request.setAttribute("message", "Record has been successfully Deleted :(!");
                 request.getRequestDispatcher("homepage.jsp").forward(request, response);                    
            } else{
                admissionService.saveAdmission(Admissionbean);
                request.setAttribute("message", "Record has been successfully Saved :)!");
                SendEmail(Admissionbean.getEmail(),Admissionbean.getFirstName(),Admissionbean.getLastName());
                request.getRequestDispatcher("homepage.jsp").forward(request, response);   
            }
             
        }catch(Exception e){
               request.setAttribute("message", "Something went wrong!");
               System.out.println("the error accured is ||||||||||||||||||| "+e);
        }
%>



<%! public void SendEmail(String userEmail, String fn,String ln) throws Exception {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.ssl.protocols", "TLSv1.2");
        
        final String  fromEmail ="maxtsangya@gmail.com";
        final String password = "zvcwhvaljvqfruvq";
                
        
        Session session = Session.getDefaultInstance(properties, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication(){
                return new PasswordAuthentication(fromEmail,password);
            }
        });
        try {
             Message message = new MimeMessage(session);
             message.setRecipient(Message.RecipientType.TO, new InternetAddress(userEmail));
             message.setSubject("Confirmation message");
             String messageBody = "Dear " + fn + " " + ln + ",\n\nThank you for registering to our school. We have received your information and will process it as soon as possible.\n\nBest regards,\nThe Form Team";
             message.setText(messageBody);
             Transport.send(message);
             System.out.println("Message sent successfully.");
        } catch (MessagingException e) {
            System.out.println("Error sending message: " + e.getMessage());
        }

        }
%>


