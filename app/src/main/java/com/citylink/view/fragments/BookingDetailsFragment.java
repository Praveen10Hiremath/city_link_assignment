package com.citylink.view.fragments;

import android.app.AlertDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.citylink.model.entity.BookingModel;
import com.citylink.viewmodel.SplashViewModel;
import com.example.view.R;

public class BookingDetailsFragment extends Fragment implements View.OnClickListener {

    String TAG = "CITY LINK";
    ViewDataBinding splashFragment;
    SplashViewModel splashViewModel;
    BookingModel bookingModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        splashFragment = DataBindingUtil.inflate(inflater, R.layout.fragment_booking_details, container, false);
        View view = splashFragment.getRoot();
        splashViewModel = new ViewModelProvider(this).get(SplashViewModel.class);
        splashViewModel.progressbarObservable.setValue(false);
        splashViewModel.getAllBookingDetails().observe(getActivity(), bookingModels -> {
            if (bookingModels != null && !bookingModels.isEmpty()) {
                view.findViewById(R.id.sourceAddressPin).setOnClickListener(this);
                view.findViewById(R.id.destinationAddressPin).setOnClickListener(this);
                bookingModel = bookingModels.get(0);
                boolean set = splashFragment.setVariable(1, bookingModel);
                Log.i(TAG, "variable set to binding calss " + set);
            } else {
                view.findViewById(R.id.home_scroll_view).setVisibility(View.GONE);
                view.findViewById(R.id.noData).setVisibility(View.VISIBLE);
                showDialog();
            }
        });
        return view;
    }

    @Override
    public void onClick(View view) {
        String uri;
        if (view.getId() == R.id.sourceAddressPin) {
            uri = "geo:" + bookingModel.getASource().getSourceLatitude() + "," + bookingModel.getASource().
                    getSourceLongitude() + "?q=my+" + bookingModel.getASource().getSourecAdressName() + "+" +
                    bookingModel.getASource().getSourceAddress().getSourceAddress();
        } else {
            uri = "geo:" + bookingModel.getDestination().getDestinationAdress().getCordinates().
                    getDestinationLatitude() + "," + bookingModel.getDestination().getDestinationAdress().
                    getCordinates().getDestinationLongitude() + "?q=my+" + bookingModel.getDestination().
                    getDestinationAdressName() + "+" + bookingModel.getDestination().destinationAdressName;
        }
        startActivity(new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(uri)));
    }

    private void showDialog() {
        AlertDialog.Builder builder = new android.app.AlertDialog.Builder(getActivity());
        builder.setTitle(getString(R.string.city_link_title));
        builder.setMessage(this.getResources().getString(R.string.unable_fetch_data))
                .setCancelable(false)
                .setNegativeButton(getResources().getString(R.string.ok), (dialog, id) -> {
                    splashViewModel.progressbarObservable.setValue(false);
                    dialog.cancel();
                });

        AlertDialog alert = builder.create();
        alert.show();
    }
}