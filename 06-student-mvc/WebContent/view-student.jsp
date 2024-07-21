<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employees</h2>

<table border="1">
		<tr>
			<td>Emp id</td>
			<td>First Name</td>
			<td>Last Name</td>
			<td>Email</td>
			
		</tr>
		<c:forEach var="d" items="${thedata}">
			<tr>
				<td>${d.id}</td>
				<td>${d.first_name}</td>
				<td>${d.last_name}</td>
				<td>${d.email}</td>

			</tr>
		</c:forEach>

	</table>



</body>
</html>