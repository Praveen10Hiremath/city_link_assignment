package com.citylink.repository;

import android.app.Application;
import android.os.AsyncTask;

import androidx.lifecycle.LiveData;

import com.citylink.model.BookingDao;
import com.citylink.model.BookingDatabase;
import com.citylink.model.BookingModel;

import java.util.List;

public class BookingRepository {
    // below line is the create a variable
    // for dao and list for all courses.
    private BookingDao bookingdao;
    private LiveData<List<BookingModel>> allBookings;

    // creating a constructor for our variables
    // and passing the variables to it.
    public BookingRepository(Application application) {
        BookingDatabase bookingDatabase = BookingDatabase.getInstance(application);
        bookingdao = bookingDatabase.Dao();
        allBookings = bookingdao.getAllCourses();
    }

    // creating a method to insert the data to our database.
    public void insert(BookingModel bookingModel) {
       new InsertCourseAsyncTask(bookingdao).execute(bookingModel);
    }

    // creating a method to update data in database.
    public void update(BookingModel bookingModel) {
        new UpdateCourseAsyncTask(bookingdao).execute(bookingModel);
    }

    // creating a method to delete the data in our database.
    public void delete(BookingModel model) {
        new DeleteCourseAsyncTask(bookingdao).execute(model);
    }

    // below is the method to delete all the courses.
    public void deleteAllCourses() {
        new DeleteAllCoursesAsyncTask(bookingdao).execute();
    }

    // below method is to read all the courses.
    public LiveData<List<BookingModel>> getAllBookings() {
        return allBookings;
    }

    // we are creating a async task method to insert new course.
    private static class InsertCourseAsyncTask extends AsyncTask<BookingModel, Void, Void> {
        private BookingDao bookingDao;

        private InsertCourseAsyncTask(BookingDao bookingDao) {
            this.bookingDao = bookingDao;
        }

        @Override
        protected Void doInBackground(BookingModel... bookingModels) {
            // below line is use to insert our modal in dao.
            bookingDao.insert(bookingModels[0]);
            return null;
        }
    }

    // we are creating a async task method to update our course.
    private static class UpdateCourseAsyncTask extends AsyncTask<BookingModel, Void, Void> {
        private BookingDao bookingDao;

        private UpdateCourseAsyncTask(BookingDao bookingDao) {
            this.bookingDao = bookingDao  ;
        }


        @Override
        protected Void doInBackground(BookingModel... bookingModels) {
            bookingDao.update(bookingModels[0]);
            return null;
        }
    }

    // we are creating a async task method to delete course.
    private static class DeleteCourseAsyncTask extends AsyncTask<BookingModel, Void, Void> {
        private BookingDao bookingDao;

        private DeleteCourseAsyncTask(BookingDao bookingDao) {
            this.bookingDao = bookingDao;
        }

        @Override
        protected Void doInBackground(BookingModel... bookingModels) {
            // below line is use to delete
            // our course modal in dao.
            bookingDao.delete(bookingModels[0]);
            return null;
        }

    }

    // we are creating a async task method to delete all courses.
    private static class DeleteAllCoursesAsyncTask extends AsyncTask<Void, Void, Void> {
        private BookingDao bookingDao;
        private DeleteAllCoursesAsyncTask(BookingDao bookingDao) {
            this.bookingDao = bookingDao;
        }
        @Override
        protected Void doInBackground(Void... voids) {
            // on below line calling method
            // to delete all courses.
            bookingDao.deleteAllCourses();
            return null;
        }
    }
}
