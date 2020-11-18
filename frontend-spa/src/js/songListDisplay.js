const songList = function(album) {
    const songList = document.querySelector(".song-list");

    const songBlock = document.createElement("div");
    songBlock.classList.add("song-block");
    songList.appendChild(songBlock);

    const currentSong = document.createElement("p");
    currentSong.classList.add("current-song");
    console.log(album);
    currentSong.innerText = `${album.songs[0].songName}` + "-" + `${album.albumName}`;

    const currentSongImg = document.createElement("img");
    currentSongImg.classList.add("current-song-img");
    currentSongImg.setAttribute("src", album.image);
    currentSongImg.setAttribute("alt", "unavailable");
    songBlock.appendChild(currentSong);
    songBlock.appendChild(currentSongImg);

    return songList;
}


export {
    songList
}