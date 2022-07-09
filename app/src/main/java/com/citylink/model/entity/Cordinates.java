package com.citylink.model.entity;

import com.google.gson.annotations.SerializedName;

public class Cordinates {
    @SerializedName("latitude")
    private String destinationLatitude;
    @SerializedName("longitude")
    private String destinationLongitude;

    public String getDestinationLatitude() {
        return destinationLatitude;
    }

    public void setDestinationLatitude(String destinationLatitude) {
        this.destinationLatitude = destinationLatitude;
    }

    public String getDestinationLongitude() {
        return destinationLongitude;
    }

    public void setDestinationLongitude(String destinationLongitude) {
        this.destinationLongitude = destinationLongitude;
    }
}
