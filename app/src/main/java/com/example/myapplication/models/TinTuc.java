package com.example.myapplication.models;

public class TinTuc {
    public TinTuc(String title, String link, String img) {
        this.title = title;
        this.link = link;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getLink() {
        return link;
    }

    public String getImg() {
        return img;
    }

    private String title;
    private String link;
    private String img;


}
