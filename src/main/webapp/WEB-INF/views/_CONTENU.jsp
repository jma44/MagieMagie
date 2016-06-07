<%-- 
    Document   : CONTENU
    Created on : 6 juin 2016, 11:57:01
    Author     : ajc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>PLATEAU DE JEU</h1>
        <c:forEach items="${listeSortilege}" var="sortilege">
        ${sortilege.sort}            
        </c:forEach>
        <form method="post" action="">
            <label>Sort 1 : </label>
            <input type ="text" name="sort1"/>
            &nbsp; &nbsp; &nbsp;  
            <label>Sort 2 : </label>
            <input type ="text" name="sort2"/>
            <br><br>
            <input type="submit" title="Lancer Sort"/>
            <input type="submit" title="Passer Tour"/>           
        </form>
    </body>
</html>
