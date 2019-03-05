<%-- 
    Document   : venta
    Created on : Mar 5, 2019, 12:26:20 PM
    Author     : juan.b.rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Id Factura</h1>
        ${mensaje}<br/>
        <table>
            <tr>
                <th>Id Factura</th>
                <th>Fecha Factura</th>
                <th>Valor Factura</th>
            </tr>
            <c:forEach items="${factura}" var="fac">
                <tr>
                    <td><c:out value="${fac.idFactura}"></c:out>
                    <td><c:out value="${fac.fechaFactura}"></c:out>
                    <td><c:out value="${fac.valorFactura}"></c:out>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
