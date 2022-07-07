package com.citylink.model;

import androidx.room.Embedded;

import com.google.gson.annotations.SerializedName;

public class DestinationAdress {
    @SerializedName("address")
    private String destinationAddress;
    @SerializedName("location")
    private String destinationLocation;
    @SerializedName("city")
    private String destinantionCity;
    @SerializedName("state")
    private String destinationState;
    @SerializedName("postalCode")
    private String destinationPostalCode;
    @SerializedName("country")
    private String destinationCountry;
    @SerializedName("coordinates")
    @Embedded
    private  Cordinates cordinates;

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public String getDestinantionCity() {
        return destinantionCity;
    }

    public void setDestinantionCity(String destinantionCity) {
        this.destinantionCity = destinantionCity;
    }

    public String getDestinationState() {
        return destinationState;
    }

    public void setDestinationState(String destinationState) {
        this.destinationState = destinationState;
    }

    public String getDestinationPostalCode() {
        return destinationPostalCode;
    }

    public void setDestinationPostalCode(String destinationPostalCode) {
        this.destinationPostalCode = destinationPostalCode;
    }

    public String getDestinationCountry() {
        return destinationCountry;
    }

    public void setDestinationCountry(String destinationCountry) {
        this.destinationCountry = destinationCountry;
    }

    public Cordinates getCordinates() {
        return cordinates;
    }

    public void setCordinates(Cordinates cordinates) {
        this.cordinates = cordinates;
    }
}
