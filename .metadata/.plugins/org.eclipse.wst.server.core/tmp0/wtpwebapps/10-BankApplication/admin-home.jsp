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
	<div class="container mt-3">

		<nav class="navbar bg-secondary border rounded p-4">
			<div
				class="container-fluid d-flex justify-content-center align-items-center">
				<h1>Admin Home</h1>
			</div>
		</nav>


		<nav
			class="navbar navbar-expand-lg navbar-light bg-light mt-3 px-5 border rounded">
			<form action="admin" method="get">
				<nav class="navbar navbar-expand-lg bg-body-tertiary px-5">
					<div class="container-fluid">
						<input type="submit" name="admin-function"
							value="Add New Customer" class="navbar-brand nav-link col-3" />
						<input type="submit" name="admin-function"
							value="Add Bank Account" class="navbar-brand nav-link col-5" />
						<input type="submit" name="admin-function" value="View Customers"
							class="navbar-brand nav-link col-5" /> <input type="submit"
							name="admin-function" value="View Transactions"
							class="navbar-brand nav-link col-5" />
					</div>
				</nav>
			</form>
		</nav>

		<div class="text-center mt-4">
			<img src="./includes/bank.jpeg" class="rounded img-fluid"
				alt="Bank-image" width="70%" />
		</div>

	</div>



</body>
</html>