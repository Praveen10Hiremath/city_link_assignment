package com.citylink.model.repository;

import com.google.gson.JsonObject;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {

    String BASE_URL = "https://clstorageapp.blob.core.windows.net/assignment/";

    @GET("booking.json")
    Call<JsonObject> getBookings();
}
