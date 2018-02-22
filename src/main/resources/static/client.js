$(document).ready(function () {
    console.log("Yurp");
});

function gotoPerson() {
    var searchString = $("#personSearch").val();
    window.location.href = "/person/" + searchString;
}

function goHome() {
    window.location.href = "/"
}

function gotoEverybody() {
    window.location.href = "/everybody";
}