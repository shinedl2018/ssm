<%--
  Created by IntelliJ IDEA.
  User: MI
  Date: 2018/12/14
  Time: 22:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <form action="/user/test" method="post">
        用户姓名:<input type="text" name="username"/><br>
        用户年龄:<input type="text" name="password"/><br>
        生日:<input type="text" name="birthday"/><br>
        <input type="submit" value="提交">

    </form>

    <a href="/user/testOne?username=林俊杰">test1</a>
    <a href="/user/testTwo?username=周杰伦">test2</a>
    <a href="/user/testThree?username=王力宏">test3</a>
    <a href="/user/testFour?username=五月天">test4</a>




</head>
<body>

</body>
</html>
