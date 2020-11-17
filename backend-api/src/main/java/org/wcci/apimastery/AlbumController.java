package org.wcci.apimastery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.resources.Album;
import org.wcci.apimastery.storage.AlbumStorage;

@RestController
public class AlbumController {

    private AlbumStorage albumStorage;
    public AlbumController(AlbumStorage albumStorage){
        this.albumStorage = albumStorage;
    }

@GetMapping("/api/albums")
    public Iterable <Album>retrieveAllAlbums(){
        return albumStorage.retrieveAllAblbums();
}

//@GetMapping("/api/albums/{id}")
//    public Album retrieve


}
