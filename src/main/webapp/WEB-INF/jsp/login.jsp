<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
    <title>Login</title>
</head>
<body>
<form:form action="/login" method="POST">
    <form:input type="text" path="username" />
    <form:input type="password" path="password" />
    <input type="submit" value="Login"/>
</form:form>

<!--<form action="/login" method='POST'>
    Username: <input type="text" name="username" /><br />
    Password: <input type="password" name="password" /><br />

    <br/>
    <input type="submit" value="Login" />
-->
</form>
</body>
</html>


