<%-- 
    Document   : unitsList
    Created on : 03/07/2020, 11:38:19 PM
    Author     : Mario Carranza Mena B51573
--%>

<%@page import="DAO.json.VehicleDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Vehicle"%>
<%@page import="DAO.json.JsonVehicleManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>
        <div class="container">
            <h1>Vehiculos Disponibles!</h1>
            <br>
            <table class="table table-hover">
                <thead>
                    <tr class="table-primary">
                        <th>Marca</th>
                        <th>Modelo</th>
                        <th>Precio</th>
                    </tr>
                </thead>
                <tbody>
                <%                    
                    VehicleDAO dao = new VehicleDAO();
                    ArrayList<Vehicle> list = dao.list();
                    Iterator it = list.iterator();
                    Vehicle car = null;
                    while (it.hasNext()) {
                        car = (Vehicle)it.next();
                %>
                        <tr class="table-info">
                            <td><%=car.getBrand()%></td>
                            <td><%=car.getModelName()%></td>
                            <td><%=car.getPrice()%></td>
                        </tr>
                  <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
