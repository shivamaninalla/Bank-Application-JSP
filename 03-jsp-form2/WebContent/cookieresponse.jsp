<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="javax.servlet.http.Cookie"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
String favlang=request.getParameter("fl");
Cookie cookie=new Cookie("favouritelang",favlang);
cookie.setMaxAge(60*10);
response.addCookie(cookie);




%>
<hr>

<h4>We set ur fav lang. Check ur home page</h4>
<a href="cookiehome.jsp">CookieHome</a>

</body>
</html>