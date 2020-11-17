const albumDetails = function(allAlbums) {
    const albumDetails = document.createElement("div");
    albumDetails.classList.add("details");
    const detailsHeader = document.createElement("h2");
    detailsHeader.innerHTML = `About: ${allAlbums.albumName}`;
    const albumInfo = document.createElement("div");
    albumInfo.classList.add("album-info");
    albumDetails.appendChild(albumInfo);



    allAlbums.forEach(album => {
        let albumElementName = document.createElement("p")
        albumElementName.classList.add("album-name")
        albumElementName.innerText = album.albumName

        let albumElementArtist = document.createElement("p")
        albumElementArtist.classList.add("artist")
        albumElementArtist.innerText = `Artist Name: ${album.artist}`

        let albumElementLabel = document.createElement("p")
        albumElementLabel.classList.add("record-label")
        albumElementLabel.innerText = `Record Label: ${album.recordLabel}`

        albumElementName.appendChild(albumElementArtist);
        albumElementName.appendChild(albumElementLabel);

    });

    return albumDetails;
}

export{
    albumDetails
}