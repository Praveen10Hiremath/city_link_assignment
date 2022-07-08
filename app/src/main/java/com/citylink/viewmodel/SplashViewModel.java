package com.citylink.viewmodel;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.citylink.model.BookingModel;
import com.citylink.model.RetrofitService;
import com.citylink.repository.BookingRepository;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashViewModel extends AndroidViewModel{

    Context splashActivityContext;
    String TAG="CITY LINK";
    public MutableLiveData<Boolean> progressbarObservable = new MutableLiveData<>();

    // creating a new variable for course repository.
    private BookingRepository bookingRepository;

    // below line is to create a variable for live
    // data where all the courses are present.
    private LiveData<List<BookingModel>> allBookings;

    // constructor for our view modal.
    public SplashViewModel(@NonNull Application application) {
        super(application);
        bookingRepository = new BookingRepository(application);
        allBookings = bookingRepository.getAllBookings();
    }

    // below method is use to insert the data to our repository.
    public void insert(BookingModel bookingModel) {
        bookingRepository.insert(bookingModel);
    }

    // below line is to update data in our repository.
    public void update(BookingModel bookingModel) {
        bookingRepository.update(bookingModel);
    }

    // below line is to delete the data in our repository.
    public void delete(BookingModel bookingModel) {
        bookingRepository.delete(bookingModel);
    }

    // below method is to delete all the courses in our list.
    public void deleteAllCourses() {
        bookingRepository.deleteAllCourses();
    }

    // below method is to get all the courses in our list.
    public LiveData<List<BookingModel>> getAllCourses() {
        return allBookings;
    }


    public void getAllBookingDetals() {
        progressbarObservable.setValue(true);
        Call<JsonObject> call = RetrofitService.getInstance().getMyApi().getBookings();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject>  call, Response<JsonObject> response) {
               BookingModel fromJson= new Gson().fromJson(response.body(), BookingModel.class);
                insert(fromJson);
                progressbarObservable.setValue(false);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                progressbarObservable.setValue(false);
                Log.i(TAG,t.getLocalizedMessage());
                Toast.makeText(getApplication().getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }
        });
    }

    public LiveData<Boolean> progressbarObservable() {
        return progressbarObservable;
    }

}
