package com.example.andriod.skimate.homepager.alarm;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andriod.skimate.R;
import com.example.andriod.skimate.databinding.AlarmBinding;

/**
 * Created by Nick0917 on 2017-11-23.
 */

public class AlarmFragment extends Fragment {

    AlarmBinding alarmBind;

    public static Fragment getInstance() {
        AlarmFragment alarmFragment = new AlarmFragment();
        return alarmFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        alarmBind = DataBindingUtil.inflate(inflater, R.layout.alarm, container, false);



        return alarmBind.getRoot();
    }
}
