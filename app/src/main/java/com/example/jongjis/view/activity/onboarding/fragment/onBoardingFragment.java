package com.example.jongjis.view.activity.onboarding.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;

import com.example.jongjis.R;
import com.example.jongjis.view.activity.Home.HomeActivity;
import com.example.jongjis.databinding.OnboardingFragmentBinding;
import com.example.jongjis.view.activity.LoginActivity;

public class onBoardingFragment extends Fragment {
    int cusPos = 1;
    OnboardingFragmentBinding binding;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.onboarding_fragment,container,false);
        switch (cusPos){
            case 1:
                binding.imageOnboard.setImageResource(R.drawable.ride_bike);
                binding.tvTitle.setText("Rent a Bike");
                binding.tvDes.setText("Your bicycle is booked and\n" +
                        "waiting  for you");
                binding.imgDot.setImageResource(R.drawable.dot_2);
                break;
            case 2:
                binding.imageOnboard.setImageResource(R.drawable.choose);
                binding.tvTitle.setText("Easy Rent Bike");
                binding.tvDes.setText("Choose  the bike that is \n" +
                        "convenient for you. Compare\n" +
                        "price and model right in the app");
                binding.imgDot.setImageResource(R.drawable.dot_3);
                break;
            case 3:
                binding.imageOnboard.setImageResource(R.drawable.mobile_pay);
                binding.tvTitle.setText("Booking Bike");
                binding.tvDes.setText("Get to the nearest parking and\n" +
                        "pay for your bike rental right in\n" +
                        "the app");
                binding.imgNext.setVisibility(View.VISIBLE);
                binding.imgDot.setImageResource(R.drawable.dot_5);
                binding.imgNext.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(getContext(), LoginActivity.class);
                        startActivity(intent);
                    }
                });

                break;
        }


        return binding.getRoot();
    }
    public void setCusPos(int cusPos){
        this.cusPos = cusPos;
    }
}
