const name = document.querySelect("#name");







function inputName(value) {
    return value == ""
}

name.onkeyup = function() {
    if (inputName(name.value)) {
        nameError.classList.remove("hide");
    }
}
