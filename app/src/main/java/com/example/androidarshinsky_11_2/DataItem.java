package com.example.androidarshinsky_11_2;

import android.graphics.drawable.Drawable;

public class DataItem {

    private Drawable image;
    private String title;
    private String subtitle;
    private String textBut;


    public DataItem(Drawable image, String title, String subtitle, String textBut) {
        this.image = image;
        this.title = title;
        this.subtitle = subtitle;
        this.textBut = textBut;
    }

    public Drawable getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getSubtitle() {
        return subtitle;
    }


    public String getTextBut() {
        return textBut;
    }
}