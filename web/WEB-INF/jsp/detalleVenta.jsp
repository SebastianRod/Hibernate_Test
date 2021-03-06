<%-- 
    Document   : detalleVenta
    Created on : Mar 5, 2019, 1:46:13 PM
    Author     : juan.b.rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <title>Detalle Venta</title>
    </head>
    <body>
        <div class="about-heading">
            <h1>Detalle <span>Venta</span></h1>
        </div>
        <br/>
        <div class="container">
            <div class="panel panel-primary">
                <div class="table-responsive">
                    <center><h2>Datos Factura</h2></center>
                    <table id="tablaResultadoFactura" class="table table-bordered table-striped table-hover">
                        <tr>
                            <th>Id Factura</th>
                            <th>Fecha Factura</th>
                            <th>Valor Factura</th>
                        </tr>
                        <c:forEach items="${factura}" var="fac">
                            <tr>
                                <td><c:out value="${fac[0]}"></c:out>
                                <td><c:out value="${fac[1]}"></c:out>
                                <td><c:out value="${fac[2]}"></c:out>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="panel panel-primary">
                <div class="table-responsive">
                    <center><h2>Datos Cliente</h2></center>
                    <table id="tablaResultadoCliente" class="table table-bordered table-striped table-hover">
                        <tr>
                            <th>Id Cliente</th>
                            <th>Tipo documento Cliente</th>
                            <th>Nombres Cliente</th>
                            <th>Apellidos Cliente</th>
                            <th>Telefono Cliente</th>
                            <th>Correo Cliente</th>
                            <th>Direccion Cliente</th>
                        </tr>
                        <c:forEach items="${factura}" var="cli">
                            <tr>
                                <td><c:out value="${cli[3]}"></c:out>
                                <td><c:out value="${cli[4]}"></c:out>
                                <td><c:out value="${cli[5]}"></c:out>
                                <td><c:out value="${cli[6]}"></c:out>
                                <td><c:out value="${cli[7]}"></c:out>
                                <td><c:out value="${cli[8]}"></c:out>
                                <td><c:out value="${cli[9]}"></c:out>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
        </div>
        <div class="container">
            <div class="panel panel-primary">
                <div class="table-responsive">
                    <center><h2>Datos Vehiculo</h2></center>
                    <table id="tablaResultadoVehiculo" class="table table-bordered table-striped table-hover">
                        <tr>
                            <th>Id Vehiculo</th>
                            <th>Placa Vehiuclo</th>
                            <th>Modelo Vehiculo</th>
                            <th>Precio Vehiculo</th>
                        </tr>
                        <c:forEach items="${factura}" var="veh">
                            <tr>
                                <td><c:out value="${veh[10]}"></c:out>
                                <td><c:out value="${veh[11]}"></c:out>
                                <td><c:out value="${veh[12]}"></c:out>
                                <td><c:out value="${veh[13]}"></c:out>
                            </tr>
                        </c:forEach>
                    </table>
                </div>
            </div>
            <center><a href="venta.htm">Volver</a></center>
        </div>
    </body>
</html>
