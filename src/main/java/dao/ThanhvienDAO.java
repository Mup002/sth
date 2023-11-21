package dao;

import entity.Thanhvien084;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static dao.DAO.connection;
import static dao.DAO.getConnection;

public class ThanhvienDAO {
    public ThanhvienDAO(Connection connection) throws ClassNotFoundException, SQLException {
        super();
        DAO.connection = getConnection();
    }
    public Thanhvien084 dangNhap(String username, String password){
        Thanhvien084 kq = null;
        String query;
        PreparedStatement pst;
        ResultSet rs;
        try{
            query = "select * from shopman.tblthanhvien where username= ? and password= ? ";
            pst = connection.prepareStatement(query);
            pst.setString(1,username);
            pst.setString(2,password);
            rs = pst.executeQuery();
            while(rs.next()){
                kq = new Thanhvien084();
                kq.setId(rs.getInt("id"));
                kq.setUsername(rs.getString("username"));
                kq.setPassword(rs.getString("password"));
                kq.setHoten(rs.getString("hoten"));
                kq.setNgaysinh(rs.getString("ngaysinh"));
                kq.setGhichu(rs.getString("ghichu"));
                kq.setRole(rs.getString("role"));
                kq.setDt(rs.getString("dienthoai"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return kq;
    }
}
