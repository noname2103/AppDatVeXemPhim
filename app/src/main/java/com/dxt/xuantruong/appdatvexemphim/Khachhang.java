package com.dxt.xuantruong.appdatvexemphim;

public class Khachhang {
    public Khachhang(String hoten, String email, String DT, String diachi, String matkhau) {
        Hoten = hoten;
        Email = email;
        this.DT = DT;
        Diachi = diachi;
        Matkhau = matkhau;
    }

    private String Hoten;
    private String Email;
    private String DT;
    private String Diachi;
    private String Matkhau;

    public String getHoten() {
        return Hoten;
    }

    public void setHoten(String hoten) {
        Hoten = hoten;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getDT() {
        return DT;
    }

    public void setDT(String DT) {
        this.DT = DT;
    }

    public String getDiachi() {
        return Diachi;
    }

    public void setDiachi(String diachi) {
        Diachi = diachi;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String matkhau) {
        Matkhau = matkhau;
    }
}
