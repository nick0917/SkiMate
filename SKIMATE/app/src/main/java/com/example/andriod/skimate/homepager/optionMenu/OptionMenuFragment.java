package com.example.andriod.skimate.homepager.optionMenu;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andriod.skimate.R;
import com.example.andriod.skimate.databinding.OptionMenuBinding;

/**
 * Created by Nick0917 on 2017-11-22.
 */

public class OptionMenuFragment extends Fragment {

    OptionMenuBinding optionMenuBind;

    public static Fragment getInstance() {
        OptionMenuFragment optionFragment = new OptionMenuFragment();
        return optionFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        optionMenuBind = DataBindingUtil.inflate(inflater, R.layout.option_menu, container, false);



        return optionMenuBind.getRoot();
    }
}
