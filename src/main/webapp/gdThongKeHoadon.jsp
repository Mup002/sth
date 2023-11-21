<%@ page import="java.sql.Connection" %>
<%@ page import="dao.DAO" %>
<%@ page import="entity.Hoadon084" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.HanghoaDAO" %>
<%@ page import="dao.HoaDonDAO" %><%--
  Created by IntelliJ IDEA.
  User: 84981
  Date: 11/14/2023
  Time: 7:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    HttpSession httpSession = request.getSession();
    int Id = (int) httpSession.getAttribute("idKH");
    Connection connection = DAO.getConnection();
    List<Hoadon084> hoadon084s = new HoaDonDAO(connection).getAllHoaDon(Id);
    System.out.println(Id);
%>
<html>
<head>
    <title>Danh sách hoa don</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<body>
<div>
    <div class="admin-container">
        <div class="container content-mid mt-3">
            <h2>Danh sách hoa don</h2>
            <table class="table table-striped" id="nccTable">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Ngay dat</th>
                    <th scope="col">Tong tien</th>
                    <th scope="col">Xac nhan don hang</th>
                    <th scope="col">Trang thaio thanh toan</th>
                </tr>
                </thead>
                <tbody>
                <%
                    if(!hoadon084s.isEmpty()){
                        for(Hoadon084 h : hoadon084s){


                %>
                <tr>
                    <th scope="row"><a href ="/chi-tiet-don-hang?id=<%=h.getId()%>"><%=h.getId()%></a></th>
                    <th scope ="row"><%=h.getNgayNhap()%></th>
                    <th scope="row"><%=h.getTongTien()%></th>
                    <th scope="row"><%=h.getXacnhandonhang()%></th>
                    <th scope="row"><%=h.getTrangthaithanhtoan()%></th>
                </tr>
                <%
                        }
                    }else{
                        System.out.println("No ncc");
                    }
                %>
                </tbody>
            </table>
        </div>

        <div class="container content-bottom mt-3 flex flex-start">
            <button type="button" class="btn btn-primary ml-3"><a  href ="/kh">Back</a></button>
        </div>
    </div>
</div>
</body>
</body>
</html>
