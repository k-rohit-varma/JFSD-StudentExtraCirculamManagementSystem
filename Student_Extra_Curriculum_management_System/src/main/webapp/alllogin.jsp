<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="css/alllogin.css">
</head>
<body>
    <h1>Login page</h1>
    <form method="post" action="checkNormalLogin">
        <div class="form-group">
            <label class="form-label" for="sid">Enter your id:</label>
            <input class="form-control" type="text" id="sid" name="sid" required>
        </div>
        <div class="form-group">
            <label class="form-label" for="spwd">Enter your Password:</label>
            <input class="form-control" type="password" id="spwd" name="spwd" required>
        </div>
        <input class="btn" type="submit" value="Login">
    </form>
</body>
</html>
