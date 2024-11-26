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
    <div class="container">
        <h1>Available Events</h1>
        <table class="table">
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Branch</th>
                    <th>Date</th>
                    <th>Time</th>
                    <th>End Time</th>
                    <th>Venue</th>
                    <th>Type Of Event</th>
                    <th>Points</th>
                    <th>Max count</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${eventsList}" var="event">
                    <tr>
                        <td><c:out value="${event.name}"/></td>
                        <td><c:out value="${event.branch}"/></td>
                        <td><c:out value="${event.date}"/></td>
                        <td><c:out value="${event.time}"/></td>
                        <td><c:out value="${event.endtime}"/></td>
                        <td><c:out value="${event.venue}"/></td>
                        <td><c:out value="${event.type}"/></td>
                        <td><c:out value="${event.points}"/></td>
                        <td><c:out value="${event.maxCount}"/></td>
                        <td><button><a href="editEvent?name=${event.name}" >Edit</a></button></td>
                        <td><button><a href="afterDeleteTable?name=${event.name}">Delete</a></button></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    
    
    
</body>
</html>
