package com.citylink.model.entity;

import androidx.room.Embedded;

import com.google.gson.annotations.SerializedName;

public class ASource {
    @SerializedName("name")
    private String sourecAdressName;
    @SerializedName("address")
    @Embedded
    private Address sourceAddress;
    @SerializedName("latitude")
    private String sourceLatitude;
    @SerializedName("longitude")
    private String sourceLongitude;

    public String getSourecAdressName() {
        return sourecAdressName;
    }

    public void setSourecAdressName(String sourecAdressName) {
        this.sourecAdressName = sourecAdressName;
    }

    public Address getSourceAddress() {

        return sourceAddress;
    }

    public void setSourceAddress(Address sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getSourceLatitude() {
        return sourceLatitude;
    }

    public void setSourceLatitude(String sourceLatitude) {
        this.sourceLatitude = sourceLatitude;
    }

    public String getSourceLongitude() {
        return sourceLongitude;
    }

    public void setSourceLongitude(String sourceLongitude) {
        this.sourceLongitude = sourceLongitude;
    }
}
