package entity;

public class NCC084 {
    private int id;
    private String ten;

    public int getSoluonghangnhap() {
        return soluonghangnhap;
    }

    public void setSoluonghangnhap(int soluonghangnhap) {
        this.soluonghangnhap = soluonghangnhap;
    }

    private int soLanNhapHang;
    private int soluonghangnhap;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }


    public int getSoLanNhapHang() {
        return soLanNhapHang;
    }

    public void setSoLanNhapHang(int soLanNhapHang) {
        this.soLanNhapHang = soLanNhapHang;
    }

    public NCC084() {
    }

    public NCC084(int id, String ten, int soLanNhapHang, int soluonghangnhap) {
        this.id = id;
        this.ten = ten;
        this.soluonghangnhap = soluonghangnhap;
        this.soLanNhapHang = soLanNhapHang;
    }

}
