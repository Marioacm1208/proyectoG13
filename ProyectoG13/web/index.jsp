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
        <%--<link href="styles/font-awesome.min.css" rel="stylesheet" type="text/css"/>--%>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>IE Electric Movility</title>
    </head>
    <body>
        <header>
            <%@include file="pages/navbar.jsp"%>
        </header>
        <div class="jumbotron">
            <h1 class="display-3">Go Electric!</h1>
            <p class="lead">Sign Up now for free and get a 15% off in your first purchase</p>
            <hr class="my-4">
            <p>Want to know more? Just hit the click button down below</p>
            <p class="lead">
                <a class="btn btn-primary btn-lg" href="#" role="button">SignUp</a>
            </p>
        </div>
        <div class ="container">
        </div>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
    <%@include file="pages/footer.jsp"%>
</html>