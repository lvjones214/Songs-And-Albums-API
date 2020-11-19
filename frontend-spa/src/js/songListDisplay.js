import{
    albumDetails
}from "./albumDetails.js"

const songList = function(albums) {
    const songList = document.querySelector(".song-list");

    albums.forEach(album =>{
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
        currentSongImg.addEventListener('click', ()=> displaySingleSong(album.songs[0]));
        currentSong.addEventListener('click',()=> albumDetails(album));
    })

    const displaySingleSong = function(song){
        alert(`This will eventually work`)
    }
    
    const displaySingleAlbum = function(album){
        alert(`This will eventually work`)

    }


    return songList;
}


export {
    songList
}