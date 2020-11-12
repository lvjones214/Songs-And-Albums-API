package org.wcci.apimastery;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wcci.apimastery.resources.Album;
import org.wcci.apimastery.resources.Song;
import org.wcci.apimastery.storage.AlbumRepository;
import org.wcci.apimastery.storage.SongRepository;

import java.util.Properties;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class JpaWiringTest {
    @Autowired
    private AlbumRepository albumRepo;
    @Autowired
    private TestEntityManager entityManager;
   @Autowired
    private SongRepository songRepo;

    private void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }
    @Test
    public void albumRepoShouldBeAbleToSaveAndRetrieveAlbumObjects() {
    Album testAlbum = new Album("albumName");
    albumRepo.save(testAlbum);
    flushAndClear();
    Album retrievedAlbum = albumRepo.findById(testAlbum.getId()).get();
    Assertions.assertThat(retrievedAlbum).isEqualTo(testAlbum);
    }
    @Test
    public void songRepoShouldBeAbleToSaveAndRetrieveSongObjects(){
        Song testSong = new Song ("songName");
        songRepo.save(testSong);
        flushAndClear();
        Song retrievedSong = songRepo.findById(testSong.getId()).get();
        Assertions.assertThat(retrievedSong).isEqualTo(testSong);
    }

}