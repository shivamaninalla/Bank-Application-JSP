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
<c:set var="name" value="hni">

</c:set>

<h1>Welcome ${name}</h1>
<c:if test="${name.length()>=5 }">
<h2>Name ${name} has length greater than 5</h2>
</c:if>

<c:if test="${name.length()<5 }">
<h2>Name ${name} has length lesser than 5</h2>
</c:if>

<c:choose>
<c:when test="${name.length()>5 }">Name is greater than 5
</c:when>
<c:when test="${name.length()>=3 }">Name is greater than 3
</c:when>
<c:otherwise>Name is less than 3</c:otherwise>
</c:choose>

</body>
</html>