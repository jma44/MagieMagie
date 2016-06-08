<%-- 
    Document   : exercice
    Created on : 7 juin 2016, 14:51:02
    Author     : ajc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <script lang="javascript">
//                function logging (msg){
//                    alert('Logging : ' + msg);
//                }
            function changeTitre(){
                $('#titre').html('contenu modifie');                
            }
        </script>
    </head>
    <body>
        <!--<h1 onchange="logging('change')" onmouseover="alert('out');" onclick="alert('clic');">Hello World!</h1>-->
        <button type="button" id="bouton" value="Modifier titre"/>
        <div id="titre">*** Zone de Titre***</div>
    </body>
</html>
