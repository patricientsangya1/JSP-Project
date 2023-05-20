/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


// get the login button element
let loginButton = document.querySelector(".nav-link[href='LoginSignUpPage.jsp']");

// add a click event listener to the login button
loginButton.addEventListener("click", () => {
  // simulate a login process (replace this with your actual login logic)
  let isLoggedIn = true;

  // if the user is logged in, remove the disabled attribute from the links
  if (isLoggedIn) {
    let navLinks = document.querySelectorAll(".nav-item .nav-link");
    for (let i = 0; i < navLinks.length; i++) {
      navLinks[i].removeAttribute("disabled");
    }
  }
});
