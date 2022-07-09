package com.citylink.model.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.citylink.model.entity.BookingModel;

import java.util.List;

public class BookingRepository {

    private BookingDao bookingdao;
    private LiveData<List<BookingModel>> allBookings;

    public BookingRepository(Application application) {
        BookingDatabase bookingDatabase = BookingDatabase.getInstance(application);
        bookingdao = bookingDatabase.Dao();
        allBookings = bookingdao.getAllBookingDetails();
    }

    public void insert(BookingModel bookingModel) {
       new InsertCourseAsyncTask(bookingdao).execute(bookingModel);
    }
    public LiveData<List<BookingModel>> getAllBookingDetails() {
        return allBookings;
    }

    private static class InsertCourseAsyncTask extends AsyncTask<BookingModel, Void, Void> {
        private BookingDao bookingDao;

        private InsertCourseAsyncTask(BookingDao bookingDao) {
            this.bookingDao = bookingDao;
        }

        @Override
        protected Void doInBackground(BookingModel... bookingModels) {
            bookingDao.insert(bookingModels);
            return null;
        }
    }
}
