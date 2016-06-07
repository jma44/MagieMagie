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
        <title>JSP Page</title>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="Menu_droite">
            <c:import url="_MENU_DROITE.jsp"/>
        </div>
        <div class="Menu_gauche">
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
