package com.Pgrams;

import java.util.*;

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

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlaylist("Voodoo Chile", playList);
        albums.get(0).addToPlaylist("1983... (A Merman I Should Turn to Be)", playList);
        albums.get(0).addToPlaylist("Purple Haze", playList);
        albums.get(0).addToPlaylist(6, playList);
        albums.get(1).addToPlaylist(3, playList);
        albums.get(1).addToPlaylist(7, playList);
        albums.get(1).addToPlaylist(8, playList);
        albums.get(1).addToPlaylist(15, playList);

        play(playList);
    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if (playList.size() == 0) {
            System.out.println("Playlist is empty!");
            return;
        } else {
            System.out.println("Now playing - " + listIterator.next().toString());
            printMenu();
        }
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing - " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached end of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing - " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached start of playlist");
                        forward = true;
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Replaying - " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached the start of the list");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Replaying - " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now playing - " + listIterator.next());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now playing - " + listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - play next song\n" +
                "2 - play previous song\n" +
                "3 - replay current song\n" +
                "4 - list songs\n" +
                "5 - print actions\n" +
                "6 - remove current song");
    }

    private static void printList(LinkedList<Song> playList) {
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===========================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("===========================");
    }
}
