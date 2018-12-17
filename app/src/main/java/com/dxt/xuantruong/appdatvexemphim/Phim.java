package com.dxt.xuantruong.appdatvexemphim;

public class Phim {
    public int getMaPhim() {
        return MaPhim;
    }

    public void setMaPhim(int maPhim) {
        MaPhim = maPhim;
    }

    public String getTenPhim() {
        return TenPhim;
    }

    public void setTenPhim(String tenPhim) {
        TenPhim = tenPhim;
    }

    private int MaPhim;
    private String TenPhim;
    public Phim(int maPhim, String tenPhim) {
        MaPhim = maPhim;
        TenPhim = tenPhim;
    }
}

