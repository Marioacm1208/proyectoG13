<%--
    Document   : signup
    Created on : 10/07/2020, 03:21:52 AM
    Author     : Mario Carranza Mena B51573
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Signup - IE Electric Mobility</title>
        <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
        <link href="styles/style.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>
        <div class="row h-100">
            <div class="col-md-6 col-sm-12 d-flex justify-content-start align-items-center bg-primary">
                <div>
                    <h2 class="text-light">IE Electric Mobility<br>Signup Form</h2>
                    <p class="text-light">Already signed up?</p>                    
                    <button type="submit" class="btn btn-secondary">Login</button>
                </div>
            </div>
            <div class="col-md-6 col-sm-12 d-flex justify-content-start align-items-center">
                <div class="w-100 p-1">
                    <form method="post" action="/ProyectoG13/signup">
                        <div class="form-group">
                            <label>Name</label>
                            <input class="form-control" type="text" name="name" placeholder="Name"/>
                        </div>
                        <div class="form-group">
                            <label>Lastname</label>
                            <input class="form-control" type="text" name="lastName" placeholder="Lastname"/>
                        </div>                        
                        <div class="form-group">
                            <label>Email</label>
                            <input class="form-control" type="email" name="email" placeholder="Email"/>
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input class="form-control" type="password" name="password" placeholder="Password"/>
                        </div>
                        <button type="submit" class="btn btn-black">Sign Up</button>
                    </form>
                </div>
            </div>
        </div>
        <%@include file="footer.jsp"%>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
</html>
