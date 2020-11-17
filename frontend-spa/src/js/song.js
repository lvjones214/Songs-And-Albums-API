const songList = function(songs) {
    const songList = document.createElement("div");
    songList.classList.add("song-list")
    const songBlock = document.createElement("div");
    songBlock.classList.add("song-block");
    songList.appendChild(songBlock);

    songs.forEach(song => {
        let songElement = document.createElement("p")
        songElement.classList.add("current-song")
        let songElementArtist = document.createElement("p")
        songElementArtist.classList.add("current-song-artist")
        let songElementImage = document.createElement("img")
        songElementImage.classList.add("current-song-img")
    });

    return songList;
}

export{
    songList
}