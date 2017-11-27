package com.example.andriod.skimate.homepager;

import android.support.v4.app.Fragment;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.andriod.skimate.R;
import com.example.andriod.skimate.databinding.PagerBinding;

/**
 * Created by Nick0917 on 2017-11-22.
 */

public class HomePagerFragment extends Fragment {
    private final static String TAG = "HomepagerFragment";

    PagerBinding pagerBind;

    public HomePagerFragment() {
    }

    public static Fragment getInstance() {
        HomePagerFragment homepagerFragment = new HomePagerFragment();
        return homepagerFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        pagerBind = DataBindingUtil.inflate(inflater, R.layout.pager, container, false);

        FragmentManager fragmentManager = getFragmentManager();
        PagerAdapter mPagerAdapter = new PagerAdapter(fragmentManager);
        pagerBind.viewPager.setAdapter(mPagerAdapter);
        pagerBind.tabPager.setupWithViewPager(pagerBind.viewPager);

        return pagerBind.getRoot();
    }

}
