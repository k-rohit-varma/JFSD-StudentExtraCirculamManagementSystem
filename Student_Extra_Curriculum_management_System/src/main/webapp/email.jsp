<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Mail Sending</h1>
<form method="post" action="sending" >
	<label>Send email to :</label><input type="text" name="toEmail" ><br/><br/>
	<label>Subject :</label><textarea rows="2" cols="80" name="subject"></textarea>
	<br/><br/>
	<label>Message :</label>
	<textarea rows="5" cols="80" name="message"></textarea>
	<br/><br/>
	
	<input type="submit" value ="send" >
	
</form>
</body>
</html>