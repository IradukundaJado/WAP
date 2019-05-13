/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function calcTip() {
	//var subtotalElem = 
	//var tipElem = 
	var totalElem = document.getElementById('total');
	var subtotal = document.getElementById('subtotal').value;
	var tip = document.getElementById('tip').value;
	var total = parseInt(subtotal) + ((tip/ 100) * subtotal) ;
        console.log(tip);
        console.log(subtotal);
        console.log(total);
	totalElem.innerHTML = '$' + total;
}

function clickMe(){
    alert('You clicked Me!');
}





