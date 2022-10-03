var yaemdeda = "Например, Извинись";
var inputNameField = document.getElementById('nameInput');
var inputNumber = document.getElementsByClassName('number');
var btnNumber = document.getElementById('btnNumber');
var deleteButtons = document.getElementsByClassName("delete");

inputNameField.value = yaemdeda;

inputNameField.addEventListener("focus", focusfunc, true);
inputNameField.addEventListener("blur", blurfunc, true);

for (var i = 0; i < deleteButtons.length; i++) {
    deleteButtons[i].addEventListener("click", function() {
        hideRowFunction(this);
    }, false);
}

function hideRowFunction(element) {
    element.parentNode.parentNode.style.display = "none";
    element.preventDefault();
}

function focusfunc() {
    if (inputNameField.value == yaemdeda) {
        inputNameField.value = "";
    }
}

function blurfunc() {
    if (inputNameField.value == "") {
        inputNameField.value = yaemdeda;
    }
}

btnNumber.onclick = function () {
    if (isNaN(parseInt(inputNumber.value))){
        alert("In number field must be only numbers");
    }
}
let secondInput = document.querySelector('.second__input');

secondInput.value = localStorage.name;

