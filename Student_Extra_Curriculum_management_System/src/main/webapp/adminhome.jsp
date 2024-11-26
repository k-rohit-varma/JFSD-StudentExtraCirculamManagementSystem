<%@ page import="com.klef.jfsd.springboot.model.Admin" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Admin Home Page</title>
<link rel="stylesheet" type="text/css" href="css/adminhome.css">

<% 
// Prevent caching of this page
response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); 
response.setHeader("Pragma", "no-cache"); 
response.setDateHeader("Expires", 0);
%>

</head>
<body>

<%
Admin admin = (Admin) session.getAttribute("a");
if (admin == null) {
    response.sendRedirect("adminlogin.jsp");
    return;
}
%>

<div class="container">
    <h1>Admin Home Page</h1>
    
    <a href="makeeventorganizer" class="button">Make Event Organizer</a>
    <a href="showEventOrganizers" class="button">Show All Event Organizers</a>
    <a href="showAllEvents" class="button">Show All Events</a>
    
    <a href="emailPage" class="button">Send a Email</a>
    
    <a href="adminlogout" class="button">Logout</a>
</div>

</body>
</html>
