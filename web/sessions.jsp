<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 15.03.2019
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Nombre de Sessions</title>
</head>
<body>
    <h1>Nombre de sessions : <%= request.getAttribute("count") %></h1>

    <form method="post" action="${pageContext.request.contextPath}/sessions">
        Delete session<input type="radio" name="action" value="delete">
        <input type="submit" value="Go">
    </form>
</body>
</html>
