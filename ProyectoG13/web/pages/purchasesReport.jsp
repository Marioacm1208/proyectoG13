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
        <title>JSP Page</title>
    </head>
    <%
        UserDAO dao = new UserDAO();
        ArrayList<User> list = dao.list();
        Iterator it = list.iterator();
        User user = null; // darle el valor del usuario que inicio sesion
        
    %>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>>
        <div class="card-deck">
            <div class="card mb-3">
                <h3 class="card-header">USER PURCHASES</h3>
                <div class="card-body">
                    <p class="card-text"><%=user.getShoppingHistory%></p>
                </div>    
            </div>        
        </div>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="footer.jsp"%>            
    </body>
</html>
