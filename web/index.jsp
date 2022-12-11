
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>首页</title>
    <link href="css/common.css" rel="stylesheet">
    <link href="css/content.css" rel="stylesheet">
</head>
<body>
<c:if test="${empty sessionScope.userinfo}">--%>
        <% response.sendRedirect("login.jsp"); %>
</c:if>

<div class="wrapper flex">
    <c:import url="nav.jsp">
    </c:import>
    <div class="main-wrapper">
        <c:import url="top-bar.jsp"></c:import>
        <div class="center-wrapper">
            <main class="main-box">

            </main>
        </div>
    </div>
</div>
</body>
</html>
