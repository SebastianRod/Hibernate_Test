<%-- 
    Document   : login
    Created on : Mar 28, 2019, 5:19:39 PM
    Author     : juan.b.rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <div class="container">
            <div class="panel panel-primary">
                <div class="panel-default" class="clase">Bienvenido</div>
                <div class="panel-body">
                    <form:form >
                        <center>
                            <div class="col-3">
                                <p>
                                    <form:label path="idUsuario">Usuario: </form:label>
                                    <form:input path="idUsuario"/>
                                </p>
                            </div>
                            <div class="col-3">
                                <p>
                                    <form:label path="passwordUsuario">Contraseña: </form:label>
                                    <form:input path="passwordUsuario"/>
                                </p>
                            </div>
                            <p>
                                <form:button>Ingresar</form:button>
                            </p>
                        </center>
                    </form:form>
                </div>
            </div>
        </div>
    </body>
</html>
