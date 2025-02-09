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
	<nav class="navbar bg-secondary">
    <div
      class="container-fluid d-flex justify-content-center align-items-center">
      <h1 class="navbar-brand my-2">Bank Management System</h1>
    </div>
  </nav>
	<hr />

	<nav class="navbar bg-body-tertiary">
		<div
			class="container-fluid d-flex justify-content-center align-items-center">
			<h1 class="navbar-brand my-2 py-2">View Customers</h1>
		</div>
	</nav>

	<hr />

	<div class="container my-5">
		<table class="table table-striped">
			<thead>
				<tr>
					<th>Customer ID</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Account Number</th>
					<th>Balance</th>
				</tr>
			</thead>

			<tbody>
				<c:forEach var="customerAccount" items="${theCustomerAccounts}">
					<tr>
						<td>${customerAccount.customer.cust_id}</td>
						<td>${customerAccount.customer.first_name}</td>
						<td>${customerAccount.customer.last_name}</td>
						<td>${customerAccount.accounts.account_number}</td>
						<td>${customerAccount.accounts.balance}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
</body>
</html>
