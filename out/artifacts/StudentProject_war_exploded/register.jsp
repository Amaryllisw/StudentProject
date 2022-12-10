<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/common.css">
    <title>注册</title>
</head>
<body>
<div class="wrapper flex">
    <div class="center-box transition br8">
        <div class="title-box font-center">
            <h2 class="">学生成绩管理系统</h2>
            <div class="line"></div>
        </div>
        <form class="form-box" action="/register" method="post">
            <div class="input-box">
                <div class="input-wrapper">
                    <label class="block">
                        <p class="gray">用户名</p>
                        <input type="text" name="username" id="username" class="block transition" required>
                    </label>
                </div>
                <div class="input-wrapper">
                    <label class="block">
                        <p class="gray">密码</p>
                        <input type="password" name="password" id="password" class="block transition" required>
                    </label>
                </div>
                <div class="input-wrapper">
                    <div class="fr">
                        <a href="login.jsp" class="register-box">返回登录</a>
                    </div>
                </div>
            </div>
            <div class="button-box">
                <input type="submit" value="注册" class="block transition">
            </div>
        </form>
    </div>
</div>
</body>
</html>