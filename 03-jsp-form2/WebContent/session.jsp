<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page
	import="java.util.List,java.util.ArrayList,com.monocept.filter.StringUtil"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH"
	crossorigin="anonymous">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz"
	crossorigin="anonymous"></script>
</head>
<body>
	Welcome<%=StringUtil.toUpperCase("shiva")%>
	<form action="#" method="get">
		<div class="container mt-5">
			<h2>Todo list</h2>

			<div class="mb-3">
				<label for="name" class="form-label">Tasks</label> 
				<input type="text" class="form-control" id="name" name="name" required>
			</div>
			<button type="submit" class="btn btn-primary">Add</button>
	</form>
	<hr>

	<%-- <%
	<List> todoIetmList=
		String str = request.getParameter("name");
	    out.println("<h2> Added things:</h2>" + str);
	%> --%>

</body>
</html>