const albumDetails = function(album) {
    const albumDetails = document.querySelector(".details");

    const albumInfo = document.createElement("div");
    albumInfo.classList.add("album-info");
    albumDetails.prepend(albumInfo);

    const detailsHeader = document.createElement("h2");
    detailsHeader.innerText = `About: ${album.albumName}`;

    albumDetails.prepend(detailsHeader);
            
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
       

        // let albumElementFlipCard = document.createElement("div");
        // albumElementFlipCard.classList.add("flip-card");
        // albumInfo.appendChild(albumElementFlipCard);

        // let albumElementFlipCardInner = document.createElement("div");
        // albumElementFlipCardInner.classList.add("flip-card-inner");
        // albumInfo.appendChild(albumElementFlipCardInner);

        // let albumElementFlipCardFront = document.createElement("div");
        // albumElementFlipCardFront.classList.add("flip-card-front");
        // albumInfo.appendChild(albumElementFlipCardFront);

        // let albumElementImage = document.createElement("img");
        // albumElementImage.classList.add("album-cover-img");
        // albumElementImage.innerHTML= `src="${album.image}" `
        // albumInfo.appendChild(albumElementImage);


    return albumDetails;
}

export{
    albumDetails
}