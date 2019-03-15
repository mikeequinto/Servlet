<%--
  Created by IntelliJ IDEA.
  User: john
  Date: 14.03.2019
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Authentication page</title>
</head>
<body>
    <h1>Please log in</h1>

    <form action="auth/login" method="get">
        <input type="text" name="firstName" />
        <input type="text" name="lastName" />
        <input type="submit" name="submitBtn" value="login" />
    </form>
</body>
</html>
