<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		String favlang = "java";
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			if (c.getName().equals("favouritelang")) {
		favlang = c.getValue();
		break;
			}
		}
	}
	%>

	<h2>
		favourite langs:<%=favlang%>
		<a href="cookie.jsp">go to home page</a>
</body>
</html>