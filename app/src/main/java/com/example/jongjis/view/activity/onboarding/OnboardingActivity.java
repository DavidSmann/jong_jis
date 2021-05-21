package com.example.jongjis.view.activity.onboarding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.jongjis.R;
import com.example.jongjis.view.adapter.OnBoardingAdapter;
import com.example.jongjis.databinding.ActivityOnboardingBinding;

import static androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class OnboardingActivity extends AppCompatActivity {
    private ActivityOnboardingBinding binding;
    OnBoardingAdapter onBoardingAdapter;
    int position=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_onboarding);

        binding.vwOnBoarding.setAdapter(new OnBoardingAdapter(getSupportFragmentManager(),BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT));

        onBoardingAdapter = new OnBoardingAdapter(getSupportFragmentManager(),BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

       for (int i =0 ;i <onBoardingAdapter.getCount();i++){
           onBoardingAdapter.getItem(i);
           switch (i){
               case 1:
                   onBoardingAdapter.getItem(i);
                   binding.imgDot.setImageResource(R.drawable.dot_2);
                   break;
               case 2:
                   onBoardingAdapter.getItem(i);
                   binding.imgDot.setImageResource(R.drawable.dot_3);
                   break;
               case 3:
                   onBoardingAdapter.getItem(i);
                   binding.imgDot.setImageResource(R.drawable.dot_5);
                   break;

           }
       }



    }
}