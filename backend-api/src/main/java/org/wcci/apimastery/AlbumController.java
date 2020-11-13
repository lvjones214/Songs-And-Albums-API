package org.wcci.apimastery;

import org.springframework.web.bind.annotation.RestController;
import org.wcci.apimastery.storage.AlbumStorage;

@RestController
public class AlbumController {

    private AlbumStorage albumStorage;
    public AlbumController(AlbumStorage albumStorage){
        this.albumStorage = albumStorage;
    }


}
