package com.allanralph.multitab_ex_7;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by ALLAN RALPH on 05-Nov-16.
 */

public class MyAdapter extends FragmentStatePagerAdapter {

        private  int tabCount;
        public MyAdapter(FragmentManager fm,int tabCount) {
            super(fm);
            this.tabCount=tabCount;
        }

        @Override
        public Fragment getItem(int position) {

            switch (position)
            {
                case 0:
                    January jan=new January();
                    return  jan;
                case 1:
                    February feb=new February();
                    return feb;
                case 2:
                    March mar=new March();
                    return mar;
                case 3:
                    April apr=new April();
                    return  apr;
                case 4:
                    May may=new May();
                    return may;
                case 5:
                    June jun=new June();
                    return jun;
                case 6:
                    July jul=new July();
                    return jul;

                case 7:
                    August aug=new August();
                    return aug;
                case 8:
                    September sep = new September();
                    return sep;
                case 9:
                    October oct=new October();
                    return oct;

                case 10:
                    November nov=new November();
                    return nov;
                case 11:
                    December dec=new December();
                    return dec;

                default:
                    return null;



            }

        }

        @Override
        public int getCount() {
            return tabCount;
        }
    }
