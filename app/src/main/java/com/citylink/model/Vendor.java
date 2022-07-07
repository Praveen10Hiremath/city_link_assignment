package com.citylink.model;

import com.google.gson.annotations.SerializedName;

public class Vendor {
    @SerializedName("id")
    private String vedorId;
    @SerializedName("fullName")
    private String vendorFullName;
    @SerializedName("vehicleNumber")
    private String vendorVehicleNumber;
    @SerializedName("vehicleModel")
    private String vendorVehicleModel;

    public String getVedorId() {
        return vedorId;
    }

    public void setVedorId(String vedorId) {
        this.vedorId = vedorId;
    }

    public String getVendorFullName() {
        return vendorFullName;
    }

    public void setVendorFullName(String vendorFullName) {
        this.vendorFullName = vendorFullName;
    }

    public String getVendorVehicleNumber() {
        return vendorVehicleNumber;
    }

    public void setVendorVehicleNumber(String vendorVehicleNumber) {
        this.vendorVehicleNumber = vendorVehicleNumber;
    }

    public String getVendorVehicleModel() {
        return vendorVehicleModel;
    }

    public void setVendorVehicleModel(String vendorVehicleModel) {
        this.vendorVehicleModel = vendorVehicleModel;
    }
}
