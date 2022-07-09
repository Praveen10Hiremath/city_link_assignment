package com.citylink.model.entity;

import androidx.room.Embedded;

import com.google.gson.annotations.SerializedName;

public class Destination {
    @SerializedName("name")
    public String destinationAdressName;

    @SerializedName("address")
    @Embedded
    private DestinationAdress destinationAdress;

    public String getDestinationAdressName() {
        return destinationAdressName;
    }

    public void setDestinationAdressName(String destinationAdressName) {
        this.destinationAdressName = destinationAdressName;
    }

    public DestinationAdress getDestinationAdress() {
        return destinationAdress;
    }

    public void setDestinationAdress(DestinationAdress destinationAdress) {
        this.destinationAdress = destinationAdress;
    }
}
