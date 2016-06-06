<%-- 
    Document   : Demarrer
    Created on : 6 juin 2016, 12:16:45
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
        <h1>Ecran Demarrer une partie</h1>
        <div>
             <c:forEach items="${listeJoueurs}" var="joueur">
             ${joueur.pseudo}            
             </c:forEach>             
        </div>
        <input type="submit" title="Demarrer"/>
    </body>
</html>
