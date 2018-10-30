package com.example.gareth.catchmap;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

import java.io.File;
import java.net.URI;

@Entity(tableName = "catch_table")
public class Catch
{
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String photo;
    private String fishType;
    private float fishLength;
    private float fishWeight;
    private String desc;
    private float longitude;
    private float latitude;

    public Catch(String fishType, float fishLength, float fishWeight, String desc, float latitude, float longitude, String photo) {
        this.photo = photo;
        this.fishType = fishType;
        this.fishLength = fishLength;
        this.fishWeight = fishWeight;
        this.desc = desc;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    public String getFishType() {
        return fishType;
    }

    public float getFishLength() {
        return fishLength;
    }

    public float getFishWeight() {
        return fishWeight;
    }

    public String getDesc() {
        return desc;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }











}
