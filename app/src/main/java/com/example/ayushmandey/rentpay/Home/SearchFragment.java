package com.example.ayushmandey.rentpay.Home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ayushmandey.rentpay.R;

/**
 * Created by dheeraj on 1/4/18.
 */

public class SearchFragment extends Fragment {
    private static final String TAG = "SearchFragment";

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_search,container,false);
        return view;
    }
}