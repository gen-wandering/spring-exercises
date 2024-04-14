<%@ page contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="ru">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login form</title>
</head>
<body>
<h2>Enter your data:</h2>
<form action="/api/users/login" method="post">
    <label for="username">Username:</label>
    <input type="text" id="username" name="username" value="${requestScope.user.getUsername()}"><br><br>
    <label for="email">Email:</label>
    <input type="email" id="email" name="email" value="${requestScope.user.getEmail()}"><br><br>
    <label for="password">Password:</label>
    <input type="password" id="password" name="password"><br><br>
    <label for="age">Age:</label>
    <input type="number" id="age" name="age" value="${requestScope.user.getAge()}"><br><br>
    <input type="submit" value="Register">
</form>
<br><br>
${requestScope.errors}
</body>
</html>
