<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib uri="jakarta.tags.core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Event</title>
</head>
<body>
	<h2>Edit Event</h2>
	<form method="post" action="editEventSuccess" >
		<input type="hidden" name="ename" value= "${event.name }">
		<lable>Edit branch : </lable>
		<input type="text" name="ebranch" value="${event.branch}" ><br/><br/>
		
		<lable> Edit Date </lable>
		<input type="date" name="edate" value="${event.date}" ><br/><br/>
		
		<lable>Edit Time : </lable>
		<input type="time" name="etime" value="${event.time}" ><br/><br/>
		
		<lable>Edit Time : </lable>
		<input type="time" name="endtime" value="${event.endtime}" ><br/><br/>
		
		<lable>Edit Venue : </lable>
		<input type="text" name="evenue" value="${event.venue}" ><br/><br/>
		
		<lable>Edit Type : </lable>
		<input type="radio" name="etype" value="CSE" >CSE<br/><br/>
		<input type="radio" name="etype" value="ECE" >ECE<br/><br/>
		<input type="radio" name="etype" value="EEE" >EEE<br/><br/>
		
		
		<lable>Edit Points : </lable>
		<input type="text" name="epoints" value="${event.points}" ><br/><br/>
		
		<lable>Edit Count: </lable>
		<input type="text" name="ecount" value="${event.maxCount}" ><br/><br/>
		
		<input type="submit" value="save" >
	</form>
	
</body>
</html>