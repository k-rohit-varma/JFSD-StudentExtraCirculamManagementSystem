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
        <h1>Available Event Orgaizers</h1>
        
        <h3><c:out value="${message}"></c:out></h3>
        
        <table class="table">
            <thead>
                <tr>
                    <th>Id</th>
                   <th>Name</th>
                   <th>Password</th>
                   <th>Email</th>
                   <th>Phone Number</th>
                   <th>Gender</th>
                   <th>Edit</th>
                   <th>Delete</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${organizerList}" var="organizer">
                    <tr>
                        <td><c:out value="${organizer.id}"/></td>
                         <td><c:out value="${organizer.name}"/></td>
                          <td><c:out value="${organizer.password}"/></td>
                           <td><c:out value="${organizer.email}"/></td>
                            <td><c:out value="${organizer.phNumber}"/></td>
                             <td><c:out value="${organizer.gender}"/></td>
                             <td><button><a href="editOrganizer?id=${organizer.id}" >edit</a></button></td>
                             <td><button><a href="deteleteOrganizer?id=${organizer.id}">Delete</a></button></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
    <a href="adminhome">back to home page</a>
</body>
</html>