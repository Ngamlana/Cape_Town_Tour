package com.example.cape_town_tour;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ParksFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        List<Venue> list = new ArrayList<> ();
        ParksActivity.initParksList ( list, getContext () );

        VenueAdapter adapter = new VenueAdapter ( getActivity (), -1, list );
        View view = inflater.inflate ( R.layout.venue_list, container, false );
        ListView listView = (ListView) view.findViewById ( R.id.listView );

        listView.setAdapter ( adapter );

        return view;
    }
}
