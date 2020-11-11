package org.wcci.apimastery.resources;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Album {
    private String albumName;

    @Id
    @GeneratedValue
    private Long id;

    public Album( String albumName) {
        this.albumName = albumName;
    }


    public Long getId() { return id;}
}
