<%-- 
    Document   : rafraichir_liste_nbcartes
    Created on : 8 juin 2016, 09:52:51
    Author     : ajc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:forEach items="${listeJoueurs}" var="joueur">
    ${joueur.pseudo} : &nbsp; ${joueur.nbreCartes} &nbsp; cartes
    <br>
</c:forEach>
J'ai changé