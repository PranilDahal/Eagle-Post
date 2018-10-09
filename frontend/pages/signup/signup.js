//Singup page javascript goes here
function checkUserName(username) {
	if (username.length() == 10) {
		return true;
	}
	else {
		return false;
	}
}

function checkPassword() {
	
}

function checkCIN(CIN) {
	if (CIN.length == 10) {
		return CIN;
	}
	else if (CIN.length == 0) {
		CIN = 0000000000
		return CIN;
	}
}

function checkFirstName() {
	
}

function checkLastName() {
	
}

function checkPhoneNumber() {
	
}

function checkBirthday() {

}
