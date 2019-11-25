package com.example.cape_town_tour;

import android.content.Context;

import java.util.List;

public class EventsActivity {

    public static void initEventsList(List<Venue> list, Context context) {

        list.add ( new Venue (

                context.getString ( R.string.kwaAce_tittle ),
                context.getString ( R.string.kwaAve_text ),
                R.drawable.kwa_ace
        ) );

        list.add ( new Venue (
                context.getString ( R.string.rands_tittle ),
                context.getString ( R.string.rands_text ),
                R.drawable.rands
        ) );

        list.add ( new Venue (
                context.getString ( R.string.biscuits_tittle ),
                context.getString ( R.string.biscuits_text ),
                R.drawable.biscuits
        ) );

        list.add ( new Venue (
                context.getString ( R.string.constantia_tittle ),
                context.getString ( R.string.constantia_text ),
                R.drawable.constantia
        ) );

    }
}
