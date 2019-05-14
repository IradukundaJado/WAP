
var checking = false;
var i = 0;
var content;
var stopping = null;

window.onload = function () {
    animationChange();
    startClicked();
    startClicked();
    stopClicked();
    changeSelect();
    turboChecked();
};



function animationChange() {
    i = 0;
    if (stopping !== null) {
        clearInterval(stopping);
    }
    document.getElementById('animation').onchange = changingValue;
}



function changingValue() {

    var value = document.getElementById("animation").value;

    //this ANIMATIONS array is in animation.js file
    document.getElementById('textArea').value = ANIMATIONS[value];
}


function startClicked() {
    i = 0;
    var textContent = document.getElementById('textArea').value;
    content = textContent.split("=====");
    document.getElementById('start').onclick = function () {
        if (stopping !== null) {
            clearInterval(stopping);
        }

        stopping = setInterval(startAnimation, 250);
    };
}

function startAnimation() {
    var value = document.getElementById("animation").value;
    var cont = ANIMATIONS[value];
    document.getElementById('textArea').value = cont.split("=====")[i];
    if (i < cont.split("=====").length - 1) {
        i++;
    } else {
        i = 0;
    }
}

function stopAnimation() {
    checking = false;
    i = 0;
    clearInterval(stopping);
}

function stopClicked() {
    document.getElementById('stop').onclick = stopAnimation;
}

function changeFontSize() {
    var value = document.getElementById('size').value;
    document.getElementById('textArea').style.fontSize = value + "px";
}

function changeSelect() {
    document.getElementById('size').onchange = changeFontSize;
}

function increaseSpeed() {
    var tId = document.getElementById('turbo');
    clearInterval(stopping);
    if (tId.checked) {
        stopping = setInterval(startAnimation, 50);
    } else {
        stopping = setInterval(startAnimation, 250);

    }
}

function turboChecked() {
    var tb = document.getElementById('turbo');
    tb.onchange = increaseSpeed;
}