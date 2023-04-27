<%-- 
    Document   : index
    Created on : 27 de abr. de 2023, 14:28:32
    Author     : QI
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>transporte</title>
        <link rel="stylesheet" href="css/style.css"/>
        <link rel="icon" href="img/icone.png"/>
    </head>
    <body>
        <form action="LoginController" method="post" id="form-login">
            <img src="img/logotipo.jpg" alt="logotipo" width="200"/>
            <br>
            <input type="text" name="user" id="user" class="fields" placeholder="Nome de Usuário" required>
            <br><br>
            <input type="password" name="pass" id="pass" class="fields" placeholder="Senha" required>
            <br><br>
            <input type="submit" value="Entrar">
        </form>
    </body>
</html>
