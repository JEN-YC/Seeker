package com.sourcey.Seeker;

/**
 * Created by carl on 2017/4/12.
 */

public class BroadcastCard {
    private Double Latitude;
    private Double Longitude;
    private String Picture;
    private String Title;
    private String Text;
    private String Category;
    private String Time;
    public BroadcastCard(Double Latitude, Double Longitude, String Picture, String Title, String Text,String Category,String Time){
        this.Latitude=Latitude;
        this.Longitude=Longitude;
        this.Picture=Picture;
        this.Title=Title;
        this.Text=Text;
        this.Category=Category;
        this.Time=Time;
    }
    public String getTime(){
        return Time;
    }
    public Double getLatitude(){
        return Latitude;
    }
    public Double getLongitude(){
        return Longitude;
    }
    public String getPicture(){
        return Picture;
    }
    public String getTitle(){
        return Title;
    }
    public String getText(){
        return Text;
    }
    public String getCategory(){
        return Category;
    }
    public void setPicture(String picture){
        this.Picture=picture;
    }

}
