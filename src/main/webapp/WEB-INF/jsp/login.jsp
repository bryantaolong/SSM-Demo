<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Log in</h1>
    <hr>

    <form action="${pageContext.request.contextPath}/user/submit">
        username：<input type="text" name="username"> <br>
        password：<input type="password" name="password"> <br>
        <input type="submit" value="submit">
    </form>
</body>
</html>
