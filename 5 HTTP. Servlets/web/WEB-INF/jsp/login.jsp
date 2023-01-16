<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/16/2023
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%@include file="header.jsp"%>
<form action="${pageContext.request.contextPath}/login" method="post">
    <label for="emailId"><fmt:message key="page.login.email"/>:
        <input type="text" name="email" id="emailId" value="${param.email}" required>
    </label><br>
    <label for="passwordId"><fmt:message key="page.login.password"/>:
        <input type="password" name="password" id="passwordId" required>
    </label><br>
    <button type="submit"><fmt:message key="page.login.submit.button"/></button>
    <a href="${pageContext.request.contextPath}/registration">
        <button type="button"><fmt:message key="page.login.register.button"/></button>
    </a>
    <c:if test="${param.error != null}">
    <div style="color : red">
<%--<span>Email or password is not correct</span>--%>
        <span><fmt:message key="page.login.error"/></span>
    </div>
    </c:if>
</form>
</body>
</html>
