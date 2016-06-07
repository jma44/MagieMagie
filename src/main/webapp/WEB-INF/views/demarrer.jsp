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
        <script src="js/jquery-2.2.4.js" type="text/javascript"></script>
        <script lang="javascript">
            $(function(){
                
                function rafraichir(){
                    $("#liste").load("rafraichir_liste");
                }
                
                setInterval(rafraichir, 5000);    
            });
        </script>
    </head>
    <body>
        <h1>Ecran Demarrer une partie</h1>
        <div id="liste">
            <c:forEach items="${listeJoueurs}" var="joueur">
                Joueur en attente : ${joueur.pseudo}
                <br>
            </c:forEach>             
        </div>
        <form method="post">
            <input type="submit" title="Demarrer"/>
        </form>
</html>
