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
       
        let albumElementFlipCard = document.createElement("div");
        albumElementFlipCard.classList.add("flip-card");
        albumDetails.appendChild(albumElementFlipCard);

        let albumElementFlipCardInner = document.createElement("div");
        albumElementFlipCardInner.classList.add("flip-card-inner");
        albumElementFlipCard.appendChild(albumElementFlipCardInner);

        let albumElementFlipCardFront = document.createElement("div");
        albumElementFlipCardFront.classList.add("flip-card-front");
        albumElementFlipCardInner.appendChild(albumElementFlipCardFront);

        let albumElementImage = document.createElement("img");
        albumElementImage.classList.add("album-cover-img");
        albumElementImage.setAttribute("src", album.image)
        albumElementImage.setAttribute("alt", "unavailable");
        albumElementFlipCardFront.appendChild(albumElementImage);

        let albumElementFlipCardBack = document.createElement("div");
        albumElementFlipCardBack.classList.add("flip-card-back");
        albumElementFlipCardInner.appendChild(albumElementFlipCardBack);

        let albumElementSongCardList = document.createElement("ul");
        albumElementSongCardList.classList.add("song-card-list");
        albumElementFlipCardBack.appendChild(albumElementSongCardList);

        album.songs.forEach(song =>{
            const albumElementSongCardItems = document.createElement("li");
            albumElementSongCardItems.innerText = song.songName;
            albumElementSongCardList.appendChild(albumElementSongCardItems);
        });

        //comments
    const commentsBlock = document.createElement("div");
    commentsBlock.classList.add("comments-block");
    albumDetails.appendChild(commentsBlock);

    const commentsDetails = document.createElement("h3");
    commentsDetails.classList.add("comments");
    commentsDetails.innerText= "Comments:";
    commentsBlock.appendChild(commentsDetails);

    const comments = document.querySelector(".comments");
    comments.innerHTML =` <p>Classic album</p>
    <p>This album takes me back to my angsty teen years!</p>
    <p>Super great song, love it!</p>
    <p>Meh.</p> `;
    commentsDetails.appendChild(comments);

    //ratings

    const ratingsBlock = document.createElement("div");
    ratingsBlock.classList.add("ratings-block");
    albumDetails.appendChild(ratingsBlock);

    const ratingsDetails = document.createElement("h3");
    ratingsDetails.classList.add("ratings");
    ratingsDetails.innerText= "Ratings:";
    ratingsBlock.appendChild(ratingsDetails);

    const ratings = document.querySelector(".ratings");
    ratings.innerHTML =` <p>Classic album</p>
    <p>This album takes me back to my angsty teen years!</p>
    <p>Super great song, love it!</p>
    <p>Meh.</p> `;
    ratingsDetails.appendChild(ratings);

    


    return albumDetails;

 
}

export{
    albumDetails
}