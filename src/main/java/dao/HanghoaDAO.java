package dao;

import entity.HangHoa084;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HanghoaDAO extends DAO{
    public HanghoaDAO(Connection connection) throws ClassNotFoundException, SQLException {
        super();
        DAO.connection  = getConnection();
    }
    public ArrayList<HangHoa084> getNhapHang(int idLanNhap){
        ArrayList<HangHoa084> kq = new ArrayList<>();
        String query;
        PreparedStatement pst;
        ResultSet rs;
        try{
            query = "select * from shopman.tblhanghoa where id_lannhap = ?;";
            pst = connection.prepareStatement(query);
            pst.setInt(1,idLanNhap);
            rs = pst.executeQuery();
            while(rs.next()){
                HangHoa084 hangHoa084 = new HangHoa084();
                hangHoa084.setId(rs.getInt("id"));
                hangHoa084.setLoaiHang(rs.getString("loaihang"));
                hangHoa084.setTen(rs.getString("ten"));
                hangHoa084.setGhiChu(rs.getString("ghiChu"));
                hangHoa084.setDonGia(rs.getDouble("donGia"));
                hangHoa084.setSoLuong(rs.getInt("soLuong"));

                kq.add(hangHoa084);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return kq;
    }

}
