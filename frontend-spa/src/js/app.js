import {
    albumDetails
} from "./albumDetails.js"

import {
    allAlbums
}
    from "./sampleAllAlbumsjson.js";

import {
    songList
} from "./songListDisplay.js"


//  console.log(albumDetails(allAlbums));
fetch("http://localhost:8080/api/albums")
    .then(response => response.json())
    .then(allAlbums => {
        document.querySelector('.container').appendChild(songList(allAlbums));
        document.querySelector('.container').appendChild(albumDetails(allAlbums[0]));
    })





// const developerButton = document.querySelector(".add-song-button");
// const modal = document.querySelector(".modal");
// const backdrop = document.querySelector(".backdrop");

// function closeModal() {
//     modal.style.display = "none";
//     backdrop.style.display = "none";
// }
// developerButton.addEventListener("click", function() {
//     modal.style.display = "block";
//     backdrop.style.display = "block";
// });

// const exitButton = document.querySelector(".exit");
// exitButton.addEventListener("click", closeModal);
// backdrop.addEventListener("click", closeModal);

//About the Developers Modal
// const developerButton = document.querySelector(".about-button");
// const modal = document.querySelector(".modal");
// const backdrop = document.querySelector(".backdrop");

// function closeModal() {
//     modal.style.display = "none";
//     backdrop.style.display = "none";
// }
// developerButton.addEventListener("click", function() {
//     modal.style.display = "block";
//     backdrop.style.display = "block";
// });

// const exitButton = document.querySelector(".exit");
// exitButton.addEventListener("click", closeModal);
// backdrop.addEventListener("click", closeModal);