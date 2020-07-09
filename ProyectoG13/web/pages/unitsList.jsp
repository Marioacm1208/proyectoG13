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
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>JSP Page</title>
    </head>
    <%
        VehicleDAO dao = new VehicleDAO();
        ArrayList<Vehicle> list = dao.list();
        Iterator it = list.iterator();
        Iterator it2 = list.iterator();
        Vehicle car = null;
        Vehicle car2 = null;
    %>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>
        <div class="card-deck">
            <%
                while (it2.hasNext()) {
                    car2 = (Vehicle)it2.next();      
            %>
                    <div class="card mb-3">
                        <h3 class="card-header"><%=car2.getBrand()%></h3>
                        <div class="card-body">
                            <h5 class="card-title"><%=car2.getModelName()%></h5>
                            <h6 class="card-subtitle text-muted"><%=car2.getYearModel()%></h6>
                        </div>
                        <img style="height: 200px; width: 100%; display: block;" src="img/cardImage.svg" alt="Card image">
                        <div class="card-body">
                            <p class="card-text">Login to know vehicles prices.</p>
                        </div>
                        <ul class="list-group list-group-flush">
                            <li class="list-group-item">Color: <%=car2.getColor()%></li>
                            <li class="list-group-item">Power: <%=car2.getPower()%></li>
                            <li class="list-group-item">Range: <%=car2.getRange()%></li>
                            <li class="list-group-item">Top Speed: <%=car2.getTopSpeed()%></li>
                            <li class="list-group-item">Aceleration: <%=car2.getAceleration()%></li>
                            <li class="list-group-item">Doors: <%=car2.getNumberOfDoors()%></li>
                            <li class="list-group-item">CarBody: <%=car2.getBodyAndChassis()%></li>
                        </ul>
                    </div>                
                <%}%>
        </div>

        <div class="container mb-5">
            <h1 class="mt-3">Available Cars</h1>
            <br>
            <table class="table table-hover">
                <thead>
                    <tr class="table-primary">
                        <th>Brand</th>
                        <th>Model Name</th>
                        <th>Price</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        while (it.hasNext()) {
                            car = (Vehicle) it.next();
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
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
    <%@include file="footer.jsp"%>
</html>
