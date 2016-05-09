package com.example.em.trackyoufy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by emiliaaxen on 16-05-05.
 */
public class SpotifyFragment extends Fragment {
    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int int_items = 3 ;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v =  inflater.inflate(R.layout.fragment_spotify,null);
        tabLayout = (TabLayout) v.findViewById(R.id.tabs);
        viewPager = (ViewPager) v.findViewById(R.id.viewpager);


        viewPager.setAdapter(new MyAdapter(getChildFragmentManager()));



        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });

        return v;

    }

    class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        /**
         * Returns the  fragment with based on the position .
         */

        @Override
        public Fragment getItem(int position)
        {
            switch (position){
                case 0 : return new SpotifyFragment();
                case 1 : return new YouTubeFragment();
                case 2 : return new PodCastTabFragment();
            }
            return null;
        }

        @Override
        public int getCount() {

            return int_items;

        }

        /**
         * This method returns the title of the tab according to the position.
         */

        @Override
        public CharSequence getPageTitle(int position) {

            switch (position){
                case 0 :
                    return "Trending";
                case 1 :
                    return "Discover";
                case 2 :
                    return "User";
            }
            return null;
        }
    }



}







