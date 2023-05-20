<%-- 
    Document   : AdmissionPage
    Created on : Mar 8, 2023, 13:00:20 PM
    Author     : PAPITI
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="Admissionbean" class="com.pakage.model.AdmissioModel" scope="session"/>
<script src="https://cdnjs.cloudflare.com/ajax/libs/google-libphonenumber/3.2.19/libphonenumber.js"></script>  
<link href="../cssfiles/style_1.css" rel="stylesheet" type="text/css"/>
<jsp:include page="homepage.jsp"/>

    
                    
        <div class="main-parent">
            <div class="form-wrap">           
                    <form action="All_Operation_Of_Admission.jsp" method="POST">
                        <h1><span style="color:  #1049a3">Admission</span>Form</h1>
                         <div class="single-input">
                             <input type="text" name="fn" class="all" placeholder="First Name" value="${Admissionbean.firstName}"required>
                         </div>
                             
                        <div class="single-input">
                            <input type="text" name="mn" class="all" placeholder="Middle Name" value="${Admissionbean.middleName}"required>
                        </div>
                        <div class="single-input">
                             <input type="text" name="ln" class="all" placeholder="Last Name" value="${Admissionbean.lastName}"required>
                        </div>
                        
                        
                        <div class="single-input">
                            <input type="email" name="email" class="all" placeholder="example@gmail.com" value="${Admissionbean.email}" required>
                        </div>
                        
                        <div class="single-input">
                            <input type="text" name="phone" id="inputField" placeholder="Phone Number" class="a" size="10" oninput="validateInput(this)" value="${Admissionbean.phoneNumber}" required/>
                                <span id="errorSpan" style="color: red;"></span>
                        </div>
                                
                        <div class="single-input">
                            <label>Degree</label>
                                <select id="al" name="degree">
                                         <option  name="degree" value="Undergraduate" ${Admissionbean.degree == 'Undergraduate' ? 'selected' : ''}>Undergraduate</option>
                                         <option  name="degree" value="Graduate" ${Admissionbean.degree == 'Graduate' ? 'selected' : ''}>Graduate</option>
                                         <option  name="degree" value="Masters" ${Admissionbean.degree == 'Masters' ? 'selected' : ''}>Masters</option>
                                </select> 
                        </div>
                        
                        <div class="single-input">
                        <label>Date of Birth</label><br>
                        <input type="date" name="dob" class="all"  value="${Admissionbean.dateOfBirth}"/>
                        </div>
                        <div class="single-input">
                            <label>Passport photo</label><br>
                              <input type="file" name="passport" class="all" accept=".png,.jpg" value="${photos}"  required/><br>
                               <label>Certificate</label><br>
                            <input type="file" name="diplomat" class="all"  accept=".pdf" value="${diplomats}" required/>
                          
                        </div>
                        
                        <div class="form-group">
                            <label>Gender:</label>
                            <input type="radio" name="gender"  class="r" value="male" ${Admissionbean.gender == 'male'  ? 'checked' : ''}> Male
                                <input type="radio" name="gender" class="r" value="female" ${Admissionbean.gender == 'female'  ? 'checked' : ''}> Female 
                                <input type="radio" name="gender" class="r" value="other" ${Admissionbean.gender == 'other'  ? 'checked' : ''}> Other<br>  
                            <label>Status:</label>
                            <input type="radio" name="status" class="r" value="married" ${Admissionbean.status == 'married'  ? 'checked' : ''}> Married
                                <input type="radio" name="status" class="r" value="Single" ${Admissionbean.status == 'Single'  ? 'checked' : ''}> Single 
                                <input type="radio" name="status" class="r" value="abandoned"  ${Admissionbean.status == 'abandoned'  ? 'checked' : ''}> Complicated 
                        </div> 
                          <% if (request.getAttribute("action") == null) { %>
                                <div class="submit-button">
                                <input type="submit" style="background-color:  #1049a3" name="action" value="Submit" id="submit-admission">
                             </div>
                               <%} else {%>
                            <div class="submit-button">
                            <input type="submit" style="background-color:  #1049a3" name="action" value="${action}" id="submit-admission">
                         </div>
                         <%}%>
                    </form>
                </div>
            </div>
                    <script src="../jsfile/admissionScript.js"></script> 
   </div>

