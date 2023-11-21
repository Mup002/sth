package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name = "ThongKeHoaDonServlet",urlPatterns = "/tracuudonhang")
public class ThongKeHoaDonServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out = resp.getWriter()){
            int id = Integer.parseInt(req.getParameter("idKH"));
            req.getSession().setAttribute("idKH",id);
            resp.sendRedirect("/thonkehoadon");
        }
    }
}
