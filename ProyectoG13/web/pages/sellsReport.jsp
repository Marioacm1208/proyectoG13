<%-- 
    Document   : sellsReport
    Created on : Jul 12, 2020, 8:38:50 PM
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
        <title>JSP Page</title>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>>
        <div class="card-deck">
            <div class="card mb-3">
                <h3 class="card-header">SELLS REPORT</h3>
                <div class="card-body">
                    <p class="card-text"><%=user.getShoppingHistory%></p>
                </div>    
            </div>        
        </div>

    </body>
    <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="footer.jsp"%>   
</html>
