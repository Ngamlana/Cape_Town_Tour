package com.example.cape_town_tour;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class VenueAdapter extends ArrayAdapter<Venue> {

    public VenueAdapter(Context context, int resources, List<Venue> VenuesList) {
        super ( context, 0, VenuesList );
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        final Venue currentVenue = getItem ( position );
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from ( getContext () ).inflate (
                    R.layout.list_item, parent, false );
        }

        TextView nameVenueTextView = (TextView) listItemView.findViewById ( R.id.TextView );
        nameVenueTextView.setText ( currentVenue.getName () );

        TextView descriptionVenueTextView = (TextView)
                listItemView.findViewById ( R.id.descrTextView );
        descriptionVenueTextView.setText ( currentVenue.getDescription () );

        ImageView photoVenueImageView = (ImageView) listItemView.findViewById ( R.id.ImageView );

        if (currentVenue.hasImage ()) {
            photoVenueImageView.setImageResource ( currentVenue.getImageResourceId () );
            photoVenueImageView.setVisibility ( View.VISIBLE );
        } else {
            photoVenueImageView.setVisibility ( View.GONE );
        }

        return listItemView;
    }
}
