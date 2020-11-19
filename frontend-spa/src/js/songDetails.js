const songDetails = function(album) {
    const songDetails = document.querySelector(".details");
    songDetails.innerHTML = "";
    const songDetailsHeader = document.createElement("h2");
    songDetailsHeader.innerText = `About: ${album.songs[0].songName}`;
    songDetails.appendChild(songDetailsHeader);

    const songInfo = document.createElement("div");
    songInfo.classList.add("song-info");
    songDetails.appendChild(songInfo);

    let songElementName = document.createElement("p");
    songElementName.classList.add("song-name");
    songElementName.innerText = `Song Name: ${album.songs[0].songName}`

    let songElementArtist = document.createElement("p");
    songElementArtist.classList.add("artist");
    songElementArtist.innerText = `Artist Name: ${album.artist}`

    let songElementPlayTime = document.createElement("p");
    songElementPlayTime.classList.add("song-playtime");
    songElementPlayTime.innerText = `Duration: ${album.songs[0].playTime}`;
    songInfo.appendChild(songElementName);
    songInfo.appendChild(songElementArtist);
    songInfo.appendChild(songElementPlayTime);


    let songElementFlipCard = document.createElement("div");
    songElementFlipCard.classList.add("flip-card");
    songDetails.appendChild(songElementFlipCard);

    let songElementFlipCardInner = document.createElement("div");
    songElementFlipCardInner.classList.add("flip-card-inner");
    songElementFlipCard.appendChild(songElementFlipCardInner);

    let songElementFlipCardFront = document.createElement("div");
    songElementFlipCardFront.classList.add("flip-card-front");
    songElementFlipCardInner.appendChild(songElementFlipCardFront);

    let songElementImage = document.createElement("img");
    songElementImage.classList.add("artist-img");
    songElementImage.setAttribute("src", album.songs[0].image);
    songElementImage.setAttribute("alt", "unavailable");
    songElementFlipCardFront.appendChild(songElementImage);

    let songElementFlipCardBack = document.createElement("div");
    songElementFlipCardBack.classList.add("flip-card-back");
    songElementFlipCardInner.appendChild(songElementFlipCardBack);

    let songElementAlbumImage = document.createElement("img");
    songElementAlbumImage.classList.add("album-img");
    songElementAlbumImage.setAttribute("src", album.image);
    songElementAlbumImage.setAttribute("alt", "unavailable");
    songElementFlipCardBack.appendChild(songElementAlbumImage);


    //comments
    const commentsBlock = document.createElement("div");
    commentsBlock.classList.add("comments-block");
    songDetails.appendChild(commentsBlock);

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
    songDetails.appendChild(ratingsBlock);

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

    return songDetails;
}

export {
    songDetails
}