<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="jakarta.tags.core" prefix="c"%>   
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Available Events</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>

<h1> <c:out value="${id}"></c:out> </h1>

    <div class="container">
        <h1>Available Events</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Branch</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>Venue</th>
                    <th>Type Of Event</th>
                    <th>Points</th>
                    <th>Max count</th>
                    <th>Register</th>
                   <!--  <th>UnRegister</th> -->
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${eventlist}" var="event">
                    <tr>
                        <td><c:out value="${event.name}"/></td>
                        <td><c:out value="${event.branch}"/></td>
                        <td><c:out value="${event.date}"/></td>
                        <td><c:out value="${event.time}"/></td>
                        <td><c:out value="${event.venue}"/></td>
                        <td><c:out value="${event.type}"/></td>
                        <td><c:out value="${event.points}"/></td>
                        <td><c:out value="${event.maxCount}"/></td>
                        <td> <button><a href="studentEventRegisterPage?name=${event.name}&id=${id}">Register</a></button></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    <a href="studenthome?id=${id}">back to home</a>
    
</body>
</html>
