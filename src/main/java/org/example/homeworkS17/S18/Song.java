package org.example.homeworkS17.S18;

public class Song {
    private String title;
    private String artist;
    private double length; // Length in seconds

    public Song(String title, String artist, double length) {
        this.title = title;
        this.artist = artist;
        this.length = length;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Song)) return false;
        Song song = (Song) obj;
        return title.equals(song.title) && artist.equals(song.artist);
    }

    @Override
    public int hashCode() {
        int result = title.hashCode();
        result = 31 * result + artist.hashCode();
        return result;
    }

    // Getters and setters can be added here if needed
}
