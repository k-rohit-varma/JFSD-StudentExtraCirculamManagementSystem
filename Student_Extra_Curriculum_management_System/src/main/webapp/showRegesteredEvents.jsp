
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
    <div class="container">
        <h1>These are the registered events by <c:out value="${id}"></c:out> </h1>
        <div class="container">
        <table class="table">
            <thead>
                <tr>
                    <th>Event Name</th>
                    <th>UnRegister</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${list}" var="event">
                    <tr>
                        <td><c:out value="${event.eventName}"/></td>
                        <td> <button><a href="EventUnregister?id=${id}&name=${event.eventName}">UnRegister</a></button> </td>                    
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    <a href="studenthome?id=${id}">back to home</a>
</body>
</html>