<%-- 
    Document   : CONTENU
    Created on : 6 juin 2016, 11:57:01
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
        <h1>PLATEAU DE JEU</h1>
        <form method="post" action="">
            <label>Ingredient 1 : </label>
            <select name="listeIngredient">
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
            <input type="submit" value="Lancer Sort" title="Lancer Sort"/>
            <input type="submit" value="Passer Tour" title="Passer Tour"/>           
        </form>
    </body>
</html>
