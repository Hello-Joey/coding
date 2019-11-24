<%--
  Created by IntelliJ IDEA.
  User: 涛声依旧
  Date: 2019/10/19
  Time: 17:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>号码查询服务</title>
</head>
<body>
欢迎进入号码查询服务<br>
<hr>
<br>
<script type="text/javascript">
    function validate(){
        if(inquireForm.user.value==""){
            alert("用户姓名不能为空")
            return;}
        if(inquireForm.number.value==""){
            alert("电话号码不能为空")
            return;}
    }
</script>
<form name="inquireForm" action="testFrom_result.jsp">
    用户姓名  :  <input name="user" type="text"><br>
    电话号码  :  <input name="number" type="text"><br>
    选择性别  :
    <input type="radio" name="sex"checked>男
    <input type="radio" name="sex">女<br>
    <input type="submit" value="查询">
    <input type="submit" value="重置">
</form>
</body>
</html>
