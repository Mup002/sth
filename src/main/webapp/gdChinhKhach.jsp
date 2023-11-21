<%
    int idKH = (int) request.getSession().getAttribute("idKH");

%>
<html>
<head>
    <title>Trang quan ly</title>
    <link href="style.css" rel="stylesheet" >
</head>
<body>
<div class="admin-container">
    <div class="header">
        <h1>Trang khach hang</h1>
    </div>
    <div class="content">
        <a href="/tracuudonhang?idKH=<%= idKH %>">Tra cuu hoa don</a>
    </div>
</div>
</body>
</html>
