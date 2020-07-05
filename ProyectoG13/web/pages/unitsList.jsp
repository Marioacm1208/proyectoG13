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
        <link href="../styles/bootstrap.css" rel="stylesheet" type="text/css"/>
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            <h1>Vehiculos Disponibles!</h1>
            <br>
            <table class="table-bordered">
                <thead>
                    <tr>
                        <th scope="col">Marca</th>
                        <th scope="col">Modelo</th>
                        <th scope="col">Precio</th>
                    </tr>
                </thead>
                <%                    
                    VehicleDAO dao = new VehicleDAO();
                    ArrayList<Vehicle> list = dao.list();
                    Iterator it = list.iterator();
                    Vehicle car = null;
                    while (it.hasNext()) {
                        car = (Vehicle)it.next();
                        System.out.println("CONSOLE: " + car.getModelName());
                %>
                <tbody>
                    <tr class="table-bordered">
                        <td class="text-center"><%=car.getBrand()%></td>
                        <td class="text-center"><%=car.getModelName()%></td>
                        <td class="text-center"><%=car.getPrice()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
    </body>
</html>
