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

        Album ratm = new Album("Rage Against the Machine", "https://upload.wikimedia.org/wikipedia/en/1/1a/RageAgainsttheMachineRageAgainsttheMachine.jpg", "Rage Against the Machine", "Epic");
        albumStorage.saveAlbum(ratm);
        Album jaglittlepill = new Album("Jagged Little Pill", "https://upload.wikimedia.org/wikipedia/en/4/47/Alanis_Morissette_-_Jagged_Little_Pill.jpg", "Alanis Morissette", "Maverick");
        albumStorage.saveAlbum(jaglittlepill);
        Album amo = new Album("amo", "https://upload.wikimedia.org/wikipedia/en/9/97/AmoBringMetheHorizon.png", "Bring Me The Horizon", "Sony");
        albumStorage.saveAlbum(amo);
        Album underTheTableAndDreaming = new Album("Under The Table and Dreaming", "https://upload.wikimedia.org/wikipedia/en/d/d3/Dave_Matthews_Band_-_Under_the_Table_and_Dreaming.jpg", "Dave Matthews Band", "RCA");
        albumStorage.saveAlbum(underTheTableAndDreaming);
        Album bandOfGypsys = new Album("Band of Gypsys", "https://upload.wikimedia.org/wikipedia/en/5/5c/Band_of_Gypsys_album.jpg", "Jimmy Hendrix", "Capitol");
        albumStorage.saveAlbum(bandOfGypsys);
        Album abbeyRoad = new Album("Abbey Road", "https://upload.wikimedia.org/wikipedia/en/4/42/Beatles_-_Abbey_Road.jpg", "The Beatles", "Apple");
        albumStorage.saveAlbum(abbeyRoad);


        songRepo.save(new Song(ratm, "Bombtrack", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "04:04", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Killing in the Name", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "05:14", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Take the Power Back", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "05:37", "Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Settle for Nothing", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "04:48"," Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Bullet in the Head", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "05:09","Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Know Your Enemy", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "04:55", "Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Wake Up", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "06:04", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Fistful of Steel", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "05:31", "Rage Against the Machine"));
        songRepo.save(new Song(ratm, "Township Rebellion", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "05:24","Rage Against the Machine" ));
        songRepo.save(new Song(ratm, "Freedom", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f9/Rage_Against_The_Machine.jpg/1280px-Rage_Against_The_Machine.jpg", "06:06", "Rage Against the Machine" ));
        songRepo.save(new Song(jaglittlepill, "All I Really Want", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "4:45","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "You Oughta Know", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "4:09", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Perfect", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "3:08", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Hand in My Pocket", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "3:42","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Right Through You", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "2:56", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Forgiven", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "5:00","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "You Learn", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "4:00","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Head Over Feet", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "4:27","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Mary Jane", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "4:41", "Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Ironic", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "3:50","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "Not the Doctor", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "3:48", "Alanis Morissette"));
        songRepo.save(new Song(jaglittlepill, "Wake Up", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "4:54","Alanis Morissette" ));
        songRepo.save(new Song(jaglittlepill, "You Oughta Know (Jimmy the Saint Blend)", "https://upload.wikimedia.org/wikipedia/commons/8/82/Alanis_Morissette_5-19-2014.jpg", "8:13","Alanis Morissette" ));
        songRepo.save(new Song(amo, "I Apologise If You Feel Something", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "2:19","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Mantra", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "3:53", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Nihilist Blues", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "5:25","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "In the Dark", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "4:31","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Wonderful Life", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "4:34", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Ouch", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "1:49", "Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Medicine", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "3:47","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Sugar Honey Ice & Tea", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "4:21", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Why You Gotta Kick Me When I'm Down?", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "4:28", "Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Fresh Bruises", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "3:18", "Bring Me The Horizon"));
        songRepo.save(new Song(amo, "Mother Tongue", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "3:37","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "Heavy Metal", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "4:00","Bring Me The Horizon" ));
        songRepo.save(new Song(amo, "I Don't Know What to Say", "https://cdn.mos.cms.futurecdn.net/kEPbSda8Q6siatsfRmg92V-970-80.jpg.webp", "5:52","Bring Me The Horizon" ));
        songRepo.save(new Song(underTheTableAndDreaming, "The Best of What's Around", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "4:17", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "What Would You Say", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "3:43", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Satellite", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "4:52", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Rhyme & Reason", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "5:16", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Typical Situation", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "5:59", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Dancing Nancies", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "6:08", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Ants Marching", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "4:31", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Lover Lay Down", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "5:38", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Jimi Thing", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "5:57", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "Warehouse", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "4:35", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "The Best of What's Around", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "4:17", "Dave Matthews Band"));
        songRepo.save(new Song(underTheTableAndDreaming, "#34", "https://static.spin.com/files/field/image/090218-dave-matthew-band.jpg", "4:58", "Dave Matthews Band"));
        songRepo.save(new Song(bandOfGypsys, "Who Knows", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "9:34", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "Machine Gun", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "12:38", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "Changes", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "5:11", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "Power to Love", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "6:55", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "Message of Love", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "5:24", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "We Gotta Live Together", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "5:51", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "Hear My Train A Comin", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "9:02", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "Foxy Lady", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "6:33", "Jimmy Hendrix" ));
        songRepo.save(new Song(bandOfGypsys, "Stop", "https://upload.wikimedia.org/wikipedia/commons/a/ae/Jimi_Hendrix_1967.png", "4:47", "Jimmy Hendrix" ));
        songRepo.save(new Song(abbeyRoad, "Come Together", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "4:19", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Something", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "4:19", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Maxwell's Silver Hammer", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "3:27", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Oh! Darling", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "3:27", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Octopus's Garden", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "2:51", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "I Want You (She's So Heavy)", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "7:47", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Here Comes the Sun", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "3:05", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Because", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "2:45", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "You Never Give Me Your Money", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "4:03", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Sun King", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "2:26", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Mean Mr. Mustard", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "1:06", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Polythene Pam", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "1:13", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "She Came In Through the Bathroom Window", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "1:58", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Mean Mr. Mustard", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "1:06", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Mean Mr. Mustard", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "1:06", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Mean Mr. Mustard", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "1:06", "The Beatles" ));
        songRepo.save(new Song(abbeyRoad, "Mean Mr. Mustard", "https://cdn.britannica.com/18/136518-050-CD0E49C6/The-Beatles-Ringo-Starr-Paul-McCartney-George.jpg", "1:06", "The Beatles" ));
    }

}
