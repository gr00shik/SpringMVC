<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Sergey
  Date: 24.05.2018
  Time: 11:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
    <link rel="stylesheet" href="css/index.css">
</head>

<body>
    <div class="div">
        <spring:form modelAttribute="user" action="/notes" method="post">
            Введите любое имя и пароль<br/>
            Это тестовая версия<br/><br/>
            <spring:input path="name" placeholder="Введите имя"/><br/><br/>
            <spring:password path="password" placeholder="Введите пароль"/><br/><br/>
            <spring:button value="Login" name="Login">Login</spring:button>
        </spring:form>
    </div>
</body>

</html>
