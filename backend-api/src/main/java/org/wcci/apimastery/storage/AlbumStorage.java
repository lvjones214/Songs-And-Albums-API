package org.wcci.apimastery.storage;

import org.springframework.stereotype.Service;
import org.wcci.apimastery.resources.Album;

@Service
public class AlbumStorage {

    private AlbumRepository albumRepo;

    public AlbumStorage(AlbumRepository albumRepo) {
        this.albumRepo = albumRepo;
    }

    public Album retrieveAlbumById(Long id){
        return albumRepo.findById(id).get();
    }

    public void saveAlbum(Album albumToSave) {
        albumRepo.save(albumToSave);
    }

    public void deleteAlbumById(Long id){
        albumRepo.deleteById(id);
    }
    public Iterable<Album>retrieveAllAlbums(){
        return albumRepo.findAll();
    }
}
