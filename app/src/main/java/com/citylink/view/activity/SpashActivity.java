package com.citylink.view.activity;

import android.app.AlertDialog;
import android.app.Fragment;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.citylink.view.fragments.BookingDetailsFragment;
import com.citylink.viewmodel.SplashViewModel;
import com.example.view.R;

import java.util.Timer;
import java.util.TimerTask;

public class SpashActivity extends AppCompatActivity {

    private TimerTask timerTask;
    SplashViewModel splashViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DataBindingUtil.setContentView(this, R.layout.activity_splash);
        splashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        showProgress();
        splashViewModel.getAllBookingDetals();
            timerTask = new TimerTask() {
                @Override
                public void run() {
                    splashViewModel.initNewView(getSupportFragmentManager(),new BookingDetailsFragment());
                }

            };
            new Timer().schedule(timerTask, 1500);
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
                .setPositiveButton(getResources().getString(R.string.ok), this::onClick)
                .setNegativeButton(getResources().getString(R.string.cancel), (dialog, id) -> dialog.cancel());
        AlertDialog alert = builder.create();
        alert.show();
    }

    private void onClick(DialogInterface dialog, int id) {
        finishAffinity();
    }
}
