<%-- 
    Document   : MENU_DROITE
    Created on : 6 juin 2016, 17:08:19
    Author     : ajc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTE DES JOUEURS</h1>
        <c:forEach items="${listeJoueurs}" var="joueur">
        ${joueur.pseudo} : &nbsp; ${joueur.nbrecartes} &nbsp; cartes             
        </c:forEach>   
    </body>
</html>
