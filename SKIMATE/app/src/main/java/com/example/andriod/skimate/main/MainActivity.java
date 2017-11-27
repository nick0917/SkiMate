package com.example.andriod.skimate.main;

import android.databinding.DataBindingUtil;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.andriod.skimate.R;
import com.example.andriod.skimate.databinding.ActivityMainBinding;
import com.example.andriod.skimate.homepager.HomePagerFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        switchFragment(HomePagerFragment.getInstance());
    }


    private void switchFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.add(R.id.mainFrame, fragment);
        transaction.commit();
    }

}
