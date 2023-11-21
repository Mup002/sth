<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="jakarta.servlet.http.*" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="entity.NCC084" %>
<%@ page import="java.util.List" %>
<%@ page import="dao.*" %>

<%
    HttpSession httpSession = request.getSession();
    String startDate = (String) httpSession.getAttribute("startDate");
    String endDate = (String) httpSession.getAttribute("endDate");

    Connection connection = DAO.getConnection();

    List<NCC084> nccs = new NCCDAO(connection).getTKNCC(startDate,endDate);

    System.out.println(startDate);
    System.out.println(endDate);
%>
<html>
<head>
    <title>Danh sách nhà cung cấp</title>
    <script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://unpkg.com/gijgo@1.9.14/js/gijgo.min.js" type="text/javascript"></script>
    <link href="https://unpkg.com/gijgo@1.9.14/css/gijgo.min.css" rel="stylesheet" type="text/css" />
</head>
<body>
<div>
    <div class="admin-container">
        <div class="container content-top">
            <form action="ThongKeNCCServlet" method="post" id="dateForm">
                <input type="hidden" name="startDate" id="hiddenStartDate">
                <input type="hidden" name="endDate" id="hiddenEndDate">
                <div class="row justify-content-end">
                    <div class="col-4">
                        <div class="dateStart">
                            <label>Ngày bắt đầu</label>
                            <input id="datepicker1" class="form-control" />
                        </div>
                    </div>
                    <div class="col-4 ml-5">
                        <div class="dateEnd">
                            <label>Ngày kết thúc</label>
                            <input id="datepicker2" class="form-control" />
                        </div>
                    </div>
                </div>
            </form>

        </div>

        <div class="container content-mid mt-3">
            <h2>Danh sách nhà cung cấp</h2>
            <table class="table table-striped" id="nccTable">
                <thead>
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Tên</th>
                    <th scope="col">Số lần nhập hàng</th>
                    <th scope="col">Số lượng hàng nhập</th>
                </tr>
                </thead>
                <tbody>
                <%
                    if(!nccs.isEmpty()){
                        for(NCC084 ncc : nccs){


                %>
                <tr>
                    <th scope="row"><%=ncc.getId()%></th>
                    <th scope="row"><a href="thong-ke-lan-nhap-hang?id=<%=ncc.getId()%>"><%=ncc.getTen()%></a></th>
                    <th scope="row"><%=ncc.getSoLanNhapHang()%></th>
                    <th scope="row"><%=ncc.getSoluonghangnhap()%></th>
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
            <button type="button" class="btn btn-primary ml-3"><a  href ="/xemthongke">Back</a></button>
        </div>
    </div>
</div>
</body>
<script>
    $(document).ready(function(){
        $('#datepicker1').datepicker({
            uiLibrary: 'bootstrap5',
        });
        $('#datepicker2').datepicker({
            uiLibrary: 'bootstrap5',
        });

        $('#datepicker1, #datepicker2').change(function(event){
            event.preventDefault();
            var startDate = $('#datepicker1').val();
            var endDate = $('#datepicker2').val();


            var formattedStartDate = formatDate(startDate);
            var formattedEndDate = formatDate(endDate);

            $('#hiddenStartDate').val(formattedStartDate);
            $('#hiddenEndDate').val(formattedEndDate);

            if(startDate && endDate){
                $('#dateForm').submit();
            }
        });
    });
    function formatDate(inputDate) {
        var parts = inputDate.split('/');
        var year = parts[2];
        var month = parts[0].length === 1 ? '0' + parts[0] : parts[0];
        var day = parts[1].length === 1 ? '0' + parts[1] : parts[1];

        return year + '-' + month + '-' + day;
    }


</script>
</html>

