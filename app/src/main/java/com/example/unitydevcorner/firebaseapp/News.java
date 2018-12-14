package com.example.unitydevcorner.firebaseapp;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class News {
    private int date;

    private String description;

    private String image;

    private String name;




    public News(int date, String description, String image, String name) {
        this.date = date;
        this.description = description;
        this.image = image;
        this.name = name;
    }

    public News() {
    }

    public void setDate(int date){
        this.date = date;
    }
    public int getDate(){
        return this.date;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public String getDescription(){
        return this.description;
    }
    public void setImage(String image){
        this.image = image;

    }
    public String getImage(){
        return this.image;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }




}
