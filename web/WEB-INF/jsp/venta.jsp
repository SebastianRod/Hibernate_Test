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
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Consulta Ventas</title>
    </head>
    <body>
        <div class="about-heading">
            <h1>Consultar <span>Ventas</span></h1>
        </div>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="table-responsive">
                    <center><h2>Datos Factura</h2></center>
                    <table id="tablaResultado" class="table table-bordered table-striped table-hover">
                        <tr>
                            <th>Id Factura</th>
                            <th>Fecha Factura</th>
                            <th>Valor Factura</th>
                            <th>Accion</th>
                        </tr>
                        <c:forEach items="${factura}" var="fac">
                            <tr>
                                <td><c:out value="${fac.idFactura}"></c:out>
                                <td><c:out value="${fac.fechaFactura}"></c:out>
                                <td><c:out value="${fac.valorFactura}"></c:out>
                                    <td>
                                        <a href="<c:url value="detalleVenta.htm?id=${fac.idFactura}" />" class="btn btn-default">Detalle venta</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
    </body>
</html>
