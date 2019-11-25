package com.example.cape_town_tour;

import android.content.Context;

import java.util.List;

public class ParksActivity {

    public static void initParksList(List<Venue> list, Context context) {

        list.add ( new Venue (
                context.getString ( R.string.greenPoint_tittle ),
                context.getString ( R.string.greenPoint_text ),
                R.drawable.greenpoint
        ) );

        list.add ( new Venue (
                context.getString ( R.string.company_tittle ),
                context.getString ( R.string.company_text ),
                R.drawable.company
        ) );

        list.add ( new Venue (
                context.getString ( R.string.durbanville_tittle ),
                context.getString ( R.string.durbanville_text ),
                R.drawable.durbanville
        ) );

        list.add ( new Venue (
                context.getString ( R.string.kirstenbosch_tittle ),
                context.getString ( R.string.kirstenbosch_text ),
                R.drawable.kirstenbosch
        ) );

    }
}
