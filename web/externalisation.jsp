<%--
  Created by IntelliJ IDEA.
  User: Mikee
  Date: 28/03/2019
  Time: 21:04
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="${request.locale}" />
<fmt:setBundle basename="ch.hesge.programmation.labels" var="msg" />

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="$[request.locale]">
<head>
    <meta charset="UTF-8">
    <title></title>
</head>
<body>
<h1><fmt:message key="title" bundle="${msg}"/></h1>
<form>
    <label for="firstName"><fmt:message key="first-name" bundle="${msg}"/> :</label>
    <input type="text" id="firstName" name="firstName"/>
    <label for="lastName"><fmt:message key="last-name" bundle="${msg}"/> :</label>
    <input type="text" id="lastName" name="lastName">
    <input type="submit" value="<fmt:message key="submit" bundle="${msg}"/>">
</form>
</body>
</html>
