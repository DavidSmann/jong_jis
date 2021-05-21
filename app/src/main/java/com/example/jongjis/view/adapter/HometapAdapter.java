package com.example.jongjis.view.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.jongjis.view.fragement.ShopFragment;
import com.example.jongjis.view.fragement.ShopNearByFragment;

public class HometapAdapter extends FragmentStateAdapter {

    public HometapAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: {
                return new ShopNearByFragment();
            }
            case 1: {
                return new ShopFragment();
            }
            case 2:

            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
