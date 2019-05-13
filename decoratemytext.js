
function checking() {
    var checkBxid = document.getElementById("check");
    var textId = document.getElementById('textArea');
    if (checkBxid.checked) {
        textId.style.fontWeight = "bold";
        textId.style.textDecoration = "underline";
        textId.style.color = "green";
        document.getElementById("body").className = "bodying";

    } else {
        textId.style.fontWeight = "normal";
        textId.style.textDecoration = "none";
        textId.style.color = "black";
        document.getElementById("body").className = "";
    }
}

function translatePigLatin(str) {
    document.getElementById('textArea').innerHTML =
            /[aeiou]/i.test(str[0]) ? str + 'way' :
            str.slice(str.match(/^[^aeiou]+/)[0].length) +
            str.slice(0, str.match(/^[^aeiou]+/)[0].length) + 'ay';
}

function myFunc() {
    var word = document.getElementById('textArea').value;
    document.getElementById('textArea').innerHTML = word;
    translatePigLatin(word);
}

function alerting() {
    var textId = document.getElementById('textArea');
    var size = parseInt(window.getComputedStyle(textId).fontSize);
    size += 2;
    textId.style.fontSize = size + "pt";
}

function btnClicked() {
    var btnId = document.getElementById("bigger");
    btnId.onclick = function () {
        setInterval(alerting, 500);
    };
}

function changeToPigLatin(){
    var btnId = document.getElementById('translate');
    btnId.onclick = myFunc;
}

function checkBoxChecked() {
    var checkBxid = document.getElementById("check");
    checkBxid.onchange = checking;
}


window.onload = function () {
    btnClicked();
    checkBoxChecked();
    changeToPigLatin();
};