package com.citylink.view.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.citylink.viewmodel.SplashViewModel;
import com.example.view.R;

public class BookingDetailsFragment extends Fragment implements View.OnClickListener {

    String TAG = "CITY LINK";
    ViewDataBinding splashFragment;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        splashFragment = DataBindingUtil.inflate(inflater, R.layout.fragment_booking_details, container, false);
        View view = splashFragment.getRoot();
        SplashViewModel spashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        spashViewModel.getAllCourses().observe(getActivity(), bookingModels -> {
            boolean set = splashFragment.setVariable(1, bookingModels.get(0));
            Log.i(TAG, "variable set to binding calss " + set);
        });
        view.findViewById(R.id.sourceAddressPin).setOnClickListener(this);
        view.findViewById(R.id.destinationAddressPin).setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        getParentFragmentManager().beginTransaction().replace(R.id.fragment_container, new MapViewFragment()).addToBackStack("main").commit();
    }
}