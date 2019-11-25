package com.example.cape_town_tour;

import android.content.Context;

import java.util.List;

public class RestaurantsActivity {
    public static void initRestaurantsList(List<Venue> list, Context context) {

        list.add ( new Venue (
                context.getString ( R.string.roomed_tittle ),
                context.getString ( R.string.roomed_text ),
                R.drawable.roomed
        ) );

        list.add ( new Venue (
                context.getString ( R.string.milk_tittle ),
                context.getString ( R.string.milk_text ),
                R.drawable.the_milk
        ) );

        list.add ( new Venue (
                context.getString ( R.string.shortmarket_tittle ),
                context.getString ( R.string.shortmarket_text ),
                R.drawable.shortmarket
        ) );

        list.add ( new Venue (
                context.getString ( R.string.overture_tittle ),
                context.getString ( R.string.overture_text ),
                R.drawable.overture
        ) );

    }
}
