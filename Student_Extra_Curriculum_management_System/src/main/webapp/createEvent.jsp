<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Make Event</title>
    <link rel="stylesheet" type="text/css" href="css/createEvent.css">
    <script>
        window.onload = function() {
            // Get today's date and add 4 days
            let today = new Date();
            let maxDate = new Date();
            maxDate.setDate(today.getDate() + 4);

            // Format the maxDate as yyyy-mm-dd
            let formattedMaxDate = maxDate.toISOString().split('T')[0];

            // Set the max attribute on the date input field
            document.getElementById("eventDate").setAttribute("max", formattedMaxDate);
        }
    </script>
</head>
<body>
    <h1>Make Event Page</h1>
    <form method="post" action="createEvents">
        <label>Enter Event Name:</label>
        <input type="text" name="ename" required><br/><br/>

        <label>Select Branch:</label><br/>
        <label>CSE</label>
        <input type="radio" value="cse" name="branch" required><br/>
        <label>ECE</label>
        <input type="radio" value="ece" name="branch" required><br/>
        <label>EEE</label>
        <input type="radio" value="eee" name="branch" required><br/>

        <label>Select Date:</label>
        <input type="date" id="eventDate" name="date" required><br/><br/>

        <label>Select Time:</label>
        <input type="time" name="time" required><br/><br/>
		
		 <label>Select End Time:</label>
        <input type="time" name="endtime" required><br/><br/>
		
        <label>Enter Venue:</label>
        <input type="text" name="venue" required><br/><br/>

        <label>Event Type:</label><br/>
        <label>TECH</label>
        <input type="radio" value="tech" name="type" required><br/>
        <label>HWB</label>
        <input type="radio" value="hwb" name="type" required><br/>
        <label>SOCIAL</label>
        <input type="radio" value="social" name="type" required><br/>
        <label>COMEDY</label>
        <input type="radio" value="comedy" name="type" required><br/>

        <label>Event Points:</label>
        <input type="text" name="points" required><br/><br/>

        <label>Event Max Count:</label>
        <input type="text" name="count" required><br/><br/>

        <input type="submit" value="Create Event">
    </form>
</body>
</html>
