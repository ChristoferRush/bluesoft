<%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 4/5/2019
  Time: 8:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Agreements</title>
</head>
<body>
<c:forEach items="${agreements}" var="agreement">
    <c:out value="${agreement.id}"/>
</c:forEach>
</body>
</html>
