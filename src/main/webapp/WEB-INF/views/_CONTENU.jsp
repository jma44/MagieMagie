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
    <form:form method="post">
        <label>Ingredient 1 : </label>
        <form:select name="listeIngredient">
            <c:forEach items="${listeIngredient}" var="monIngredient1">
                <option value="${monIngredient1.id}">${monIngredient1.typeIngredient}</option>                    
            </c:forEach>               
        </select>
        &nbsp; &nbsp; &nbsp;  
        <label>Ingredient 2 : </label>
        <select name="listeIngredient">
            <c:forEach items="${listeIngredient}" var="monIngredient2">
                <option value="${monIngredient2.id}">${monIngredient2.typeIngredient}</option>                    
            </c:forEach>               
        </select>
        <br><br>
        &nbsp; &nbsp; &nbsp;
        <label>Choix cible : </label>
        <select name="listeJoueurs">
            <c:forEach items="${listeJoueurs}" var="maCible">
                <option value="${maCible.id}">${maCible.pseudo}</option>                    
            </c:forEach>               
        </select>
        <br><br><br><br>
        <input type="submit" value="Lancer Sort" title="Lancer Sort"/>
        <input type="submit" value="Passer Tour" title="Passer Tour"/>           
    </form>
</c:if>
