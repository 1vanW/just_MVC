<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vinev
  Date: 23.02.2022
  Time: 14:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Добро пожаловать</h2>
<br>

<%--Your name: ${param.employeeName}--%>

Your name : ${employee.name}
<br>
Your surname:${employee.surName}
<br>
Your salary:${employee.salary}
<br>
Your department:${employee.department}
<br>
You want car: ${employee.carBrend}
<br>
Your language(s):
<ul>
    <c:forEach var = "lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>
<br>
Your number: ${employee.phoneNumber}
<br>
Your email: ${employee.email}
</body>
</html>
