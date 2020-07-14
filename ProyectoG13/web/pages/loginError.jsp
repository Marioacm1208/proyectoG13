<%-- 
    Document   : loginError
    Created on : 13/07/2020, 12:05:07 AM
    Author     : Mario Carranza Mena B51573
--%>

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
        <h1 class="align-content-center mt-2">Password or Email Does not match!</h1>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="footer.jsp"%>
    </body>
</html>
