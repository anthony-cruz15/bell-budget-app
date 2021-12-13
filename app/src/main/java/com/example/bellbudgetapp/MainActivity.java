package com.example.bellbudgetapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager2 pager;
    TabLayout tabLayout;
    SlideAdapter slideAdapter;
    List<Item> items;
    public static final String SHARED_PREF_KEY = "shared_preferences";
    public static final String CONSTRUCTION_LIST_KEY = "construction_items_list";
    public static final String MILE_FURNITURE_LIST_KEY = "mile_furniture_items_list";
    public static final String RECIPE_LIST_KEY = "recipe_items_list";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tabLayout);
        items = new ArrayList<Item>();

        slideAdapter = new SlideAdapter(this);
        pager.setAdapter(slideAdapter);
        new TabLayoutMediator(tabLayout, pager, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                if(position == 0) tab.setText("Breakdown");
                else if(position == 1) tab.setText("Bells");
                else tab.setText("Miles");
            }
        }).attach();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.settings, menu);
        return true;
    }

    private class SlideAdapter extends FragmentStateAdapter {

        public SlideAdapter(@NonNull FragmentActivity fragmentActivity) {
            super(fragmentActivity);
        }

        @NonNull
        @Override
        public Fragment createFragment(int position) {
            if(position == 0) return new BreakdownFragment();
            else if(position == 1) return new BellItemFragment();
            else return new MileItemFragment();
        }

        @Override
        public int getItemCount() {
            return 3;
        }
    }
}