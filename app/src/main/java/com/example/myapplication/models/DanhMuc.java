package com.example.myapplication.models;

public class DanhMuc {
    public String getTenDanhMuc() {
        return tenDanhMuc;
    }

    public int getImgDanhMuc() {
        return imgDanhMuc;
    }

    public String getUrl() {
        return url;
    }

    public void setTenDanhMuc(String tenDanhMuc) {
        this.tenDanhMuc = tenDanhMuc;
    }

    public void setImgDanhMuc(int imgDanhMuc) {
        this.imgDanhMuc = imgDanhMuc;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private String tenDanhMuc;
    private int imgDanhMuc;
    private String url;


    public DanhMuc(String tenDanhMuc, int imgDanhMuc, String url) {
        this.tenDanhMuc = tenDanhMuc;
        this.imgDanhMuc = imgDanhMuc;
        this.url = url;
    }
}
