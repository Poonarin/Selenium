<%-- 
    Document   : showLogin
    Created on : Jan 17, 2019, 9:28:30 AM
    Author     : Melnikov
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Аутентификация</title>
    </head>
    <body>
        <h1>Войдите!</h1>
        <form action="login" method="POST">
            Логин:<br>
            <input id="login" type="text" name="login">
            <br>
            Пароль:<br>
            <input id="password" type="password" name="password">
            <br>
            <input id="btnEnter" type="submit" value="Войти">
        </form>
    </body>
</html>
