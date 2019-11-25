package com.example.cape_town_tour;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super ( fm );
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new EventsFragment ();
        } else if (position == 1) {
            return new MonumentsFragment ();
        } else if (position == 2) {
            return new ParksFragment ();
        } else
            return new RestaurantsFragment ();
    }


    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return context.getString ( R.string.about_events );
        } else if (position == 1) {
            return context.getString ( R.string.about_monuments );
        } else if (position == 2) {
            return context.getString ( R.string.about_parks );
        } else {
            return context.getString ( R.string.about_restaurants );
        }
    }
}
