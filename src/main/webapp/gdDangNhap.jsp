<%@ page import="entity.Thanhvien084" %><%--
  Created by IntelliJ IDEA.
  User: 84981
  Date: 11/14/2023
  Time: 7:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    Thanhvien084 auth = (Thanhvien084) request.getSession().getAttribute("auth");
    if(auth != null){
        if(auth.equals("ADMIN")){
            response.sendRedirect("/qly");
        }else{
            response.sendRedirect("/kh");
        }
    }
%>
<html>
<head>
    <title>Dang Nhap</title>
    <link href = "main.css" rel = "stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div class="container">
    <div class="card-header text-center">Đăng nhập</div>
    <div class="card-body">
        <form action="/dang-nhap" method="post">
            <!-- Email input -->
            <div class="form-outline mb-4">
                <input name="username"  id="form2Example1" class="form-control" />
                <label class="form-label" for="form2Example1">Username</label>
            </div>

            <!-- Password input -->
            <div class="form-outline mb-4">
                <input name="password"  id="form2Example2" class="form-control" />
                <label class="form-label" for="form2Example2">Password</label>
            </div>
            <!-- Submit button -->
            <button type="submit" class="btn btn-primary btn-block mb-4">Login</button>

        </form>
    </div>
</div>
</body>
</html>

