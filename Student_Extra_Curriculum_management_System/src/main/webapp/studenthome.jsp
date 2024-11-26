<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="StudentProfile.jsp" %>
    <%@taglib uri="jakarta.tags.core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student home</title>
<link rel="stylesheet" type="text/css" href="css/studenthome.css">

</head>
<body>
<h1>Student home  page</h1>
<c:out value="${id}"></c:out>
<br/>
<a href="/">logout</a>
	
<br/><br/>

<a href="showAllEventForStudent?id=${id}">view all events</a><br/><br/>

<a href="Events?id=${id}">Registered events</a>

</body>
</html>