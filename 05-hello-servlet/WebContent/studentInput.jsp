<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%-- <%@ pageimpotrt=" com.monocept.model" %> --%>
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

	<form action="hello" method="get">
		<div class="container mt-5">
			<h2>Simple Bootstrap Form</h2>
			<!-- <form action="hello" method="POST"> -->
				<div class="mb-3">
					<label for="name" class="form-label">Name</label> <input
						type="text" class="form-control" id="name" name="name" required>
				</div>
				<div class="mb-3">
					<label for="age" class="form-label">Age</label> <input
						type="number" class="form-control" id="age" name="age" required>
				</div>
				<div>
					<select class="form-select" aria-label="Default select example"
						, name="city">
						<option selected>Open this select menu</option>
						<option value="1">Mumbai</option>
						<option value="2">Hyderabad</option>
						<option value="3">Delhi</option>
					</select>
					<div class="mb-3">
						<label class="form-label">Gender</label><br>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="genderMale" value="Male" required> <label
								class="form-check-label" for="genderMale">Male</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="radio" name="gender"
								id="genderFemale" value="Female" required> <label
								class="form-check-label" for="genderFemale">Female</label>
						</div>
					</div>

					<div class="col-sm-10 mt-3">
						<label class=".label">Languages</label>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" value="English"
								id="flexCheckDefault" name="Languages" /> <label
								class="form-check-label" for="flexCheckDefault"> English
							</label>
						</div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" value="Hindi"
								id="flexCheckChecked" name="Languages" /> <label
								class="form-check-label" for="flexCheckChecked"> Hindi </label>
							
						</div>
						<div><input class="form-check-input" type="checkbox" value="Telugu"
								id="flexCheckDefault" name="Languages" /> <label
								class="form-check-label" for="flexCheckDefault"> Telugu
							</label></div>
						<div class="form-check">
							<input class="form-check-input" type="checkbox" value="Tamil"
								id="flexCheckChecked" name="Languages" /> <label
								class="form-check-label" for="flexCheckChecked"> Tamil </label>
						</div>
					</div>
					<button type="submit" class="btn btn-primary">Submit</button>
			</form>
</body>
</html>