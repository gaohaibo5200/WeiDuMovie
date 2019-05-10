package com.bwei.cinema;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import adapter.GuidanceAdapter;
import butterknife.BindView;
import butterknife.ButterKnife;
import url.URl;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.main_ViewPager)
    ViewPager mainViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        GuidanceAdapter adapter = new GuidanceAdapter();
        mainViewPager.setAdapter(adapter);
    }
}
