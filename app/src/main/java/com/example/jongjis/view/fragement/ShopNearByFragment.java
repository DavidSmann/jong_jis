package com.example.jongjis.view.fragement;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.jongjis.R;
import com.example.jongjis.view.adapter.PopAdapter;
import com.example.jongjis.view.adapter.SpecialOfferAdapter;
import com.example.jongjis.databinding.FragmentShopNearbyBinding;
import com.example.jongjis.model.PopModel;

import java.util.ArrayList;

public class ShopNearByFragment extends Fragment {
    FragmentShopNearbyBinding binding;
    ArrayList<PopModel> popModels;
    PopAdapter popAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_shop_nearby,
                container,false);

        setUpPopRyc();
        setUpCurrentBookingRyc();
        setUpSpecialOfferRyc();
        return binding.getRoot();
    }

    public void setUpPopRyc(){
        Log.d("ShopNearByFragment", "setUpPopRyc is called");
        popModels = new ArrayList<>();
        PopAdapter popAdapter = new PopAdapter(getContext());

       Integer [] image= {R.drawable.pp,
               R.drawable.sr,
               R.drawable.kps};

       popModels = new ArrayList<>();
       for (int i =0; i<image.length; i++){
           PopModel popModel = new PopModel(image[i]);
           popModels.add(popModel);
       }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false);
       popAdapter.setPopModels(popModels);
       binding.rcyPop.setLayoutManager(linearLayoutManager);
       binding.rcyPop.setItemAnimator(new DefaultItemAnimator());
       binding.rcyPop.setAdapter(popAdapter);
       popAdapter.notifyDataSetChanged();
       binding.rcyPop.setNestedScrollingEnabled(false);

    }

    public void setUpCurrentBookingRyc(){
        Log.d("ShopNearByFragment", "setUpPopRyc is called");
        popModels = new ArrayList<>();
        PopAdapter popAdapter = new PopAdapter(getContext());

        Integer [] image= {R.drawable.b1, R.drawable.b2, R.drawable.b3};

        popModels = new ArrayList<>();
        for (int i =0; i<image.length; i++){
            PopModel popModel = new PopModel(image[i]);
            popModels.add(popModel);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false);
        popAdapter.setPopModels(popModels);
        binding.rcyCurrentBooking.setLayoutManager(linearLayoutManager);
        binding.rcyCurrentBooking.setItemAnimator(new DefaultItemAnimator());
        binding.rcyCurrentBooking.setAdapter(popAdapter);
        popAdapter.notifyDataSetChanged();
        binding.rcyCurrentBooking.setNestedScrollingEnabled(false);

    }

    public void setUpSpecialOfferRyc(){
        Log.d("ShopNearByFragment", "setUpPopRyc is called");
        popModels = new ArrayList<>();
        SpecialOfferAdapter specialOfferAdapter = new SpecialOfferAdapter(getContext());

        Integer [] image= {R.drawable.discount, R.drawable.disbike};

        popModels = new ArrayList<>();
        for (int i =0; i<image.length; i++){
            PopModel popModel = new PopModel(image[i]);
            popModels.add(popModel);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false);
        specialOfferAdapter.setPopModels(popModels);
        binding.spOffRyc.setLayoutManager(linearLayoutManager);
        binding.spOffRyc.setItemAnimator(new DefaultItemAnimator());
        binding.spOffRyc.setAdapter(specialOfferAdapter);
        specialOfferAdapter.notifyDataSetChanged();
        binding.spOffRyc.setNestedScrollingEnabled(false);

    }
}
