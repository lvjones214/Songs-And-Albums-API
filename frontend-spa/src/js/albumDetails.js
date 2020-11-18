const albumDetails = function(album) {
    const albumDetails = document.querySelector(".details");

    const detailsHeader = document.createElement("h2");
    detailsHeader.innerText = `About: ${album.albumName}`;
    albumDetails.appendChild(detailsHeader);
    
    const albumInfo = document.createElement("div");
    albumInfo.classList.add("album-info");
    albumDetails.appendChild(albumInfo);
        
        let albumElementName = document.createElement("p")
        albumElementName.classList.add("album-name")
        albumElementName.innerText = `Album Name: ${album.albumName}`

        let albumElementArtist = document.createElement("p")
        albumElementArtist.classList.add("artist")
        albumElementArtist.innerText = `Artist Name: ${album.artist}`

        let albumElementLabel = document.createElement("p")
        albumElementLabel.classList.add("record-label")
        albumElementLabel.innerText = `Record Label: ${album.recordLabel}`
        albumInfo.appendChild(albumElementName);
        albumInfo.appendChild(albumElementArtist);
        albumInfo.appendChild(albumElementLabel);
       


        // let albumElementFlipCard = document.querySelector("flip-card");
        // albumElementFlipCard.insertAdjacentElement("afterbegin", albumElementFlipCardInner);
        // albumElementFlipCardInner.insertAdjacentElement("beforeend", albumElementFlipCardFront);
        // let albumElementFlipCardInner = document.createElement("div");
        // albumElementFlipCardInner.classList.add("flip-card-inner");

        // let albumElementFlipCardFront = document.createElement("div");
        // albumElementFlipCardFront.classList.add("flip-card-front");
        
        let albumElementFlipCard = document.createElement("div");
        albumElementFlipCard.classList.add("flip-card");
        albumInfo.appendChild(albumElementFlipCard);

        let albumElementFlipCardInner = document.createElement("div");
        albumElementFlipCardInner.classList.add("flip-card-inner");
        albumElementFlipCard.appendChild(albumElementFlipCardInner);

        let albumElementFlipCardFront = document.createElement("div");
        albumElementFlipCardFront.classList.add("flip-card-front");
        albumElementFlipCardInner.appendChild(albumElementFlipCardFront);

        let albumElementImage = document.createElement("img");
        albumElementImage.classList.add("album-cover-img");
        albumElementImage.innerHTML= `src = ${album.image} alt="unavailable"`
        albumElementFlipCardFront.appendChild(albumElementImage);

        let albumElementFlipCardBack = document.createElement("div");
        albumElementFlipCardBack.classList.add("flip-card-back");
        albumElementImage.appendChild(albumElementFlipCardBack);

        let albumElementSongCardList = document.createElement("ul");
        albumElementSongCardList.classList.add("song-card-list");
        albumElementFlipCardBack.appendChild(albumElementSongCardList);

        album.songs.forEach(song =>{
            const albumElementSongCardItems = document.createElement("li");
            albumElementSongCardItems.innerText = song.songName;
            albumElementSongCardList.appendChild(albumElementSongCardItems);
        });



    return albumDetails;
}

export{
    albumDetails
}