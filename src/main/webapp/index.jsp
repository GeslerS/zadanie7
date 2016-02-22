<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
    <title>Hello!</title>
</head>
<body>
<form:form method="POST" action="/login">
    <input type="text" name="username"/>
    <input type="password" name="password"/>
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>
