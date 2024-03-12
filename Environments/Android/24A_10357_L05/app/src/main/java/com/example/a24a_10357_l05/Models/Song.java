package com.example.a24a_10357_l05.Models;

import java.util.ArrayList;

public class Song {
    private String name = "";
    private String artist = "";
    private int length = 0;
    private long releaseDate = 0;
    private float rating = 0f;
    private Long views = 0l;
    private ArrayList<String> tags = new ArrayList<>();

    public Song(){}

    public String getName() {
        return name;
    }

    public Song setName(String name) {
        this.name = name;
        return this;
    }

    public String getArtist() {
        return artist;
    }

    public Song setArtist(String artist) {
        this.artist = artist;
        return this;
    }

    public int getLength() {
        return length;
    }

    public Song setLength(int length) {
        this.length = length;
        return this;
    }

    public long getReleaseDate() {
        return releaseDate;
    }

    public Song setReleaseDate(long releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    public float getRating() {
        return rating;
    }

    public Song setRating(float rating) {
        this.rating = rating;
        return this;
    }

    public Long getViews() {
        return views;
    }

    public Song setViews(Long views) {
        this.views = views;
        return this;
    }

    public ArrayList<String> getTags() {
        return tags;
    }

    public Song setTags(ArrayList<String> tags) {
        this.tags = tags;
        return this;
    }

    public Song addTag(String tag){
        this.tags.add(tag);
        return this;
    }

    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", artist='" + artist + '\'' +
                ", length=" + length +
                ", releaseDate=" + releaseDate +
                ", rating=" + rating +
                ", views=" + views +
                ", tags=" + tags +
                '}';
    }
}
