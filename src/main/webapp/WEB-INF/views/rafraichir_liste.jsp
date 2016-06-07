<%-- 
    Document   : test
    Created on : 7 juin 2016, 09:18:53
    Author     : ajc
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:forEach items="${listeJoueurs}" var="joueur">
    ${joueur.pseudo}
    <br>
</c:forEach>
J'ai changé