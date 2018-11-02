package com.Pgrams;

import java.util.ArrayList;

public class Album {
    private String albumTitle;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String albumTitle, ArrayList<Song> songs) {
        this.albumTitle = albumTitle;
        this.songs = songs;
    }

    public String getAlbumTitle() {
        return albumTitle;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
