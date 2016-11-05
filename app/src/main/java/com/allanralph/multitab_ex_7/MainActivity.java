package com.allanralph.multitab_ex_7;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TabLayout taby;
    ViewPager vpg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        taby= (TabLayout) findViewById(R.id.tabbb);
        vpg=(ViewPager)findViewById(R.id.vwPager);

        MyAdapter adapt= new MyAdapter(getSupportFragmentManager(),taby.getTabCount());



        vpg.setAdapter(adapt);

        vpg.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(taby));





    }
}
