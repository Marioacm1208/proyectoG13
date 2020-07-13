<%-- 
    Document   : sellsReport
    Created on : Jul 12, 2020, 8:38:50 PM
    Author     : Guillermo Vega
--%>
<%@page import="DAO.json.UserDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.User"%>
<%@page import="DAO.json.JsonUserManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>Sells Report</title>
    </head>
    <%
        UserDAO dao = new UserDAO();
        ArrayList<User> list = dao.list();
        Iterator it = list.iterator();
        User user = null;
    %>    
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>>
        <div class="card-deck">
            <div class="card mb-3">
                <h3 class="card-header">SELLS REPORT</h3>
                <div class="card-body">
                    <p class="card-text"><%=user.getShoppingHistory()%></p>
                </div>    
            </div>        
        </div>

    </body>
    <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
    <%@include file="footer.jsp"%>   
</html>
