<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<nav class="navbar bg-secondary border rounded mt-3 p-4">
			<div
				class="container-fluid d-flex justify-content-center align-items-center">
				<h1>Add New Account</h1>
			</div>
		</nav>
	</div>


	<form action="admin-function" method="post" class="mt-3">
		<input type="hidden" name="command" value="search-customer" />
		<div class="container">
			<div class="mb-3">
				<input type="text" class="form-control" name="customer-id"
					placeholder="Enter Customer ID to Search" />
			</div>
			<div class="d-grid gap-2 col-3 mx-auto">
				<button type="submit" class="btn btn-primary">Search</button>
			</div>
		</div>
	</form>

	<div class="container my-5">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Customer ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email ID</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="customer" items="${theCustomer}">
					<tr>
						<td>${customer.customerId}</td>
						<td>${customer.firstName}</td>
						<td>${customer.lastName}</td>
						<td>${customer.emailId}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>


		<form action="admin-function" method="post" class="mt-3">


			<c:forEach var="customer" items="${theCustomer}">
				<input type="hidden" name="customerId"
					value="${customer.customerId}" />
			</c:forEach>

			<input type="hidden" name="command" value="add-bank-account" />
			<div class="container mt-5">
				<div class="d-grid gap-2 col-3 mx-auto mt-2">
					<button class="btn btn-outline-secondary" type="submit">Generate
						Account Number</button>
				</div>
			</div>
		</form>


	</div>


</body>
</html>