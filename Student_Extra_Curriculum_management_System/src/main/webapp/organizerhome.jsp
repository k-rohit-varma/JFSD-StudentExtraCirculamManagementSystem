<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.klef.jfsd.springboot.model.Organizer" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Organizer Home</title>
    <link rel="stylesheet" type="text/css" href="css/organizerhome.css">

    <% 
    // Prevent caching of the page to avoid showing the page after logout
    response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
    response.setHeader("Pragma", "no-cache");
    response.setDateHeader("Expires", 0);

    // Check if the user is logged in, if not, redirect to login page
    Organizer organizer = (Organizer) session.getAttribute("o");
    if (organizer == null) {
        response.sendRedirect("alllogin");  // Redirect to the login page if session is expired or not logged in
        return;
    }
    %>

</head>
<body>

<h1>Welcome to the Organizer Home Page</h1>

<!-- Logout link that invalidates session and redirects to the index page -->
<a class="logout-link" href="organizerlogout">Logout</a><br/><br/>

<!-- Links to create and view events -->
<a href="createEvent">Create Event</a><br/><br/>
<a href="showAllEvents">Show All Events</a>

</body>
</html>
