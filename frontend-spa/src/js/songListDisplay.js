import {
    albumDetails
} from "./albumDetails.js"
import { songDetails } from "./songDetails.js";

const songList = function(albums) {
    const songList = document.querySelector(".song-list");

    albums.forEach(album => {
        const songBlock = document.createElement("div");
        songBlock.classList.add("song-block");
        songList.appendChild(songBlock);

        const currentSong = document.createElement("p");
        currentSong.classList.add("current-song");
        currentSong.innerText = `${album.songs[0].songName}` + "-" + `${album.albumName}`;
        const currentSongImg = document.createElement("img");
        currentSongImg.classList.add("current-song-img");
        currentSongImg.setAttribute("src", album.image);
        currentSongImg.setAttribute("alt", "unavailable");
        songBlock.appendChild(currentSong);
        songBlock.appendChild(currentSongImg);
        currentSong.addEventListener('click', () => songDetails(album.songs[0]));
        currentSongImg.addEventListener('click', () => albumDetails(album));
    })
    return songList;
}

export {
    songList
}