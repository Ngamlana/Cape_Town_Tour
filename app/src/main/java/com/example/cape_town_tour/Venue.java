package com.example.cape_town_tour;

import android.util.Log;

public class Venue {
    private String tittle;
    private String info;
    private static final int NoImage = -1;
    private int ImageId = NoImage;

    public Venue(String tittle, String info, int ImageId) {
        this.tittle = tittle;
        this.info = info;
        this.ImageId = ImageId;
    }

    public String getName() {
        return tittle;
    }

    public String getDescription() {
        return info;
    }

    public int getImageResourceId() {
        return ImageId;
    }

    public boolean hasImage() {
        Log.v ( "ImageAvailable", "WordsWithImage: " + (ImageId != NoImage ));
        return ImageId != NoImage;
    }

    @Override
    public String toString() {
        String output = getName () + "\n" + getDescription () + "\n" + getImageResourceId ();
        return output;
    }
}
