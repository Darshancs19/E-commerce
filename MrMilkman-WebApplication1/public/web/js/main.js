function setFormMessage(formElement, type, message) {
  const messageElement = formElement.querySelector(".fmessage");

  messageElement.textContent = message;
  messageElement.classList.remove("fmessage-success", "fmessage-error");
  messageElement.classList.add(`fmessage-${type}`);
}

function setInputError(inputElement, message) {
  inputElement.classList.add("finput-error");
  inputElement.parentElement.querySelector(
    ".finput-error-message"
  ).textContent = message;
}

function clearInputError(inputElement) {
  inputElement.classList.remove("finput-error");
  inputElement.parentElement.querySelector(
    ".finput-error-message"
  ).textContent = "";
}

document.addEventListener("DOMContentLoaded", () => {
  const loginForm = document.querySelector("#login");
  const createAccountForm = document.querySelector("#createAccount");

//  loginForm.addEventListener("submit", (e) => {
//    e.preventDefault();
//    setFormMessage(loginForm, "error", "Invalid username/password combination");
//  });

  inputElement.addEventListener("input", (a) => {
    clearInputError(inputElement);
  });
});

var myInput = document.getElementById("psw");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");

// When the user clicks on the password field, show the message box
myInput.onfocus = function () {
  document.getElementById("message_pass").style.display = "block";
};

// When the user clicks outside of the password field, hide the message box
myInput.onblur = function () {
  document.getElementById("message_pass").style.display = "none";
};

// When the user starts to type something inside the password field
myInput.onkeyup = function () {
  // Validate lowercase letters
  var lowerCaseLetters = /[a-z]/g;
  if (myInput.value.match(lowerCaseLetters)) {
    letter.classList.remove("invalid");
    letter.classList.add("valid");
  } else {
    letter.classList.remove("valid");
    letter.classList.add("invalid");
  }

  // Validate capital letters
  var upperCaseLetters = /[A-Z]/g;
  if (myInput.value.match(upperCaseLetters)) {
    capital.classList.remove("invalid");
    capital.classList.add("valid");
  } else {
    capital.classList.remove("valid");
    capital.classList.add("invalid");
  }

  // Validate numbers
  var numbers = /[0-9]/g;
  if (myInput.value.match(numbers)) {
    number.classList.remove("invalid");
    number.classList.add("valid");
  } else {
    number.classList.remove("valid");
    number.classList.add("invalid");
  }
  // Validate length of password
  if (myInput.value.length >= 8) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }
};

var myInput1 = document.getElementById("signupUsername");
var length = document.getElementById("length");

// When the user clicks on the password field, show the message box
myInput1.onfocus = function () {
  document.getElementById("message").style.display = "block";
};

// When the user clicks outside of the password field, hide the message box
myInput1.onblur = function () {
  document.getElementById("message").style.display = "none";
};

// When the user starts to type something inside the password field
myInput1.onkeyup = function () {
  // Validate length
  if (myInput1.value.length >= 8) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }
};

function Validate() {
  var password = document.getElementById("psw").value;
  var confirmPassword = document.getElementById("confirm-password").value;
  if (password != confirmPassword) {
    alert("Passwords do not match.");
    return false;
  }
  return true;
}

var myInput = document.getElementById("psw");
var letter = document.getElementById("letter");
var capital = document.getElementById("capital");
var number = document.getElementById("number");
var length = document.getElementById("length");

// When the user clicks on the password field, show the message box
myInput.onfocus = function () {
  document.getElementById("message_pass").style.display = "block";
};

// When the user clicks outside of the password field, hide the message box
myInput.onblur = function () {
  document.getElementById("message_pass").style.display = "none";
};

// When the user starts to type something inside the password field
myInput.onkeyup = function () {
  // Validate lowercase letters
  var lowerCaseLetters = /[a-z]/g;
  if (myInput.value.match(lowerCaseLetters)) {
    letter.classList.remove("invalid");
    letter.classList.add("valid");
  } else {
    letter.classList.remove("valid");
    letter.classList.add("invalid");
  }

  // Validate capital letters
  var upperCaseLetters = /[A-Z]/g;
  if (myInput.value.match(upperCaseLetters)) {
    capital.classList.remove("invalid");
    capital.classList.add("valid");
  } else {
    capital.classList.remove("valid");
    capital.classList.add("invalid");
  }

  // Validate numbers
  var numbers = /[0-9]/g;
  if (myInput.value.match(numbers)) {
    number.classList.remove("invalid");
    number.classList.add("valid");
  } else {
    number.classList.remove("valid");
    number.classList.add("invalid");
  }
  // Validate length of password
  if (myInput.value.length >= 8) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }
};

var myInput1 = document.getElementById("signupUsername");
var length1 = document.getElementById("length");

// When the user clicks on the password field, show the message box
myInput1.onfocus = function () {
  document.getElementById("message_user").style.display = "block";
};

// When the user clicks outside of the password field, hide the message box
myInput1.onblur = function () {
  document.getElementById("message_user").style.display = "none";
};

// When the user starts to type something inside the password field
myInput1.onkeyup = function () {
  // Validate length
  if (myInput1.value.length >= 10) {
    length1.classList.remove("invalid");
    length1.classList.add("valid");
  } else {
    length1.classList.remove("valid");
    length1.classList.add("invalid");
  }
};

function Validate() {
  var password = document.getElementById("psw").value;
  var confirmPassword = document.getElementById("confirm-password").value;
  if (password !== confirmPassword) {
    alert("Passwords do not match.");
    return false;
  }
  return true;
}

let user = JSON.parse(sessionStorage.user || null);
let loader = document.querySelector(".loader");

// checknig user is logged in or not
window.onload = () => {
  if (user) {
    if (!compareToken(user.authToken, user.email)) {
      location.replace("/login");
    }
  } else {
    location.replace("/login");
  }
};

const processData = (data) => {
    loader.style.display = null;
    if(data.alert){
        showAlert(data.alert);
    }
};