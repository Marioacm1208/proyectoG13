<%-- 
    Document   : index
    Created on : 03/07/2020, 11:25:47 PM
    Author     : Mario Carranza Mena B52573
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
        <link href="https://fonts.googleapis.com/css2?family=Courgette&family=Poppins&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>IE Electric Mobility</title>
    </head>
    <body>
        <header>
            <%@include file="pages/navbar.jsp"%>
        </header>
        <div class="h-100 position-relative d-flex justify-content-center align-items-center">
            <div style="z-index: 1;">
                <h1 class="display-3">Go Electric!</h1>
                <%
                    if (current != null) {
                %>
                <p class="lead" style="text-shadow: 1px 1px #000; color: #fff">Mobility Electrification is Happening!</p>
                <p style="text-shadow: 1px 1px #000; color: #fff; font-size: 1.2em">Want to know more? Just hit the click button down below</p>
                <p class="lead">
                    <a class="btn btn-primary" href="Controller?action=search" role="button">Shop Now</a>
                <%} else {%>
                    <p class="lead" style="text-shadow: 1px 1px #000; color: #fff">Sign Up now for free and get a 15% off in your first purchase</p>
                    <p style="text-shadow: 1px 1px #000; color: #fff; font-size: 1.2em">Want to know more? Just hit the click button down below</p>
                    <p class="lead">    
                    <a class="btn btn-primary" href="/ProyectoG13/signup" role="button">SignUp</a>
                <%}%>
                </p>
            </div>
            <img src="img/homepageBg.jpg" class="position-absolute w-100 h-100" style="left: 0; top: 0; z-index: -1; object-fit: cover">
        </div>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="pages/footer.jsp"%>
    </body>
</html>