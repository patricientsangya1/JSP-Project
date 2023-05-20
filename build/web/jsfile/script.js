/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

const user = document.getElementById("username");
const passw = document.getElementById("password");





var card = document.getElementById("card");
function openRegister(){
    card.style.transform ="rotateY(-180deg)";
}
function openLogin(){
    card.style.transform ="rotateY(0deg)";
}

//let passwordInput = document.getElementById("ps");
//let confirmPasswordInput = document.getElementById("cps");
//
//confirmPasswordInput.addEventListener('input', () => {
//    let password = passwordInput.value;
//    let confirmPassword = confirmPasswordInput.value;
//
//    if (password !== confirmPassword) {
//        confirmPasswordInput.classList.add('error');
//         
//    } else {
//        confirmPasswordInput.classList.remove('error');
//    }
//});

let passwordInput = document.getElementById("ps");
let confirmPasswordInput = document.getElementById("cps");
let form = document.getElementById("registerForm");

confirmPasswordInput.addEventListener('input', () => {
    let password = passwordInput.value;
    let confirmPassword = confirmPasswordInput.value;

    if (password !== confirmPassword) {
        confirmPasswordInput.classList.add('error');
    } else {
        confirmPasswordInput.classList.remove('error');
        
        
    }
});

form.addEventListener('submit', (event) => {
    let password = passwordInput.value;
    let confirmPassword = confirmPasswordInput.value;

    if (password !== confirmPassword) {
        event.preventDefault();
        document.getElementById('errorSpan').innerHTML = 'Input must be 9 digits';
       
    }
});

