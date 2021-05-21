package com.example.jongjis.view.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


import com.example.jongjis.view.activity.onboarding.fragment.onBoardingFragment;

public class OnBoardingAdapter extends FragmentPagerAdapter {

    onBoardingFragment page1, page2, page3;

    public OnBoardingAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        page1 = new onBoardingFragment();
        page1.setCusPos(1);

        page2 = new onBoardingFragment();
        page2.setCusPos(2);

        page3 = new onBoardingFragment();
        page3.setCusPos(3);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return page1;
            case 1:
                return page2;
            case 2:
                return page3;
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return 3;
    }
}
