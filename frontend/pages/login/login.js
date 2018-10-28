/**
* @author Kevin Crespin
* @param username, password
* @return check for invalid inputs in username, and password. Return false if a login error occurs.
*         Login if not errors found.
**/

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