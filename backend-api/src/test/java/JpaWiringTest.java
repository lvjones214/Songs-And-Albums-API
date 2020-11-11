import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.wcci.apimastery.resources.Album;
import org.wcci.apimastery.storage.AlbumRepository;

import static org.assertj.core.api.Assertions.assertThat;


@DataJpaTest
public class JpaWiringTest {

    private AlbumRepository albumRepo;
    private TestEntityManager entityManager;

    private void flushAndClear() {
        entityManager.flush();
        entityManager.clear();
    }

    @Test
    public void albumRepoShouldSaveAndRetrieveAlbumObjects() {
    Album testAlbum = new Album("albumName");
    albumRepo.save(testAlbum);
    flushAndClear();
    Album retrievedAlbum = albumRepo.findById(testAlbum.getId()).get();
    assertThat(retrievedAlbum).isEqualTo(testAlbum);
    }


}