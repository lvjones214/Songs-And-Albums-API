package org.wcci.apimastery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.resources.Song;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.SongRepository;

@Component
public class Populator implements CommandLineRunner {

    private AlbumStorage albumStorage;
    private SongRepository songRepo;

    public Populator(AlbumStorage albumStorage, SongRepository songRepo) {
        this.albumStorage = albumStorage;
        this.songRepo = songRepo;
    }

    @Override
    public void  run(String... args) throws Exception {
    }
}
