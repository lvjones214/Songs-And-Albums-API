const songList = function(songs) {
    const container = document.querySelector(".container");
    const songList = document.createElement("div");
    songList.classList.add("song-list")
    const songBlock = document.createElement("div");
    songBlock.classList.add("song-block");
    container.appendChild(songList);
    songList.appendChild(songBlock);

    songs.forEach(song => {
        let songElement = document.createElement("p");
        songElement.classList.add("current-song");
        let songElementArtist = document.createElement("p");
        songElementArtist.classList.add("current-song-artist");

    
        let songElementImage = document.createElement("img");
        songElementImage.classList.add("current-song-img");
        songElementImage.addEventListener('click', ()=> alert('Will display Album details'));

    

    });

    return songList;
}


}
export{
    songList
}