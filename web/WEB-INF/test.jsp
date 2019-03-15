<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 15.03.2019
  Time: 13:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session & Attribut Listener</title>
</head>
<body>
    <form action="${page-context.request.contextPath}+/stockage" method="post">
        Object : <input type="radio" name="type" value="object">
        Date : <input type="radio" name="type" value="date">
        Array : <input type="radio" name="type" value="array">
        List : <input type="radio" name="type" value="list"><br>
        Key : <input type="text" name="key">
        <input type="submit" value="Store">
    </form>
</body>
</html>
