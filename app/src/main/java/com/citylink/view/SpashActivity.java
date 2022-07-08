package com.citylink.view;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.citylink.view.fragments.BookingDetailsFragment;
import com.citylink.viewmodel.SplashViewModel;
import com.example.view.R;

import java.util.Timer;
import java.util.TimerTask;

public class SpashActivity extends AppCompatActivity {

    private TimerTask timerTask;
    SplashViewModel splashViewModel;
    MutableLiveData<Boolean> progressbarObservable = new MutableLiveData<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_splash);
        //splashViewModel = ViewModelProviders.of(this).get(SplashViewModel.class);
        splashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        showProgress();
        splashViewModel.getAllBookingDetals();
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, new BookingDetailsFragment()).addToBackStack("main").commit();
                }

            };
            new Timer().schedule(timerTask, 2000);
    }

    private void showProgress() {
        splashViewModel.progressbarObservable().observe(this, new Observer<Boolean>() {
            ProgressDialog progressBar = new ProgressDialog(SpashActivity.this);
            @Override
            public void onChanged(final Boolean progressObserve) {
                if (progressObserve) {
                    progressBar.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
                    progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                    progressBar.setCancelable(false);
                    progressBar.setIndeterminate(true);
                    progressBar.setMessage(getString(R.string.well_come));
                    progressBar.show();
                } else {
                    progressBar.dismiss();
                }
            }
        });
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle(getString(R.string.city_link_title));
        builder.setMessage(this.getResources().getString(R.string.cancel_application))
                .setCancelable(false)
                .setPositiveButton(getResources().getString(R.string.ok), (dialog, id) -> {
                    finishAffinity();
                })
                .setNegativeButton(getResources().getString(R.string.cancel), (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }
}
