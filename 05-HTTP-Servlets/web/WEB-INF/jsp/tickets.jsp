<%--<%@ page import="com.dmdev.http.servlet.TicketServlet" %>--%>
<%--<%@ page import="com.dmdev.http.service.TicketService" %>--%>
<%--<%@ page import="com.dmdev.http.dto.TicketDto" %>--%>
<%--<%@ page import="java.util.List" %>&lt;%&ndash;--%>
  Created by IntelliJ IDEA.
  User: Admin
  Date: 1/13/2023
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%--<%@ taglib prefix="c" uri="http://mycompany.com" %>--%>
<%--<%@ include file="index.html" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:if test="${not empty requestScope.tickets}">
<h1>Купленные билеты:</h1>
<ul>
    <c:forEach var="ticket" items="${requestScope.tickets}">
        <li>${fn:toLowerCase(ticket.seatNo)}</li>
    </c:forEach>
</ul>
</c:if>

<%--    <%--%>
<%--        Long flightId = Long.valueOf(request.getParameter("flightId"));--%>
<%--        List<TicketDto> tickets = TicketService.getInstance().findAllByFlightId(flightId);--%>
<%--        for (TicketDto ticketDto : tickets) {--%>
<%--            out.write(String.format("<li>%s</li>", ticketDto.getSeatNo()));--%>
<%--        }--%>
<%--    %>--%>

</body>
</html>

<%--<%!--%>
<%--    public  void jspInit() {--%>
<%--        System.out.println("Hello World!");--%>
<%--    }--%>
<%--%>--%>
