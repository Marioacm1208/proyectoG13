<%-- 
    Document   : search
    Created on : 05/07/2020, 10:37:13 PM
    Author     : Mario
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="styles/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <title>IElectric Movility - Buscar</title>
    </head>
    <body>
        <header>
            <%@include file="navbar.jsp"%>
        </header>
        <h1>Search your next car!</h1>
        <div class ="container">
            <form id="searchForm" method="post" action="Controller?action=search">
                <img src="img/search.png" alt="Search"/>
                <input type="text" name="searchInput" placeholder="Marca, Nombre Modelo Tipo"/>
                <hr>
                <input type="submit" name="signIn" value="Sign In">
            </form>
        </div>
    </body>
</html>