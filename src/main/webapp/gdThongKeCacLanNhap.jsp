<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="entity.Caclannhaphang084" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.DAO" %>
<%@ page import="dao.CaclannhaphangDAO" %>

<%
    HttpSession httpSession = request.getSession();
    int Id = (int) httpSession.getAttribute("idNCC");
    Connection connection = DAO.getConnection();
    List<Caclannhaphang084> caclannhaphang084s = new CaclannhaphangDAO(connection).getTKLanNhapHang(Id);
%>
<html>
<head>
    <title>Danh sách các lần nhập hàng</title>
    <link href = "main.css" rel = "stylesheet">
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div>
    <div class="admin-container">
        <div class="container content-top">
        </div>
        <div class="container content-mid mt-3">
            <h2>Danh sách các lần nhập hàng</h2>
            <table class="table table-striped" id="nccTable">
                <thead>
                <tr>
                    <th scope ="col">Id</th>
                    <th scope="col">Ngày nhập</th>
                    <th scope="col">Số lượng hàng nhập</th>
                </tr>
                </thead>
                <tbody>
                <%
                    if(!caclannhaphang084s.isEmpty()){
                        for(Caclannhaphang084 c : caclannhaphang084s){


                %>
                <tr>
                    <th scope="row"><a href = "/nhap-hang?id=<%=c.getId()%>"><%=c.getId()%></a></th>
                    <th scope="row"><%=c.getNgaynhap()%></th>
                    <th scope="row"><%=c.getSoluonghangnhap()%></th>
                </tr>
                <%
                        }
                    }else{
                        System.out.println("No item");
                    }
                %>
                </tbody>
            </table>
        </div>

        <div class="container content-bottom mt-3 flex flex-start">
            <button type="button" class="btn btn-primary ml-3"><a href="/ncc">Back</a></button>
        </div>
    </div>
</div>
</body>

</html>
