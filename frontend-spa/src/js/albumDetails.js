const albumDetails = function(albums) {
    const albumDetails = document.createElement("div")
    albumDetails.classList.add("details")
    const detailsHeader = document.createElement("h2")
    detailsHeader.innerHTML = `About: ${album.name}`
    const albumInfo = document.createElement("div")
    albumInfo.classList.add("album-info")


    albums.forEach(album => {
        let albumElementName = document.createElement("p")
        albumElementName.classList.add("album-name")
        let albumElementArtist = document.createElement("p")
        albumElementArtist.classList.add("artist")
        let albumElementLabel = document.createElement("p")
        albumElementLabel.classList.add("record-label")
    });
    albumInfo.appendChild(albums);
}