<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/13/2023
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<div>
    <c:if test="${not empty sessionScope.user}">
        <div id="logout">
            <form action="${pageContext.request.contextPath}/logout" method="post">
                <button type="submit">Logout</button>
            </form>
        </div>
    </c:if>
    <div id="locale">
        <form action="${pageContext.request.contextPath}/locale" method="post">
            <button type="submit" name="lang" value="ru_RU">RU</button>
            <button type="submit" name="lang" value="en_EN">EN</button>
        </form>
    </div>
    <fmt:setLocale
            value="${sessionScope.lang != null ? sessionScope.lang : (param.lang != null ? param.lang : 'en_EN')}"/>
    <fmt:setBundle basename="translations"/>
</div>
