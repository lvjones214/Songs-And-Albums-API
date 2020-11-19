package org.wcci.apimastery.resources;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Song {
    @ManyToOne
    @JsonIgnore
    private Album album;
    private String songName;
    @Lob
    private String artist;
    private String playTime;
    private String image;
    @Id
    @GeneratedValue
    private Long id;




    public Song(Album album, String songName, String image, String playTime, String artist){
        this.album = album;
        this.songName = songName;
        this.image = image;
        this.playTime = playTime;
        this.artist = artist;
    }
    protected Song(){}

    public Album album() { return album;}

    public String getArtist () {return artist;}

    public Long getId() {
        return id;
    }

    public String getSongName() {
        return songName;
    }

    public String getPlayTime() {
        return playTime;
    }
    public String getImage() {
        return image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(songName, song.songName) &&
                Objects.equals(id, song.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(songName, id);
    }
}
