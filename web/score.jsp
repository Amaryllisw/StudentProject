<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<form>
    <table>
        <tr>
            <th>姓名</th>
            <th>语文</th>
            <th>数学</th>
            <th>英语</th>
        </tr>
        <c:forEach items="${sessionScope.scoremaps}" var="item">

        </c:forEach>
    </table>
    <input type="text">
    <input type="submit" value="查询">
</form>
