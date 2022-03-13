<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: vinev
  Date: 23.02.2022
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Дорогой работник.</h2>
<br>
<h3>Пожалуйста введите своё имя</h3>
<br>
<form:form action="showDetails" modelAttribute="employee" method="get">

    Name <form:input path="name"/> <form:errors path="name"/>

    <br>
    Surname <form:input path="surName"/> <form:errors path="surName"/>
    <br>

    Salary <form:input path="salary"/><form:errors path="salary"/>
    <br>
    Department <form:select path="department">


    <form:options items="${employee.departments}"/>
<%--    <form:option value="Information Technology" label="IT"/>--%>
<%--    <form:option value="Human Resourses" label="HR"/>--%>
<%--    <form:option value="Sales" label="Sales"/>--%>
    </form:select>
    <br>
    Which car do you want?
    <form:radiobuttons path="carBrend" items="${employee.carBrends}"/>
    <br>
    Foreign language(s)
<%--    EN<form:checkbox path="languages" value="English"/>--%>
<%--    RU<form:checkbox path="languages" value="Russian"/>--%>
<%--    Fr<form:checkbox path="languages" value="French"/>--%>
    <form:checkboxes path="languages" items="${employee.langList}"/>


<%--    BMW <form:radiobutton path="carBrend" value="BMW"/>--%>
<%--    AUDI <form:radiobutton path="carBrend" value="Audi"/>--%>
<%--    MB <form:radiobutton path="carBrend" value="Mercedec-Benz"/>--%>
    <br>
    You Phone number <form:input path="phoneNumber"/><form:errors path="phoneNumber"/>
    <br>
    You email <form:input path="email"/><form:errors path="email"/>


    <input type="submit" value="Ok">

</form:form>
</body>
</html>
