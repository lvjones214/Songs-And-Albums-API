const developerButton = document.querySelector(".menu-button");
const modal = document.querySelector(".modal");
const backdrop = document.querySelector(".backdrop");

function closeModal() {
    modal.style.display = "none";
    backdrop.style.display = "none";
}
developerButton.addEventListener("click", function () {
    modal.style.display = "block";
    backdrop.style.display = "block";
});

const exitButton = document.querySelector(".exit");
exitButton.addEventListener("click", closeModal);
backdrop.addEventListener("click", closeModal);





