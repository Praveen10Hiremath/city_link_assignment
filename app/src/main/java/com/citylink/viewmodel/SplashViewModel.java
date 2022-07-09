package com.citylink.viewmodel;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.citylink.model.entity.BookingModel;
import com.citylink.model.repository.BookingRepository;
import com.citylink.model.repository.RetrofitService;
import com.citylink.view.fragments.BookingDetailsFragment;
import com.example.view.R;
import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SplashViewModel extends AndroidViewModel {

    public MutableLiveData<Boolean> progressbarObservable = new MutableLiveData<>();
    String TAG = "CITY LINK";
    private final BookingRepository bookingRepository;

    private final LiveData<List<BookingModel>> allBookings;

    public SplashViewModel(@NonNull Application application) {
        super(application);
        bookingRepository = new BookingRepository(application);
        allBookings = bookingRepository.getAllBookingDetails();
    }

    public void insert(BookingModel bookingModel) {
        bookingRepository.insert(bookingModel);
    }

    public LiveData<List<BookingModel>> getAllBookingDetails() {
        return allBookings;
    }


    public void getAllBookingDetals() {
        progressbarObservable.setValue(true);
        Call<JsonObject> call = RetrofitService.getInstance().getMyApi().getBookings();
        call.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                BookingModel fromJson = new Gson().fromJson(response.body(), BookingModel.class);
                insert(fromJson);
                progressbarObservable.setValue(false);
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                Log.i(TAG, t.getLocalizedMessage());
                Toast.makeText(getApplication().getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
                progressbarObservable.setValue(false);
            }
        });
    }

    public LiveData<Boolean> progressbarObservable() {
        return progressbarObservable;
    }

    public void initNewView(FragmentManager fragmentManager, Fragment fragment){
        fragmentManager.beginTransaction().replace(R.id.fragment_container, fragment).addToBackStack("main").commit();
    }

}
