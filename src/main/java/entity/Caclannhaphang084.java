package entity;

import java.util.Date;

public class Caclannhaphang084 {
    private int id;
    private Date ngaynhap;
    private String ghichu;
    private double tongtien;
    private int soluonghangnhap;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public int getSoluonghangnhap() {
        return soluonghangnhap;
    }

    public void setSoluonghangnhap(int soluonghangnhap) {
        this.soluonghangnhap = soluonghangnhap;
    }

    public double getTongtien() {
        return tongtien;
    }

    public Caclannhaphang084(int id, Date ngaynhap,int soluonghangnhap, String ghichu, double tongtien) {
        this.id = id;
        this.ngaynhap = ngaynhap;
        this.ghichu = ghichu;
        this.tongtien = tongtien;
        this.soluonghangnhap = soluonghangnhap;
    }

    public Caclannhaphang084() {
    }

    public void setTongtien(double tongtien) {
        this.tongtien = tongtien;
    }
}
