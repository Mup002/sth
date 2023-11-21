<%@ page import="java.sql.Connection" %>
<%@ page import="dao.DAO" %>
<%@ page import="entity.Hoadon084" %>
<%@ page import="dao.HoaDonDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>\
<%
    HttpSession httpSession = request.getSession();
    int id = (int) httpSession.getAttribute("idDH");
    Connection connection = DAO.getConnection();
    Hoadon084 hoadon084 = new HoaDonDAO(connection).getDonHang(id);
%>
<html>
<head>
    <title>Chi tiet don hang</title>
</head>
<body>
<%
    if(hoadon084 != null){


%>
<div>
    <p>Ngay dat: <%=hoadon084.getNgayNhap()%></p>
    <p>Xac nhan don hang: <%=hoadon084.getXacnhandonhang()%></p>
    <p>Tong tien: <%=hoadon084.getTongTien()%></p>
    <p>Trang thai thanh toan: <%=hoadon084.getTrangthaithanhtoan()%></p>
</div>
<%
} else {
%>
<div class="error">
    <p>Không tìm thấy don hang.</p>
</div>
<%
    }
%>
</body>
</html>
