package org.wcci.apimastery.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Album {
    private String albumName;

    @Id
    @GeneratedValue
    private Long id;

    protected Album(){}

    public Album( String albumName) {
        this.albumName = albumName;
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
