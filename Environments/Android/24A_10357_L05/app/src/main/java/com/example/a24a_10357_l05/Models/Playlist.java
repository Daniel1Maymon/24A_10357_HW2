package com.example.a24a_10357_l05.Models;

import java.util.ArrayList;

public class Playlist {
    private String name = "";
    private ArrayList<Song> songArrayList = new ArrayList<>();

    public Playlist(){
    }

    public String getName() {
        return name;
    }

    public Playlist setName(String name) {
        this.name = name;
        return this;
    }

    public ArrayList<Song> getSongArrayList() {
        return songArrayList;
    }

    public Playlist setSongArrayList(ArrayList<Song> songArrayList) {
        this.songArrayList = songArrayList;
        return this;
    }

    public Playlist addSong(Song song){
        this.songArrayList.add(song);
        return this;
    }

    @Override
    public String toString() {
        return "Playlist{" +
                "name='" + name + '\'' +
                ", songArrayList=" + songArrayList +
                '}';
    }
}

