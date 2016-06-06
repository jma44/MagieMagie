<%-- 
    Document   : Connexion
    Created on : 6 juin 2016, 12:16:01
    Author     : ajc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link href="CSS/style.css" rel="stylesheet" type="text/css"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Ecran de Connexion</h1>
        <form:form modelAttribute="monJoueur" method="post">
            <label>Saisie du pseudo :</label>
            <form:input path="pseudo"/>
            <br><br>
            <label>Selection sorcière :</label>
            <br><br>
            <input type="submit" title="Connexion"/>
        </form:form>
    </body>
</html>
