<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="jakarta.tags.core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Organizer</title>
</head>
<body>
<h1>Edit Organizer</h1>
	<form method = "post" action="updateOrganizerData" >
	
	<input type="hidden" value="${organizer.id}"  name="id" ><br/><br/>
	<label>update name :</label><input type="text" value="${organizer.name}" name="name"><br/><br/>
	<label>update password :</label><input type="text" value="${organizer.password}" name="pass"><br/><br/>
	<label>update email :</label><input type="text" value="${organizer.email}" name="email"><br/><br/>
	<label>update phNumber :</label><input type="text" value="${organizer.phNumber}" name="phno" ><br/><br/>
	<label>update gender :</label><input type="text" value="${organizer.gender}" name="gender"><br/><br/>
	<input type="submit" value="save" ><br/><br/>
	
		
	</form>
</body>
</html>