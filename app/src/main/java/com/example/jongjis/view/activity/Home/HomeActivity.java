package com.example.jongjis.view.activity.Home;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.databinding.DataBindingUtil;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

import com.example.jongjis.R;
import com.example.jongjis.view.adapter.HometapAdapter;
import com.example.jongjis.databinding.ActivityHomeBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class HomeActivity extends AppCompatActivity {

    private ActivityHomeBinding binding;
    private HometapAdapter hometapAdapter;
    DrawerLayout drawerLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_home);
        drawerLayout = findViewById(R.id.drawer_layout);
        setUpTab(new HometapAdapter(this));

        binding.crdAcc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    openDrawer(drawerLayout);
            }
        });
    }

    public void setUpTab(HometapAdapter hometapAdapter){
        binding.vwHomeTap.setAdapter(hometapAdapter);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(
                binding.tabHome, binding.vwHomeTap, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position) {
                    case 0:
                        tab.setText("Home");
                        break;
                    case 1:
                        tab.setText("Shop");
                        break;
                }
            }
        });
        tabLayoutMediator.attach();
    }

    private static void openDrawer(DrawerLayout drawerLayout) {
        drawerLayout.openDrawer(GravityCompat.START);
    }
}