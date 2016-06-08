<%-- 
    Document   : Connexion
    Created on : 6 juin 2016, 12:16:01
    Author     : ajc
--%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
            <TABLE BORDER>
                <TR>
                    <TD>  <img src="Images/Sorciere1.png"  width="120" height="200"></TD> 
                    <TD>  <img src="Images/Sorciere2.png"  width="120" height="200"></TD> 
                    <TD>  <img src="Images/Sorciere3.png"  width="120" height="200"></TD> 
                    <TD>  <img src="Images/Sorciere4.png"  width="120" height="200"></TD> 
                    <TD>  <img src="Images/Sorciere5.png"  width="120" height="200"></TD> 
                    <TD>  <img src="Images/Sorciere6.png"  width="120" height="200"></TD> 
                    <TD>  <img src="Images/Sorciere7.png"  width="120" height="200"></TD> 
                    <TD>  <img src="Images/Sorciere8.png"  width="120" height="200"></TD> 
                </TR>
                <TR>
                    <TD>   <form:radiobutton path="numAvatar" value="1"/></TD>
                    <TD>  <form:radiobutton path="numAvatar" value="2"/></TD> 
                    <TD>   <form:radiobutton path="numAvatar" value="3"/></TD> 
                    <TD>   <form:radiobutton path="numAvatar" value="4"/></TD> 
                    <TD>    <form:radiobutton path="numAvatar" value="5"/></TD> 
                    <TD>    <form:radiobutton path="numAvatar" value="6"/></TD> 
                    <TD>   <form:radiobutton path="numAvatar" value="7"/></TD>
                    <TD>   <form:radiobutton path="numAvatar" value="8"/></TD>
                </TR>
            </TABLE>
            <br><br>
            <input type="submit" title="Connexion"/>
        </form:form>
    </body>
</html>

