<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/common.css" rel="stylesheet">
    <link href="css/content.css" rel="stylesheet">
</head>
<body>
    <div class="top-bar-wrapper">
        <div class="top-bar-box center-wrapper">
            <div class="top-bar">
                <div class="fl">
                    kk
                </div>
                <div class="fr user-info-box">
                    <p>欢迎你，${sessionScope.userinfo.getUsername()} <span>${sessionScope.userinfo.getRole() == "teacher" ? "老师" : "同学"}</span></p>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
