<%-- 
    Document   : reports
    Created on : Jul 11, 2020, 7:08:47 PM
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
        <title>JSP Page</title>
    </head>
    <%
    
    %>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>>  
        
        <div class="card-deck">
            <div class="card mb-3">
                <h3 class="card-header">USERS REPORTS</h3>
                <div class="card-body">
                            <h4 class="card-title">Users purchases report</h4>
                            <h5 class="card-title">Summary</h5>
                            <p class="card-text">Here are the purchases reports of a registered user.</p>
                            boton para ir al otro lado
                            <h4 class="card-title">Users data report</h4>
                            <h5 class="card-title">Summary</h5>
                            <p class="card-text">Here are the data of a registered user.</p>
                            boton para ir al otro lado
                </div>
            </div>
                            
            <div class="card mb-3">
                <h3 class="card-header">ADMINS REPORTS</h3>
                <div class="card-body">
                            <h4 class="card-title">Admins sells report</h4>
                            <h5 class="card-title">Summary</h5>
                            <p class="card-text">Here are the sells reports of an administrator.</p>
                            boton para ir al otro lado
                            <h4 class="card-title">Admins data report</h4>
                            <h5 class="card-title">Summary</h5>
                            <p class="card-text">Here are data of an administrator.</p>
                            boton para ir al otro lado
                </div>        
            </div>
            
            <div class="card mb-3">
                <h3 class="card-header">VEHICLES REPORTS</h3>
                <div class="card-body">
                            <h4 class="card-title">Most popular vehicles report</h4>
                            <h5 class="card-title">Summary</h5>
                            <p class="card-text">Here is a list of the most popular 
                                3vehicles according on the sells.</p>
                            boton para ir al otro lado
                            <h4 class="card-title">Admins data report</h4>
                            <h5 class="card-title">Summary</h5>
                            <p class="card-text">Here are data of an administrator.</p>
                            boton para ir al otro lado
                </div>        
            </div>

            
        </div>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="footer.jsp"%>
    </body>
   
</html>
