<%-- 
    Document   : profile
    Created on : 12/07/2020, 04:55:22 AM
    Author     : Mario
--%>

<%@page import="DAO.json.UserDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <title>Profile - IE Electric Mobility</title>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>
        <div class="row">
            <div class="jumbotron col-md-5 col-sm-12 justify-content-start align-items-center">
                <h1 class="display-3">Hello <%=current.getName()%></h1>
                <p class="lead">This is your profile, everything is ok?</p>
                <hr class="my-4">
                <p>It uses utility classes for typography and spacing to space content out within the larger container.</p>
                <p class="lead">
                    <a class="btn btn-primary btn-lg" href="Controller?action=home" role="button">Go Home</a>
                </p>
            </div>
            <div class="col-md-7 col-sm-12 justify-content-start align-items-center">
                <div class="card bg-primary mr-lg-0 h-100">
                    <h3 class="card-header"><%=current.getName()%>'s Profile</h3>
                    <div class="card-body">
                        <h5 class="card-title">Personal Information</h5>
                        <h6 class="card-subtitle text-muted">My Avatar</h6>
                    </div>
                    <img style="margin-left: 15%; margin-right: 15%; height: auto; width: auto; display: block;" src="img/avatar.png" alt="Card image">
                    <div class="card-body">
                        <p class="card-text"></p>
                    </div>
                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Full Name: <%=current.getName() + " " + current.getLastname()%></li>
                        <li class="list-group-item">Email: <%=current.getEmail()%></li>
                    </ul>
                    <div class="card-footer text-muted">
                        Last Order: <%=current.getShoppingHistory()%>, 2 days ago
                    </div>
                </div>
            </div>
        </div>

        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
        <%@include file="footer.jsp"%>
    </body>
</html>
