package com.citylink.model;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(tableName = "BookingModel")
public class BookingModel {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String context;
    private String type;
    private String bookingId;
    private transient String source;
    private String status;
    @Embedded
    private Customer customer;
    @SerializedName("source")
    @Embedded
    private ASource ASource;
    @SerializedName("destination")
    @Embedded
    private Destination destination;
    @Embedded
    private Vendor vendor;
    private String bookingTime;
    private String pickupTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Vendor getVendor() {
        return vendor;
    }

    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    public String getBookingTime() {
        return bookingTime.replace(".000", " ").replace("T", " ");
    }

    public void setBookingTime(String bookingTime) {
        this.bookingTime = bookingTime;
    }

    public String getPickupTime() {
        return pickupTime.replace(".000", " ").replace("T", " ");
    }

    public void setPickupTime(String pickupTime) {
        this.pickupTime = pickupTime;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public com.citylink.model.ASource getASource() {
        return ASource;
    }

    public void setASource(com.citylink.model.ASource ASource) {
        this.ASource = ASource;
    }
}
