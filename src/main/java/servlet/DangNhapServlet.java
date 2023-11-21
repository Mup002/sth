package servlet;

import dao.DAO;
import dao.ThanhvienDAO;
import entity.Thanhvien084;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

@WebServlet("/dang-nhap")
public class DangNhapServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = response.getWriter()){
            String username = request.getParameter("username");
            String password = request.getParameter("password");

            Thanhvien084 thanhvien084 = new ThanhvienDAO(DAO.getConnection()).dangNhap(username,password);
            if(thanhvien084 != null){
                if(thanhvien084.getRole().equals("ADMIN")){
                    request.getSession().setAttribute("auth",thanhvien084.getRole());
                    response.sendRedirect("/qly");
                }else if(thanhvien084.getRole().equals("USER")){
                    request.getSession().setAttribute("auth",thanhvien084.getRole());
                    request.getSession().setAttribute("idKH",thanhvien084.getId());
                    response.sendRedirect("/kh");
                }

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
