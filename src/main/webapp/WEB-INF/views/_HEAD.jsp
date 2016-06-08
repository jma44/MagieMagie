<%-- 
    Document   : _HEAD
    Created on : 6 juin 2016, 11:11:15
    Author     : ajc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="CSS/style.css" rel="stylesheet" type="text/css"/>

<h1>LISTE DES JOUEURS</h1>
<c:forEach items="${listeJoueurs}" var="joueur">
    ${joueur.pseudo} : &nbsp; ${joueur.nbrecartes} &nbsp; cartes             
</c:forEach>        
