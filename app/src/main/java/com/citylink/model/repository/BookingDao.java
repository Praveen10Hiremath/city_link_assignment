package com.citylink.model.repository;

import androidx.lifecycle.LiveData;
import androidx.room.Insert;
import androidx.room.Query;

import com.citylink.model.entity.BookingModel;

import java.util.List;

@androidx.room.Dao
public interface BookingDao {
    @Insert
    void insert(BookingModel[] bookingModel);

    @Query("SELECT * FROM BookingModel ORDER BY bookingId ASC")
    LiveData<List<BookingModel>> getAllBookingDetails();
}
