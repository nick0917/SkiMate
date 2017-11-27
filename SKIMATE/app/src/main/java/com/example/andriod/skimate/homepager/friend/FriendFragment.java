package com.example.andriod.skimate.homepager.friend;


import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andriod.skimate.R;
import com.example.andriod.skimate.databinding.FriendBinding;

/**
 * Created by Nick0917 on 2017-11-22.
 */

public class FriendFragment extends Fragment {

    FriendBinding friendBind;

    public static Fragment getInstance() {
        FriendFragment friendFragment = new FriendFragment();
        return friendFragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        friendBind = DataBindingUtil.inflate(inflater, R.layout.friend, container, false);



        return friendBind.getRoot();
    }
}
