<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: progersapog
  Date: 02.03.2021
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>All employee</title>
</head>
<body>
<h3>Information for all employees</h3>
<br><br>

<!-- Доступ только авторизирвоанным HR'ам-->
<security:authorize access="hasRole('HR')">
    <input type="button" value="Salary" onclick="window.location.href = 'hr_info'">
    Only for HR staff
    <br><br>
</security:authorize>

<!-- Доступ только авторизирвоанным MANAGER'ам-->
<security:authorize access="hasRole('MANAGER')">
    <input type="button" value="Performance" onclick="window.location.href = 'manager_info'">
    Only for Managers
</security:authorize>
</body>
</html>
