package com.citylink.model;

import androidx.lifecycle.LiveData;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@androidx.room.Dao
public interface BookingDao {
    @Insert
    void insert(BookingModel bookingModel);

    // below method is use to update
    // the data in our database.
    @Update
    void update(BookingModel bookingModel);

    // below line is use to delete a
    // specific course in our database.
    @Delete
    void delete(BookingModel bookingModel);

    // on below line we are making query to
    // delete all courses from our database.
    @Query("DELETE FROM BookingModel")
    void deleteAllCourses();

    // below line is to read all the courses from our database.
    // in this we are ordering our courses in ascending order
    // with our course name.
    @Query("SELECT * FROM BookingModel ORDER BY bookingId ASC")
    LiveData<List<BookingModel>> getAllCourses();
}
