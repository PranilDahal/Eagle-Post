//username must be at least 10 characters long
function checkUserName(username) {
	if (username.length() == 10) {
		return true;
	}
	else {
		return false;
	}
}
//Password must be typed twice and must match
function checkPassword(password, retypePassword) {
	var hasNumber = /\d/;
	var hasSpecialCharacter = /\W/;
	//Password must contain at least one number and one special character
	if (password === retypePassword && hasNumber.test(password) 
		   && hasSpecialCharacter.test(password)) {
		return true;
		}
	return false;	
}
//CIN must be 10 digits long
function checkCIN(CIN) {
	if (CIN.length == 10) {
		return CIN;
	}
	//If CIN is not entered, set it to 0000000000
	else if (CIN.length == 0) {
	CIN = "0000000000";
	return CIN;
	}
	else {
		return "Not valid";
	}
}
//first name must have no numbers
function checkFirstName(firstname) {
	var onlyLetters = /^[a-zA-Z]+$/;
	return onlyLetters.test(firstname);
}
//last name must have no numbers
function checkLastName(lastname) {
	var onlyLetters = /^[a-zA-Z]+$/;
	return onlyLetters.test(lastname);
}
//phone number must be in 888-888-8888 format
function checkPhoneNumber(phonenumber) {
	var phonenumberFormat = /\d{3}-\d{3}-\d{4}/;
	return phonenumberFormat.test(phonenumber);
}
//birthday must be yyyy-mm-dd format
function checkBirthday(birthday) {
	var birthdayFormat = /\d{4}-\d{2}-\d{2}$/;
	return birthdayFormat.test(birthday);
}

function signUp() {
	
}
