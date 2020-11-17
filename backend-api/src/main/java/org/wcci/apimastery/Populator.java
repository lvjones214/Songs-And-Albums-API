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

        Album ratm = new Album("Rage Against the Machine", "/src/images/ratm.jpg", "Rage Against the Machine", "Epic");
        albumStorage.saveAlbum(ratm);
        Album jaglittlepill = new Album("Jagged Little Pill", "/src/images/am.png", "Alanis Morissette", "Maverick");
        albumStorage.saveAlbum(jaglittlepill);
        Album amo = new Album("amo", "/src/images/bmth.png", "Bring Me The Horizon", "Sony");
        albumStorage.saveAlbum(amo);


        songRepo.save(new Song(ratm, "Bombtrack", "/src/images/ratm-song.jpg", "04:04", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Killing in the Name", "/src/images/ratm-song.jpg", "05:14", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Take the Power Back", "/src/images/ratm-song.jpg", "05:37", "Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Settle for Nothing", "/src/images/ratm-song.jpg", "04:48"," Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Bullet in the Head", "/src/images/ratm-song.jpg", "05:09","Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Know Your Enemy", "/src/images/ratm-song.jpg", "04:55", "Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Wake Up", "/src/images/ratm-song.jpg", "06:04", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Fistful of Steel", "/src/images/ratm-song.jpg", "05:31", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Township Rebellion", "/src/images/ratm-song.jpg", "05:24","Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Freedom", "/src/images/ratm-song.jpg", "06:06", "Rage Against the Machine" ));
        songRepo.save(new Song(jaglittlepill, "All I Really Want", "/src/images/am-song.png", "4:45","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "You Oughta Know", "/src/images/am-song.png", "4:09", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Perfect", "/src/images/am-song.png", "3:08", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Hand in My Pocket", "/src/images/am-song.png", "3:42","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Right Through You", "/src/images/am-song.png", "2:56", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Forgiven", "/src/images/am-song.png", "5:00","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "You Learn", "/src/images/am-song.png", "4:00","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Head Over Feet", "/src/images/am-song.png", "4:27","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Mary Jane", "/src/images/am-song.png", "4:41", "Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Ironic", "/src/images/am-song.png", "3:50","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Not the Doctor", "/src/images/am-song.png", "3:48", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Wake Up", "/src/images/am-song.png", "4:54","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "You Oughta Know (Jimmy the Saint Blend)", "/src/images/am-song.png", "8:13","Alanis Morissette" ));
        songRepo.save(new Song(amo, "I Apologise If You Feel Something", "/src/images/bmth-song.png", "2:19","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Mantra", "/src/images/bmth-song.png", "3:53", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Nihilist Blues", "/src/images/bmth-song.png", "5:25","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "In the Dark", "/src/images/bmth-song.png", "4:31","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Wonderful Life", "/src/images/bmth-song.png", "4:34", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Ouch", "/src/images/bmth-song.png", "1:49", "Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Medicine", "/src/images/bmth-song.png", "3:47","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Sugar Honey Ice & Tea", "/src/images/bmth-song.png", "4:21", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Why You Gotta Kick Me When I'm Down?", "/src/images/bmth-song.png", "4:28", "Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Fresh Bruises", "/src/images/bmth-song.png", "3:18", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Mother Tongue", "/src/images/bmth-song.png", "3:37","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Heavy Metal", "/src/images/bmth-song.png", "4:00","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "I Don't Know What to Say", "/src/images/bmth-song.png", "5:52","Bring Me The Horizon" ));
    }

}
