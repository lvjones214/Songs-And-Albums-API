package org.wcci.apimastery.storage;

import org.springframework.data.repository.CrudRepository;
import org.wcci.apimastery.resources.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {

}
