package dao;

import entity.Caclannhaphang084;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CaclannhaphangDAO extends DAO{
    public CaclannhaphangDAO(Connection connection) throws ClassNotFoundException , SQLException {
        super();
        DAO.connection = getConnection();
    }
    public ArrayList<Caclannhaphang084> getTKLanNhapHang(int idNCC){
        ArrayList<Caclannhaphang084> kq = new ArrayList<>();
        String query;
        PreparedStatement pst;
        ResultSet rs;
        try{
            query = "select * from shopman.tblcaclannhaphang where id_ncc = ?";
            pst = connection.prepareStatement(query);
            pst.setInt(1,idNCC);
            rs = pst.executeQuery();
            while (rs.next()){
                Caclannhaphang084 caclannhaphang084 = new Caclannhaphang084();
                caclannhaphang084.setId(rs.getInt("id"));
                caclannhaphang084.setGhichu(rs.getString("ghichu"));
                caclannhaphang084.setNgaynhap(rs.getDate("ngayNhap"));
                caclannhaphang084.setTongtien(rs.getDouble("tongTien"));
                caclannhaphang084.setSoluonghangnhap(rs.getInt("luonghangnhap"));

                kq.add(caclannhaphang084);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        return kq;
    }
}
