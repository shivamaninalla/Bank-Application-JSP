<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
	crossorigin="anonymous"></script>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<h2>Students</h2>
		<a href="addStudent.jsp" class="btn btn-warning">Add student</a> <a
			href="searchstudent.jsp" class="btn btn-warning">Search</a>


		<table class="table table-striped table-bordered">
			<tr>
				<td>Name</td>
				<td>Percentage</td>
				<td>Id</td>
				<td>Update</td>
				<td>Delete</td>


			</tr>
			<c:forEach var="d" items="${data}">
				<tr>
					<td>${d.name}</td>
					<td>${d.percentage}</td>
					<td>${d.id}</td>
					<td><a href="StudentController?command=load&id=${d.id}"
						class="btn btn-warning">Update</a></td>
					<td><a href="StudentController?command=delete&id=${d.id}"
						class="btn btn-danger">Delete</a></td>


				</tr>
			</c:forEach>

		</table>
	</div>



</body>
</html>