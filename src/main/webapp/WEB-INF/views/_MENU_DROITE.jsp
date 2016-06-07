<%-- 
    Document   : MENU_DROITE
    Created on : 6 juin 2016, 17:08:19
    Author     : ajc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>LISTE DES JOUEURS</h1>
        <div>
            <c:forEach items="${listeJoueurs}" var="joueur">
            ${joueur.pseudo} : &nbsp; ${joueur.nbreCartes} &nbsp; cartes
            <br>
            </c:forEach>            
        </div>
    </body>
</html>
