package com.citylink.model;

import com.google.gson.annotations.SerializedName;

public class Customer {
    @SerializedName("id")
    private String bid;
    @SerializedName("fullName")
    private String customerFullName;
    private String mobile;
    private String email;

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getCustomerFullName() {
        return customerFullName;
    }

    public void setCustomerFullName(String customerFullName) {
        this.customerFullName = customerFullName;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
