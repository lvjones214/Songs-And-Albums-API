const songList = function(albums) {
    const songList = document.querySelector(".song-list")
    const songBlock = document.createElement("div");
    songBlock.appendChild(songList);

    const currentSong = document.createElement("p")
    currentSong.classList.add("current-song")
    currentSong.innerText = `${albums.song.songName}` + "-" + `${albums.albumName}`

    const currentSongImg = document.createElement("img")
    currentSongImg.classList.add("current-song-img")
    currentSongImg.setAttribute("src", albums.image)
    currentSongImg.setAttribute("alt", "unavailable")
    songList.appendChild(currentSong)
    songList.appendChild(currentSongImg)

    return songList;
}


export {
    songList
}