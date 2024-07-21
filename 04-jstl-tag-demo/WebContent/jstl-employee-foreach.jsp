<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List,java.util.ArrayList,com.monocept.filter.Employee"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		List<Employee> employees = new ArrayList<>();
	employees.add(new Employee("Shiva", 1, 100000, true));
	employees.add(new Employee("Mani", 2, 10, false));

	pageContext.setAttribute("e", employees);
	%>

	<table border="1">
		<tr>
			<td>Emp id</td>
			<td>Name</td>
			<td>Salary</td>
			<td>Is Manager</td>
			<td>HihghLow</td>
		</tr>
		<c:forEach var="d" items="${e}">
			<tr>
				<td>${d.name}</td>
				<td>${d.id}</td>
				<td>${d.salary}</td>
				<td>${d.manager}</td>
				<td><c:if test="${d.salary>=500}">high</c:if> 
                  <c:if test="${d.salary<500}">low</c:if>
</td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>