package org.wcci.apimastery;

import org.springframework.web.bind.annotation.*;
import org.wcci.apimastery.resources.Album;
import org.wcci.apimastery.resources.Song;
import org.wcci.apimastery.storage.AlbumStorage;
import org.wcci.apimastery.storage.SongRepository;

@RestController
public class AlbumController {

    private AlbumStorage albumStorage;
    private SongRepository songRepo ;

    public AlbumController(AlbumStorage albumStorage, SongRepository songRepo) {
        this.albumStorage = albumStorage;
        this.songRepo = songRepo;
    }

    @GetMapping("/api/albums")
    public Iterable<Album> retrieveAllAlbums() {
        return albumStorage.retrieveAllAlbums();
    }

    @GetMapping("/api/albums/{id}")
    public Album retrieveAlbumById(@PathVariable Long id) {
        return albumStorage.retrieveAlbumById(id);
    }

    @DeleteMapping("/api/albums/{id}")
    public Iterable<Album> deleteAlbumById(@PathVariable Long id) {
        albumStorage.deleteAlbumById(id);
        return albumStorage.retrieveAllAlbums();
    }

    @PostMapping("/api/albums")
    public Iterable<Album> addAlbum(@RequestBody Album albumToAdd) {
        albumStorage.saveAlbum(albumToAdd);
        return albumStorage.retrieveAllAlbums();


    }
    @PatchMapping("/api/albums/{albumId}/songs")
    public Album addSongToAlbum (@PathVariable Long albumId, @RequestBody Song songToAdd){
        Album album = albumStorage.retrieveAlbumById(albumId);
        Song song = new Song(album, songToAdd.getSongName(), songToAdd.getImage(), songToAdd.getPlayTime(), songToAdd.getArtist());
        songRepo.save(song);
        return albumStorage.retrieveAlbumById(albumId);

    }

}
