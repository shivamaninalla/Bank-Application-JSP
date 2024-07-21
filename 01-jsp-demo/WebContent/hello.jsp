<%@page import="java.io.OutputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello world</h1>

<!-- Expression tag -->
Today date is<%= new java.util.Date() %>
<br>

Sum of 10 and 20 is<%= 10+20 %>
<br>

Is 10 greater than 20<%= 10>20 %>
<br>
String in caps<%= new String("Hello world").toUpperCase() %>

<!-- Scriplet Tags -->

<%

for(int i=1;i<=10;i++){
	out.println("<h4>number</h4>"+i);
	out.println("number"+i);
}
%>


<!-- Declaration Tags -->
<%!
   String convertToUpperCase(String str){
	
	return str.substring(0,1).toUpperCase()+str.substring(1);
}
	
	String convertFirstCharacter(String str){
		String strf[]=str.split("\\s+");
		StringBuilder newStr=new StringBuilder();
		for(String s:strf){
			if(!s.isEmpty()){
				String f=s.substring(0, 1).toUpperCase();
				String r=s.substring(1);
				newStr.append(f).append(r).append(" ");
			}
		}
			return newStr.toString();
			
		
		
	}
	
	

%>


<%=convertToUpperCase("India is my country")%>
<br>

<%=convertFirstCharacter("India is  best friend to pakistan")%>
</body>
</html>