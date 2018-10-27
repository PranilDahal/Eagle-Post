<<<<<<< HEAD

function login(username, password) {

    if (username == "" || password == ""){
        alert("Not field should be left in blank");
        return false;
    }
    else if (username.match(/^([a-zA-Z0-9_\-\.]+)@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.)|(([a-zA-Z0-9\-]+\.)+))([a-zA-Z]{1,5}|[0-9]{1,3})(\]?)$/)) {
        alert("Cannot login using email");
        return false;
    }

}
=======
// login page javascript goes here

// You must have a function here that gets called where user hits Login button OR presses enter.
// The function should take in the username and password as parameters 
// Leave the function empty since we dont have the backend ready yet to receive the login requests.
// it should look like : 

// function login(username, password){
//      leave this empty
//}
>>>>>>> V1.0_Master
