<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
</head>
<body>
<div class="container mt-5">
        <h2>Form Response</h2>
        <div class="alert alert-success" role="alert">
            <h4 class="alert-heading">Form Submitted Successfully!</h4>
            <p><strong>Name:</strong> <%= request.getParameter("name") %></p>
            <p><strong>Age:</strong> <%= request.getParameter("age") %></p>
            <p><strong>City:</strong> <%= request.getParameter("city") %></p>
            <p><strong>Gender:</strong> <%= request.getParameter("gender") %></p>
            <%-- <p><strong>Languages:</strong> <%= request.getParameter("Languages") %></p> --%>
            <%
            String str[]=request.getParameterValues("Languages");
            if(str!=null){
            	String lang=String.join(", ", str);
            	out.println(lang);
            }
            else{
            	out.println("None");
            }
            
            
            
            %>
            
            <hr>
            <p class="mb-0">Thank you for submitting the form.</p>
            
        </div>


</body>
</html>