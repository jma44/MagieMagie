<%-- 
    Document   : _Template
    Created on : 6 juin 2016, 11:10:19
    Author     : ajc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <c:import url="_HEAD.jsp"/>
    </head>
    <body>
        <div class="titre">
            <c:import url="_TITRE.jsp"/>
        </div>
        <div class="contenu"></div>
            <c:import url="_CONTENU.jsp"/>
        <div class="pied">
            <c:import url="_PIED.jsp"/>       
        </div>
    </body>
</html>
