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
<title>Customer Home</title>
</head>
<body>
<div class="container mt-3">

    <!-- Header Navigation -->
    <nav class="navbar bg-secondary border rounded p-4 mb-4">
        <div class="container-fluid d-flex justify-content-center align-items-center">
            <h1 class="text-white">Customer Home</h1>
        </div>
    </nav>

    <!-- Main Navigation Buttons -->
    <div class="row justify-content-center mb-4">
        <div class="col-12 d-flex justify-content-center gap-4">
            <form action="user" method="get" class="d-flex gap-4">
                <button type="submit" name="UserController" value="Pass Book" class="btn btn-light fs-5">Pass Book</button>
                <button type="submit" name="UserController" value="New Transaction" class="btn btn-light fs-5">New Transaction</button>
                <button type="submit" name="UserController" value="Edit Profile" class="btn btn-light fs-5">Edit Profile</button>
            </form>
        </div>
    </div>

    <!-- Image -->
    <div class="text-center">
        <img src="./includes/bank.jpeg" class="rounded img-fluid" alt="Bank-image" width="70%" />
    </div>

</div>
</body>
</html>
