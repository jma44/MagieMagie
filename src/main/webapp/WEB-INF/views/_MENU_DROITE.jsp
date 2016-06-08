<%-- 
    Document   : MENU_DROITE
    Created on : 6 juin 2016, 17:08:19
    Author     : ajc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:forEach items="${listeJoueurs}" var="joueur">
    ${joueur.pseudo} : &nbsp; ${joueur.nbreCartes} &nbsp; cartes
    <br>
</c:forEach>
J'ai changé