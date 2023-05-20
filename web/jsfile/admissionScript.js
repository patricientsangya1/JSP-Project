/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//function validatePhoneNumber() {
//    // Get the selected country code and phone number value
//    var countryCode = document.getElementById("country-code").value;
//    var phoneNumber = document.getElementsByName("phone")[0].value;
//    
//    // Create a PhoneNumber object using the libphonenumber library
//    var phoneNumberUtil = i18n.phonenumbers.PhoneNumberUtil.getInstance();
//    var phoneNumberObj = phoneNumberUtil.parse(phoneNumber, countryCode);
//    
//    // Check if the number is valid
//    var isValidNumber = phoneNumberUtil.isValidNumber(phoneNumberObj);
//    
//    if (isValidNumber) {
//        // The number is valid
//        console.log("Valid phone number");
//    } else {
//        // The number is not valid
//        console.log("Invalid phone number");
//    }
//}

function validateInput(inputField) {
  // Get the input value and remove any non-numeric characters
  let inputValue = inputField.value.replace(/\D/g, '');

  // Limit the input to 9 digits
  if (inputValue.length > 9) {
    inputValue = inputValue.slice(0, 9);
  }

  // Update the input field value
  inputField.value = inputValue;

  // Check if the input value is valid
  if (inputValue.length < 9) {
    document.getElementById('errorSpan').innerHTML = 'Input must be 9 digits';
  } else {
    document.getElementById('errorSpan').innerHTML = '';
  }
}
