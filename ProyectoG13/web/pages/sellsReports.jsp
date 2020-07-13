<%-- 
    Document   : purchasesReport
    Created on : Jul 12, 2020, 7:08:29 PM
    Author     : Guillermo Vega
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
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>Purchases Report</title>
    </head>
    <%
        VehicleDAO dao = new VehicleDAO();
        ArrayList<Vehicle> purchasesList = dao.list();
        Iterator it1 = purchasesList.iterator();
        Vehicle car1 = null;
    %>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>>
        <div class="container mb-5">
            <h1 class="mt-3">SELLS REPORT</h1>
            <br>
            <table class="table table-hover">
                <thead>
                    <tr class="table-primary">
                        <th>Brand</th>
                        <th>Model Name</th>
                        <th>Amount of sells</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (it1.hasNext()) {
                            car1 = (Vehicle) it1.next();
                    %>
                    <tr class="table-info">
                        <td><%=car1.getBrand()%></td>
                        <td><%=car1.getModelName()%></td>
                        <td><%=car1.getSoldUnits()%></td>
                    </tr>
                    <%}%>
                </tbody>
            </table>
        </div>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="footer.jsp"%>            
    </body>
</html>
