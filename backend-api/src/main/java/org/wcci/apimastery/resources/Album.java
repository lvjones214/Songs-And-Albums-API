package org.wcci.apimastery.resources;

import javax.persistence.*;
import java.util.*;

@Entity
public class Album {
    private String albumName;
    private String image;
    private String artist;
    private String recordLabel;
    @OneToMany (mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Song> songs = new LinkedHashSet<>();

    @Id
    @GeneratedValue
    private Long id;

    protected Album(){}



    public Album(String albumName, String image, String artist, String recordLabel) {
        this.albumName = albumName;
        this.image = image;
        this.artist = artist;
        this.recordLabel = recordLabel;
    }

    public String getAlbumName() {
        return albumName;
    }

    public String getImage() {
        return image;
    }

    public String getArtist() {
        return artist;
    }

    public String getRecordLabel() {
        return recordLabel;
    }

    public Set<Song> getSongs() {
        return songs;
    }

    public Long getId() { return id;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Album album = (Album) o;
        return Objects.equals(albumName, album.albumName) &&
                Objects.equals(id, album.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(albumName, id);
    }
}
