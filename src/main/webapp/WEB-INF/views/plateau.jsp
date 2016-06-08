<%-- 
    Document   : plateau
    Created on : 6 juin 2016, 16:36:29
    Author     : ajc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href='<c:url value="/CSS/style.css"/>' rel="stylesheet" type="text/css"/>
        <title>Plateau</title>
        <script src="<c:url value="/js/jquery-2.2.4.js"/>" type="text/javascript"></script>
        <script lang="javascript">
            $(function(){

                function rafraichirCartes() {
                    $("#infos").load("<c:url value="/ajax_rafraichir_nbre_cartes"/>");
                }
                setInterval(rafraichirCartes, 10000);
                rafraichirCartes();
            });
        </script>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="menu_droite">
            <h2>LISTE DES JOUEURS</h2>
            <div id="infos">
            </div>
        </div>
        <div class="menu_gauche">
            <c:import url="_MENU_GAUCHE.jsp"/>
        </div>        
        <div class="contenu">
            <c:import url="_CONTENU.jsp"/>
        </div>            
        <div class="pied">
            <c:import url="_PIED.jsp"/>       
        </div>
    </body>
</html>
