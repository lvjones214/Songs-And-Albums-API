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

    public Album(String name, String albumImage, String albumSongs, String albumLabel, String albumComments, String albumName) {

    }


    public Long getId() { return id;}
}
