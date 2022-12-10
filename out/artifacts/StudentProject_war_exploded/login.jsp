<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <link rel="stylesheet" href="css/main.css">
  <link rel="stylesheet" href="css/common.css">
  <title>登录</title>
</head>
<body>
<div class="wrapper flex">
  <div class="center-box transition br8">
    <div class="title-box font-center">
      <h2>学生成绩管理系统</h2>
      <div class="line"></div>
    </div>
    <form class="form-box" action="/login" method="post">
      <div class="input-box">
        <div class="input-wrapper">
          <label class="block">
            <p class="gray">用户名</p>
            <input type="text" name="username" id="" class="block transition" required>
          </label>
        </div>
        <div class="input-wrapper">
          <label class="block">
            <p class="gray">密码</p>
            <input type="password" name="password" id="" class="block transition" required>
          </label>
        </div>
        <div class="input-wrapper">
          <div class="hidden">
            <div class="fl">
              <label><input type="radio" name="role" id="" value="teacher" checked><span class="gray">教师</span></label>
              <label><input type="radio" name="role" id="" value="student"><span class="gray">学生</span></label>
            </div>
            <div class="fr">
                <a href="register.jsp" class="register-box transition">点击注册</a>
            </div>
          </div>
          <div class="error-box">
            <p class="${param.err == -1 ? 'block' : 'none'}">用户名或密码错误，请重新输入</p>
          </div>
        </div>
      </div>
      <div class="button-box">
        <input type="submit" value="登录" class="block transition">
      </div>
    </form>
  </div>
</div>
</body>

<c:if test="${not empty sessionScope.username}">
  <% response.sendRedirect("index.jsp"); %>
</c:if>
</html>