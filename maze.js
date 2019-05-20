/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function () {

    var hit = false;
    var start = false;

    $('.boundary').mouseover(function () {
        if (start) {
            $('.boundary').addClass("youlose");
            hit = true;
        }
    });

    $('#start').click(function () {
        $(".boundary").removeClass("youlose");
        $('#status').text("Click the 'S' to begin.");
        start = true;
        hit = false;
    });

    $('#end').mouseover(function () {
        if (!hit && start) {
            $('#status').text("You Win! :]");
        } else {
            $('#status').text("Sorry, you lose! :[");
        }
        hit = false;
        start = false;
    });


    $('#maze').mouseleave(function () {
        if (start) {
            $('.boundary').addClass("youlose");
            hit = true;
        }
    });

});


