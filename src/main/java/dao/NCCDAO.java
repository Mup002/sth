package dao;
import entity.NCC084;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class NCCDAO extends DAO{
    public NCCDAO(Connection connection) throws ClassNotFoundException, SQLException {
        super();
        DAO.connection = getConnection();
    }
    public ArrayList<NCC084> getTKNCC(String startDate, String endDate){
        ArrayList<NCC084> kq = new ArrayList<>();
        String query;
        PreparedStatement pst;
        ResultSet rs;
        try {
            if(startDate != null && endDate != null){
                query = "SELECT * FROM shopman.tblncc WHERE id IN (SELECT id_ncc FROM qlst.tblcaclannhaphang WHERE ngayNhap BETWEEN ? AND ?)";
                pst =  connection.prepareStatement(query);
                pst.setString(1,startDate);
                pst.setString(2,endDate);
                rs = pst.executeQuery();
            }else{
                query = "SELECT * FROM shopman.tblncc";
                pst =  connection.prepareStatement(query);
                rs = pst.executeQuery();
            }
            while (rs.next()){
                NCC084 ncc084 = new NCC084();
                ncc084.setId(rs.getInt("id"));
                ncc084.setTen(rs.getString("ten"));
                ncc084.setSoLanNhapHang(rs.getInt("solannhap"));
                ncc084.setSoluonghangnhap(rs.getInt("soluonghangnhap"));
                kq.add(ncc084);
            }
        }catch (SQLException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return kq;
    }
}
