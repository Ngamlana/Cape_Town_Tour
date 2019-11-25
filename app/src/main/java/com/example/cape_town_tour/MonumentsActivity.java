package com.example.cape_town_tour;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

public class MonumentsActivity extends AppCompatActivity {

    public static void initMonumentsList(List<Venue> list, Context context) {

        list.add ( new Venue (
                context.getString ( R.string.parliarment_tittle ),
                context.getString ( R.string.parliarment_text ),
                R.drawable.house_parliament
        ) );

        list.add ( new Venue (
                context.getString ( R.string.afrikaans_tittle ),
                context.getString ( R.string.afrikaans_text ),
                R.drawable.afrikaans_language_monument
        ) );

        list.add ( new Venue (
                context.getString ( R.string.rhodes_tittle ),
                context.getString ( R.string.rhodes_text ),
                R.drawable.rhodes_memorial
        ) );

        list.add ( new Venue (
                context.getString ( R.string.huguenot_tittle ),
                context.getString ( R.string.huguenot_text ),
                R.drawable.huguenot_memorial
        ) );

    }
}
