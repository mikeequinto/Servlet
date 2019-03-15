<%@ page import="ch.hesge.programmation.apiServlet.exo51.Person" %><%--
  Created by IntelliJ IDEA.
  User: john
  Date: 01.03.2019
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Person</title>
</head>
<body>
    <h1>Person</h1>
    <h3>First name : <%= request.getParameter("firstName")%></h3>
    <h3>Last name : <%= request.getParameter("lastName")%></h3>
</body>
</html>
