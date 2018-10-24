// login page javascript goes here

// You must have a function here that gets called where user hits Login button OR presses enter.
// The function should take in the username and password as parameters 
// Leave the function empty since we dont have the backend ready yet to receive the login requests.
// it should look like :

//element.addEventListener("click", clickLogin(){ alert("Loging in..."); });

// http://www.learningaboutelectronics.com/Articles/How-to-retrieve-data-from-a-text-box-in-javascript.php 
//var username = document.getElementById("username").value

	
function enterUnicodeKey(event) {
	var enterKey = event.keycode;
	if (event.which || event.keyCode);	{//using the enter unicode key, which is for ff users
		alert("login button pressed");
		clickLogin();
	}
}


	
function clickLogin() {
	alert ("Loging in...");	 // just checking if this function works
/*
	var userN = document.getElementById("username-input").value;
	var passW = document.getElementById("password").value;
    
	if (userN == ""){
		alert("no username entered");
		return;
	}
	else{
		return;
	}*/
}

function login(username, password) {

}

