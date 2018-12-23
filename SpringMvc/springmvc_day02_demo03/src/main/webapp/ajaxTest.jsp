<%--
  Created by IntelliJ IDEA.
  User: MI
  Date: 2018/12/16
  Time: 9:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <script src="js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#butt").click(function () {
                $.ajax({
                    type:"POST",
                    url:"ajax/testAjax",
                    da\\\========================================================================================================================================== -pb :"password=123&username=赵四",
                    success:function (data) {
                        alert("ok"+data)

                    },
                    error:function () {
                        alert("error")

                    }
                });
                
            });

        });


    </script>
</head>
<body>
    <input type="button" id="butt" value="testAjax"/>

</body>
</html>
