package com.Pgrams;

import java.util.ArrayList;

public class Main {
    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("Electric Ladyland", "The Jimi Hendrix Experience");
        album.addSong("And the Gods Made Love", 1.21);
        album.addSong("Have You Ever Been (To Electric Ladyland)", 2.11);
        album.addSong("Crosstown Traffic", 2.25);
        album.addSong("Voodoo Chile", 15.00);
        album.addSong("Little Miss Strange", 2.52);
        album.addSong("Long Hot Summer Night", 3.27);
        album.addSong("Come On", 4.09);
        album.addSong("Gypsy Eyes", 3.43);
        album.addSong("Burning of the Midnight Lamp", 3.39);
        album.addSong("Rainy Day, Dream Away", 3.42);
        album.addSong("1983... (A Merman I Should Turn to Be)", 13.39);
        album.addSong("Moon, Turn the Tides...Gently Gently Away", 1.02);
        album.addSong("Still Raining, Still Dreaming", 4.25);
        album.addSong("House Burning Down", 4.33);
        album.addSong("All Along the Watchtower", 4.01);
        album.addSong("Voodoo Chile (Slight Return)", 5.12);
        albums.add(album);

        album = new Album("The Freewheelin' Bob Dylan", "Bob Dylan");
        album.addSong("Blowin' in the Wind", 2.48);
        album.addSong("Girl from the North County", 3.22);
        album.addSong("Masters of War", 4.34);
        album.addSong("Down the Highway", 3.27);
        album.addSong("Bob Dylan's Blues", 2.23);
        album.addSong("A Hard Rain's a-Gonna Fall", 6.55);
        album.addSong("Don't Think Twice, It's All Right", 3.40);
        album.addSong("Bob Dylan's Dream", 5.03);
        album.addSong("Oxford Town", 1.50);
        album.addSong("Talkin' World War III Blues", 6.28);
        album.addSong("Corrina, Corrina", 2.44);
        album.addSong("Honey, Just Allow Me One More Chance", 2.01);
        album.addSong("I Shall Be Free", 4.49);
        albums.add(album);
    }














}
