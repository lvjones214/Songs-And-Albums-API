const albumDetails = function(album) {
    const albumDetails = document.querySelector(".details");
    albumDetails.innerHTML = "";
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
console.log(album)
    album.songs.forEach(song => {
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
    commentsDetails.innerText = `Comments:`;
    commentsBlock.appendChild(commentsDetails);

    const comments = document.createElement("p");
    comments.innerText = `This is a comment`;
    commentsBlock.appendChild(comments);

    //ratings
    const ratingsBlock = document.createElement("div");
    ratingsBlock.classList.add("ratings-block");
    albumDetails.appendChild(ratingsBlock);

    const ratingsDetails = document.createElement("h3");
    ratingsDetails.classList.add("ratings");
    ratingsDetails.innerText = "Ratings:";
    ratingsBlock.appendChild(ratingsDetails);

    const ratings = document.createElement("p")
    ratings.innerText = `This is a rating`;
    ratingsBlock.appendChild(ratings);

    //Forms and buttons
    const commentForm = document.createElement("form")
    commentForm.classList.add("comment-form");

    const commentFormInput = document.createElement("input")
    commentFormInput.setAttribute("type", Text)
    commentFormInput.setAttribute("placeholder", "Unavailable")

    const commentFormButton = document.createElement("button")
    commentFormButton.innerText = `Submit`;

    commentsBlock.appendChild(commentForm);
    commentsBlock.appendChild(commentFormInput);
    commentsBlock.appendChild(commentFormButton);

    const ratingForm = document.createElement("form");
    ratingForm.classList.add("ratings-form");

    const ratingFormInput = document.createElement("input")
    ratingFormInput.setAttribute("type", Text)
    ratingFormInput.setAttribute("placeholder", "Unavailable. Sorry.")

    const ratingFormButton = document.createElement("button")
    ratingFormButton.innerText = `Submit. It wont work`

    ratingsBlock.appendChild(ratingForm);
    ratingsBlock.appendChild(ratingFormInput)
    ratingsBlock.appendChild(ratingFormButton)

    return albumDetails;
}


export {
    albumDetails
}