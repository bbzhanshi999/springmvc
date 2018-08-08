<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/8/8
  Time: 10:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <script src="static/jquery.min.js"></script>
    <title>demo</title>
</head>
<script>
    function getData() {
        $.post("demo/data",null,function (result) {
            alert(JSON.stringify(result));
        },'json')
    }
</script>
<body>
    <a href="${pageContext.request.contextPath}/demo/view">view</a>
    <br/>
    <button onclick="getData()">获取数据</button>
</body>
</html>
