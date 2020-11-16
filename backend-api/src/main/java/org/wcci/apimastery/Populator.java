package org.wcci.apimastery;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.wcci.apimastery.resources.Album;
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
    public void run(String... args) throws Exception {

        Album ratm = new Album("Rage Against the Machine", "ratmImage", "Rage Against the Machine", "Epic");
        albumStorage.saveAlbum(ratm);
        Album jaglittlepill = new Album("Jagged Little Pill", "Alanis Morissette image", "Alanis Morissette", "Maverick");
        albumStorage.saveAlbum(jaglittlepill);
        Album amo = new Album("amo", "BMTHimage", "Bring Me The Horizon", "Sony");
        albumStorage.saveAlbum(amo);


        songRepo.save(new Song(ratm, "Bombtrack", "/src/images/ratm.jpg", "04:04"));
        songRepo.save(new Song(ratm, "Killing in the Name", "/src/images/ratm.jpg", "05:14"));
        songRepo.save(new Song(ratm, "Take the Power Back", "/src/images/ratm.jpg", "05:37"));
        songRepo.save(new Song(ratm, "Settle for Nothing", "/src/images/ratm.jpg", "04:48"));
        songRepo.save(new Song(ratm, "Bullet in the Head", "/src/images/ratm.jpg", "05:09"));
        songRepo.save(new Song(ratm, "Know Your Enemy", "/src/images/ratm.jpg", "04:55"));
        songRepo.save(new Song(ratm, "Wake Up", "/src/images/ratm.jpg", "06:04"));
        songRepo.save(new Song(ratm, "Fistful of Steel", "/src/images/ratm.jpg", "05:31"));
        songRepo.save(new Song(ratm, "Township Rebellion", "/src/images/ratm.jpg", "05:24"));
        songRepo.save(new Song(ratm, "Freedom", "/src/images/ratm.jpg", "06:06"));
        songRepo.save(new Song(jaglittlepill, "All I Really Want", "/src/images/am.png", "4:45"));
        songRepo.save(new Song(jaglittlepill, "You Oughta Know", "/src/images/am.png", "4:09"));
        songRepo.save(new Song(jaglittlepill, "Perfect", "/src/images/am.png", "3:08"));
        songRepo.save(new Song(jaglittlepill, "Hand in My Pocket", "/src/images/am.png", "3:42"));
        songRepo.save(new Song(jaglittlepill, "Right Through You", "/src/images/am.png", "2:56"));
        songRepo.save(new Song(jaglittlepill, "Forgiven", "/src/images/am.png", "5:00"));
        songRepo.save(new Song(jaglittlepill, "You Learn", "/src/images/am.png", "4:00"));
        songRepo.save(new Song(jaglittlepill, "Head Over Feet", "/src/images/am.png", "4:27"));
        songRepo.save(new Song(jaglittlepill, "Mary Jane", "/src/images/am.png", "4:41"));
        songRepo.save(new Song(jaglittlepill, "Ironic", "/src/images/am.png", "3:50"));
        songRepo.save(new Song(jaglittlepill, "Not the Doctor", "/src/images/am.png", "3:48"));
        songRepo.save(new Song(jaglittlepill, "Wake Up", "/src/images/am.png", "4:54"));
        songRepo.save(new Song(jaglittlepill, "You Oughta Know (Jimmy the Saint Blend)", "/src/images/am.png", "8:13"));
        songRepo.save(new Song(amo, "I Apologise If You Feel Something", "/src/images/bmth.png", "2:19"));
        songRepo.save(new Song(amo, "Mantra", "/src/images/bmth.png", "3:53"));
        songRepo.save(new Song(amo, "Nihilist Blues", "/src/images/bmth.png", "5:25"));
        songRepo.save(new Song(amo, "In the Dark", "/src/images/bmth.png", "4:31"));
        songRepo.save(new Song(amo, "Wonderful Life", "/src/images/bmth.png", "4:34"));
        songRepo.save(new Song(amo, "Ouch", "/src/images/bmth.png", "1:49"));
        songRepo.save(new Song(amo, "Medicine", "/src/images/bmth.png", "3:47"));
        songRepo.save(new Song(amo, "Sugar Honey Ice & Tea", "/src/images/bmth.png", "4:21"));
        songRepo.save(new Song(amo, "Why You Gotta Kick Me When I'm Down?", "/src/images/bmth.png", "4:28"));
        songRepo.save(new Song(amo, "Fresh Bruises", "/src/images/bmth.png", "3:18"));
        songRepo.save(new Song(amo, "Mother Tongue", "/src/images/bmth.png", "3:37"));
        songRepo.save(new Song(amo, "Heavy Metal", "/src/images/bmth.png", "4:00"));
        songRepo.save(new Song(amo, "I Don't Know What to Say", "/src/images/bmth.png", "5:52"));
    }

}
