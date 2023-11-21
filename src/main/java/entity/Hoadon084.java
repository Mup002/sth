package entity;

import java.util.Date;

public class Hoadon084 {
    private int id;
    private Date ngayNhap;
    private String xacnhandonhang;
    private Double tongTien;

    public Hoadon084() {
    }

    public Hoadon084(int id, Date ngayNhap, String xacnhandonhang, Double tongTien, String trangthaithanhtoan, String ghiChu) {
        this.id = id;
        this.ngayNhap = ngayNhap;
        this.xacnhandonhang = xacnhandonhang;
        this.tongTien = tongTien;
        this.trangthaithanhtoan = trangthaithanhtoan;
        this.ghiChu = ghiChu;
    }

    private String trangthaithanhtoan;
    private String ghiChu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getXacnhandonhang() {
        return xacnhandonhang;
    }

    public void setXacnhandonhang(String xacnhandonhang) {
        this.xacnhandonhang = xacnhandonhang;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public String getTrangthaithanhtoan() {
        return trangthaithanhtoan;
    }

    public void setTrangthaithanhtoan(String trangthaithanhtoan) {
        this.trangthaithanhtoan = trangthaithanhtoan;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
}
