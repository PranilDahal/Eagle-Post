//Authors: David Tang & Deric Kwok

//username must be at least 10 characters long
function checkUserName() {
	var username = document.getElementById("username").value;
	
	if (username.length < 10) {
		document.getElementById("username_error").innerHTML = "Username must have at least 10 characters.";
	}
	else {
		document.getElementById("username_error").innerHTML = "";
	}
}

//Password must be typed twice and must match
function checkPassword() {
	var password = document.getElementById("password").value;
	var retypePassword = document.getElementById("retypePassword").value;
	var hasNumber = /\d/;
	var hasSpecialCharacter = /\W/;
	//Password must contain at least one number and one special character
	if ((password === retypePassword) && (hasNumber.test(password)) && (hasSpecialCharacter.test(password))) {
		document.getElementById("passwordError").innerHTML = "";
		document.getElementById("retypePasswordError").innerHTML = "";
	}
	else {
		document.getElementById("passwordError").innerHTML = "Password must match, have a number and a special character.";
		document.getElementById("retypePasswordError").innerHTML = "Retyped password must match, have a number and a special character.";
	}
}
//CIN must be 10 digits long
function checkCIN() {
	var CIN = document.getElementById("cin").value;
	var onlyNumbers = /^[0-9]+$/;
	//If CIN is not entered, set it to 0000000000
	if (CIN.length == 0) {
		CIN = "000000000";
		}
	else if (!(CIN.length == 9) || !(onlyNumbers.test(CIN))) {
		document.getElementById("Error").innerHTML = "Your CIN must be 9 digits";
	}
	else {
		document.getElementById("Error").innerHTML = "";
	}
}

function checkSecretCode() {
	var secretCode = document.getElementById("textcode").value;
	var onlyLetters = /^[a-zA-Z]+$/;
	var words = secretCode.split(' ');
	for (var i = 0; i < words.length; i++) {
		// If a word does not have only letters or is not in lowercase, then not valid
		if (!(onlyLetters.test(words[i].trim()))
		   || !(words[i] === words[i].toLowerCase())) {
			document.getElementById("Error").innerHTML = "Secret code must have no symbols or be in lowercase.";
		}
		else {
			document.getElementById("Error").innerHTML = "";
		}
	}
}

//first name must have no numbers
function checkFirstName() {
	var firstname = document.getElementById("firstname").value;
	var hasNumber = /\d/;
	var onlyLetters = /^[a-zA-Z]+$/;
	if(onlyLetters.test(firstname)) {
		document.getElementById("name_error").innerHTML = "";
	}
	else if (hasNumber.test(firstname)){
		document.getElementById("name_error").innerHTML = "Your name should not be consisting numbers.";
	}
}
//last name must have no numbers
function checkLastName() {
	var lastname = document.getElementById("lastname").value;
	var hasNumber = /\d/;
	var onlyLetters = /^[a-zA-Z]+$/;
	if(onlyLetters.test(lastname)) {
		document.getElementById("name_error").innerHTML = "";
	}
	else if (hasNumber.test(lastname)){
		document.getElementById("name_error").innerHTML = "Your name should not be consisting numbers.";
	}
}
//phone number must be in 888-888-8888 format
function checkPhoneNumber() {
	var phonenumber = document.getElementById("phonenumber").value;
	var phonenumberFormat = /\d{3}-\d{3}-\d{4}/;
	if (phonenumberFormat.test(phonenumber)) {
		document.getElementById("phoneNumberError").innerHTML = "";
	}
	else {
		document.getElementById("phoneNumberError").innerHTML = "Phone number must be in (XXX) XXX-XXXX format.";
	}
}

function signUp() {
	
}