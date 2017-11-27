package com.example.andriod.skimate.homepager;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.andriod.skimate.homepager.alarm.AlarmFragment;
import com.example.andriod.skimate.homepager.friend.FriendFragment;
import com.example.andriod.skimate.homepager.home.HomeFragment;
import com.example.andriod.skimate.homepager.optionMenu.OptionMenuFragment;

/**
 * Created by Nick0917 on 2017-11-23.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private static int PAGE_NUMBER = 4;

    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return HomeFragment.getInstance();
            case 1:
                return FriendFragment.getInstance();
            case 2:
                return AlarmFragment.getInstance();
            case 3:
                return OptionMenuFragment.getInstance();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return PAGE_NUMBER;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "홈";
            case 1:
                return "친구";
            case 2:
                return "알람";
            case 3:
                return "옵션";
            default:
                return null;
        }
    }
}
