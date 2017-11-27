package com.example.andriod.skimate.homepager.home;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andriod.skimate.R;
import com.example.andriod.skimate.databinding.HomeBinding;

/**
 * Created by Nick0917 on 2017-11-22.
 */

public class HomeFragment extends Fragment {

    HomeBinding homeBind;

    public static Fragment getInstance() {
        HomeFragment homeFragment = new HomeFragment();
        return homeFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        homeBind = DataBindingUtil.inflate(inflater, R.layout.home, container, false);



        return homeBind.getRoot();
    }
}
