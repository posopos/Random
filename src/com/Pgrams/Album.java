package com.Pgrams;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs = new ArrayList<Song>();

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
}
