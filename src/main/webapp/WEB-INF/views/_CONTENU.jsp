<%-- 
    Document   : CONTENU
    Created on : 6 juin 2016, 11:57:01
    Author     : ajc
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<h2>PLATEAU DE JEU</h2>
<c:if test="${Actif== true}">
    <form:form method="post" modelAttribute="dto">
        <label>Ingredient 1 : </label>
        <form:select path="ing1Id" items="${listeIngredient}" itemLabel="typeIngredient" itemValue="id"/>
        &nbsp; &nbsp; &nbsp;  
        <label>Ingredient 2 : </label>
        <form:select path="ing2Id" items="${listeIngredient}" itemLabel="typeIngredient" itemValue="id"/>
        <br><br>
        &nbsp; &nbsp; &nbsp;
        <label>Choix cible : </label>
        <form:select path="victimeId" items="${listeJoueurs}" itemLabel="pseudo" itemValue="id"/>
        <br><br><br><br>
        <input type="submit" value="Lancer Sort" title="Lancer Sort"/>
        <input type="submit" value="Passer Tour" title="Passer Tour"/>           
    </form:form>
</c:if>
