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
        <div class="container">
            <h1>Take a look to your next car!</h1>
        </div>
        <div class ="container">
            <form class="form-inline my-2 my-lg-0" id="searchForm" method="post" action="Controller?action=search">
                <img src="../img/search.png" alt="Search"/>
                <input type="text" name="searchInput" placeholder="Marca, Nombre Modelo Tipo"/>
                <input type="submit" name="signIn" value="Buscar">
            </form>
        </div>
        <script src="js/jquery-3.5.1.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.min.js" type="text/javascript"></script>
    </body>
    <%@include file="pages/footer.jsp"%>
</html>            