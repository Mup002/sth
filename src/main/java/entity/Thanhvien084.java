package entity;

public class Thanhvien084 {
    private int id;
    private String username;
    private String password;
    private String hoten;

    private String role;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getHoten() {
        return hoten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public String getDt() {
        return dt;
    }

    public String getGhichu() {
        return ghichu;
    }

    public Thanhvien084() {
    }

    public Thanhvien084(int id, String username, String password, String hoten, String ngaysinh, String dt, String ghichu, String role) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.hoten = hoten;
        this.ngaysinh = ngaysinh;
        this.dt = dt;
        this.ghichu = ghichu;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    private String ngaysinh;
    private String dt;
    private String ghichu;
}
