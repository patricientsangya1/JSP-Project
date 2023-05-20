function  clickme()
{
    var firstname=document.getElementById('firstname').value;
    var validatefirstname=document.getElementById('firstnamevalidation');
    var lastname=document.getElementById('lastname').value;
    var validatelastname=document.getElementById('lastnamevalidation');
    var middlename=document.getElementById('middlename').value;
    var validatemiddlename=document.getElementById('middlenamevalidation');
    
    if(firstname=="")
    {
        validatefirstname.innerHTML="Firstname is required";
        return false;
    }
    else{
        validatefirstname.innerHTML="";
    }
    if(lastname=="")
    {
        validatelastname.innerHTML="Last Name Is required";
        return false;
    }
      else{
        validatelastname.innerHTML="";
    }
    if(middlename=="")
    {
        validatemiddlename.innerHTML="Middle Name Is required";
        return false;
    }
      else{
        validatemiddlename.innerHTML="";
    }
    if(firstname !="" && lastname!="" &&middlename!="")
    {   
        return true;
    }
    }
    function result()
    {
        if(clickme()==true)
     
             var xhttp = new XMLHttpRequest();
  xhttp.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
      document.getElementById("demo").innerHTML =
      this.responseText;
    }
  };
  xhttp.open("GET.html", "http://localhost:8080/assignmentJ/save", true);
  xhttp.send();
 }

 result();
