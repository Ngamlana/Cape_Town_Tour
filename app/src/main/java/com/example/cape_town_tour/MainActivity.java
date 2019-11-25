package com.example.cape_town_tour;

import android.os.Bundle;

import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        ViewPager viewPager = (ViewPager) findViewById ( R.id.viewpager );
        viewPager.setAdapter ( new FragmentAdapter ( this, getSupportFragmentManager () ) );

        TabLayout tabLayout = (TabLayout) findViewById ( R.id.tabs );
        tabLayout.setupWithViewPager ( viewPager );
    }
}
