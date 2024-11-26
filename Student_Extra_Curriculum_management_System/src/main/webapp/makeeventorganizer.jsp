<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Make Event Organizer</title>
<link rel="stylesheet" type="text/css" href="css/makeeventorganizer.css">
</head>
<body>

<div class="form-container">
    <h1>Make Event Organizer</h1>
    <form method="post" action="saveeventorganizer">
        <label>Enter ID:</label>
        <input type="text" name="oid" required>

        <label>Enter Name:</label>
        <input type="text" name="oname" required>

        <label>Enter Email:</label>
        <input type="text" name="oemail" required>

        <label>Enter Phone Number:</label>
        <input type="text" name="opn" required>

        <label>Enter Gender:</label>
        <input type="text" name="ogender" required>

        <label>Enter Password:</label>
        <input type="password" name="opwd" required>

        <input type="submit" value="Submit" class="submit-button">
    </form>
</div>

</body>
</html>
