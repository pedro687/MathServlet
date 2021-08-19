<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Página Inicial" %>
</h1>
<br/>
<a href="pedro-servlet">Pedro Emanoel do Nascimento Silva</a>
<hr>
<h1> MathServlet </h1>
<form action="math-servlet" method="post">
    <div>
        <input type="text" name="n1" placeholder="Digite um número">
        <br>
        <input type="text" name="n2" placeholder="Digite um número">
        <input type="submit">
    </div>
</form>
</body>
</html>