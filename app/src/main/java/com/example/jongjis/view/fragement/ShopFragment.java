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
import com.example.jongjis.databinding.FragmentShopBinding;
import com.example.jongjis.model.PopModel;

import java.util.ArrayList;

public class ShopFragment extends Fragment {
    FragmentShopBinding binding;
    ArrayList<PopModel> popModels;
    PopAdapter popAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_shop,
                container,false);

        setUpNearByShopRyc();
        setUpShopRyc();
        setUpPopShopRyc();
        return binding.getRoot();
    }

    public void setUpNearByShopRyc(){
        Log.d("ShopNearByFragment", "setUpPopRyc is called");
        popModels = new ArrayList<>();
        PopAdapter popAdapter = new PopAdapter(getContext());

        Integer [] image= {R.drawable.p9, R.drawable.splashscreen};

        popModels = new ArrayList<>();
        for (int i =0; i<image.length; i++){
            PopModel popModel = new PopModel(image[i]);
            popModels.add(popModel);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false);
        popAdapter.setPopModels(popModels);
        binding.rcyNearByShop.setLayoutManager(linearLayoutManager);
        binding.rcyNearByShop.setItemAnimator(new DefaultItemAnimator());
        binding.rcyNearByShop.setAdapter(popAdapter);

    }

    public void setUpPopShopRyc(){
        Log.d("ShopNearByFragment", "setUpPopRyc is called");
        popModels = new ArrayList<>();
        SpecialOfferAdapter specialOfferAdapter = new SpecialOfferAdapter(getContext());

        Integer [] image= {R.drawable.shop1, R.drawable.shop2};

        popModels = new ArrayList<>();
        for (int i =0; i<image.length; i++){
            PopModel popModel = new PopModel(image[i]);
            popModels.add(popModel);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false);
        specialOfferAdapter.setPopModels(popModels);
        binding.rcyPopShop.setLayoutManager(linearLayoutManager);
        binding.rcyPopShop.setItemAnimator(new DefaultItemAnimator());
        binding.rcyPopShop.setAdapter(specialOfferAdapter);
        specialOfferAdapter.notifyDataSetChanged();
        binding.rcyPopShop.setNestedScrollingEnabled(false);

    }

    public void setUpShopRyc(){
        Log.d("ShopNearByFragment", "setUpPopRyc is called");
        popModels = new ArrayList<>();
        SpecialOfferAdapter specialOfferAdapter = new SpecialOfferAdapter(getContext());

        Integer [] image= {R.drawable.shop3, R.drawable.shop4};

        popModels = new ArrayList<>();
        for (int i =0; i<image.length; i++){
            PopModel popModel = new PopModel(image[i]);
            popModels.add(popModel);
        }

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(),
                LinearLayoutManager.HORIZONTAL,false);
        specialOfferAdapter.setPopModels(popModels);
        binding.rcyShop.setLayoutManager(linearLayoutManager);
        binding.rcyShop.setItemAnimator(new DefaultItemAnimator());
        binding.rcyShop.setAdapter(specialOfferAdapter);
        specialOfferAdapter.notifyDataSetChanged();
        binding.rcyShop.setNestedScrollingEnabled(false);

    }


}
