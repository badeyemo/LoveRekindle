package com.reconciliationhouse.android.loverekindle.ui.explore;


import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.reconciliationhouse.android.loverekindle.R;

import java.util.Objects;

public class EbooksFragment extends Fragment {

    private View view;

    public EbooksFragment() {
        // Required empty public constructor
    }

    public static EbooksFragment newInstance() {
        return new EbooksFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_ebooks, container, false);


        return view;
    }

    private Boolean isNetworkAvailable() {

        if (getActivity() != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) getActivity().getSystemService(Context.CONNECTIVITY_SERVICE);
            NetworkInfo activeNetworkInfo = Objects.requireNonNull(connectivityManager).getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return false;
    }


}