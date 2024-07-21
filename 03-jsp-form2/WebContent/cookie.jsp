<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</head>
<body>

  <form action="cookieresponse.jsp", method="get">
  <div class="container">
  <p>select fav prog lang</p>
  <select class=" custom-select bg-warning text-secondary"name="fl" id="">
      <option value="java">Java</option>
      <option value="C++">C++</option>
      <option value="C">C</option>
    </select>
   <!-- <input class="text-primary bg-danger" type="submit" value="
    submit"> -->
    <input class="btn btn-primary btn-sm " type="submit" value="Submit">
  </div>
    
  </form>
   

</body>
</html>