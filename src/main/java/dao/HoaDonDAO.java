package dao;

import entity.Hoadon084;
import entity.NCC084;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HoaDonDAO extends DAO{
    public HoaDonDAO(Connection connection) throws ClassNotFoundException, SQLException {
        super();
        DAO.connection  = getConnection();
    }
    public ArrayList<Hoadon084> getAllHoaDon(int id){
        ArrayList<Hoadon084> kq = new ArrayList<>();
        String query;
        PreparedStatement pst;
        ResultSet rs;
        try {
            query = "SELECT * FROM shopman.tblhoadon where id_khachhang = ?;";
            pst =  connection.prepareStatement(query);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            while (rs.next()){
               Hoadon084 hoadon084 = new Hoadon084();
               hoadon084.setId(rs.getInt("id"));
               hoadon084.setNgayNhap(rs.getDate("ngaydat"));
               hoadon084.setXacnhandonhang(rs.getString("xacnhandonhang"));
               hoadon084.setTongTien(rs.getDouble("tongTien"));
               hoadon084.setTrangthaithanhtoan(rs.getString("trangthaithanhtoan"));
               kq.add(hoadon084);
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return kq;
    }

    public Hoadon084 getDonHang(int id){
        Hoadon084 kq = new Hoadon084();
        String query;
        PreparedStatement pst;
        ResultSet rs;
        try{
            query = "SELECT * FROM shopman.tblhoadon where id = ?;";
            pst =  connection.prepareStatement(query);
            pst.setInt(1,id);
            rs = pst.executeQuery();
            while (rs.next()){
                Hoadon084 hoadon084 = new Hoadon084();
                hoadon084.setId(rs.getInt("id"));
                hoadon084.setNgayNhap(rs.getDate("ngaydat"));
                hoadon084.setXacnhandonhang(rs.getString("xacnhandonhang"));
                hoadon084.setTongTien(rs.getDouble("tongTien"));
                hoadon084.setTrangthaithanhtoan(rs.getString("trangthaithanhtoan"));
                kq = hoadon084;
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return kq;
    }
}
