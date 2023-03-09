package com.example.myapplication.model;

import androidx.annotation.NonNull;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import java.util.HashMap;
import java.util.Map;

public class Post {
    @PrimaryKey
    @NonNull
    public String id="";
    public String title ="";
    public String imgUrl ="";
    public String details = "";
    public String location="";
    public String label="";
    public Long timestamp;
    @Ignore
    public Post(){}
    public Post(String id, String title, String imgUrl, String details,String location, String label,Long timestamp){
        this.title = title;
        this.id = id;
        this.imgUrl = imgUrl;
        this.details = details;
        this.location=location;
        this.label=label;
        this.timestamp=timestamp;
    }

    static final String TITLE = "title";
    static final String LABEL = "label";
    static final String ID = "id";
    static final String IMAGE = "image";
    static final String DETAILS = "details";
    static final String LOCATION = "location";
    static final String TIMESTAMP = "timestamp";
    static final String COLLECTION = "posts";
public static Post readfromjson(Map<String,Object> jsonmap){
String id = (String) jsonmap.get(ID);
    String name = (String) jsonmap.get(TITLE);
    String image = (String) jsonmap.get(IMAGE);
    String details = (String) jsonmap.get(DETAILS);
    String location = (String) jsonmap.get(LOCATION);
    Long timestamp =(Long) jsonmap.get(TIMESTAMP);
    String label = (String) jsonmap.get(LABEL);

Post post= new Post(id,name,image,details,location,label,timestamp);
return post;

}
public Map<String,Object> reattojson(){
    Map<String,Object> jsonmap= new HashMap<>();
    jsonmap.put(ID,getId())
            jsonmap.put(TITLE,getTitle());
    jsonmap.put(IMAGE,getImgUrl());
    jsonmap.put(DETAILS, getDetails());
    jsonmap.put(LOCATION,getLocation());
    jsonmap.put(LABEL,getLabel());
    jsonmap.put(TIMESTAMP,getTimestamp());
return jsonmap;
}
    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }
    public void setId(@NonNull String id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
    public void setDetails(String details) {
        this.details = details;
    }
    @NonNull
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getDetails() {
        return details;
    }
    public String getLocation() {
        return location;
    }
    public String getLabel() {
        return label;
    }
    public Long getTimestamp() {return this.timestamp;}
}
