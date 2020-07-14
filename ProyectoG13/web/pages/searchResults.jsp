<%-- 
    Document   : searchResults
    Created on : 05/07/2020, 10:34:41 PM
    Author     : Mario
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="model.Vehicle"%>
<%@page import="DAO.json.VehicleDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>IE Electric Mov - Results</title>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>
        <%
            String searchParams = (String) session.getAttribute("searchParams");
            session.removeAttribute("searchParams");
            VehicleDAO dao = new VehicleDAO();
            ArrayList<Vehicle> results = dao.search(searchParams);
            System.out.println("RESULTS : " + results.size());
            if (!results.isEmpty()) {  
        %>
        <h1 class="mb-2"><%=results.size()%> search Result(s) for: <%=searchParams%></h1>
                <div class="card-columns">
                    <%for (Vehicle car : results) {%>
                        <div class="card mb-3">
                            <h3 class="card-header"><%=car.getBrand()%></h3>
                            <div class="card-body">
                                <h5 class="card-title"><%=car.getModelName()%></h5>
                                <h6 class="card-subtitle text-muted"><%=car.getYearModel()%></h6>
                            </div>
                            <img style="height: 200px; width: 100%; display: block;" src="img/cardImage.svg" alt="Card image">
                            <div class="card-body">
                                <%if (session.getAttribute("loggedUser") != null) {%>
                                    <p class="card-text">Price $: <%=car.getPrice()%></p>
                                <%} else{%>
                                    <p class="card-text">Login to know vehicles prices.</p>
                                <%}%>
                            </div>
                            <ul class="list-group list-group-flush">
                                <li class="list-group-item">Color: <%=car.getColor()%></li>
                                <li class="list-group-item">Power: <%=car.getPower()%></li>
                                <li class="list-group-item">Range: <%=car.getRange()%></li>
                                <li class="list-group-item">Top Speed: <%=car.getTopSpeed()%></li>
                                <li class="list-group-item">Aceleration: <%=car.getAceleration()%></li>
                                <li class="list-group-item">Doors: <%=car.getNumberOfDoors()%></li>
                                <li class="list-group-item">CarBody: <%=car.getBodyAndChassis()%></li>
                            </ul>
                        </div>
                    <%}%>
                </div>
            <%}else{%>
                <h1>No results for "<%out.print(searchParams);%>", try again</h1>
            <%}%>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="footer.jsp"%>
    </body>
</html>
