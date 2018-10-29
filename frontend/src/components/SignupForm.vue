<template>
<div>
    <div class="signup-page-logo">
        <img src="../assets/img/logo.png" alt="Logo">
        <a id="logoname"> EAGLE </a>
        <p id="csula">CAL STATE LA</p>
    </div>

    <form v-on:submit.prevent="signup">
    <div class="signup_container">
        <h1 class = "signup-title">Sign Up</h1>
        <p>Create your account and get connected at Cal State LA.</p>
        

        <div class="signup_first-last_name">
            <input class="signup-input-tags"  v-model="firstname" id="firstname" type="text" placeholder="First name" name="signup-First_name" v-on:blur="checkFirstName()" required>
            <input class="signup-input-tags"  v-model="lastname" id="lastname" type="text" placeholder="Last name" name="signup-Last_name" v-on:blur="checkLastName()" required>
            <span id="name_error"></span><br><br>
        </div>

        <div class="signup-date">
            <p>Birthday</p><br>
            <select id="month" name="birthday_year" title="month">
                <option value="0">Month</option><option value="Jan">January</option><option value="Feb">February</option><option value="Mar">March</option><option value="Apr">April</option><option value="May">May</option><option value="Jun">June</option><option value="Jul">July</option><option value="Aug">August</option><option value="Sept">September</option><option value="Oct">October</option><option value="Nov">November</option><option value="Dec">December</option>
            </select>
            <select id="day" name="birthday_day" title="Day">
                <option value="0">Day</option> <option value="1">1</option> <option value="2">2</option> <option value="3">3</option> <option value="4">4</option> <option value="5">5</option> <option value="6">6</option> <option value="7">7</option> <option value="8">8</option> <option value="9">9</option> <option value="10">10</option> <option value="11">11</option> <option value="12">12</option> <option value="13">13</option> <option value="14">14</option> <option value="15">15</option> <option value="16">16</option> <option value="17">17</option> <option value="18">18</option> <option value="19">19</option> <option value="20">20</option> <option value="21">21</option> <option value="22">22</option> <option value="23">23</option> <option value="24">24</option> <option value="25">25</option> <option value="26">26</option> <option value="27">27</option> <option value="28">28</option> <option value="29">29</option> <option value="30">30</option> <option value="31">31</option>
            </select>
            <select id="year" name="birthday_year" title="Year">
                <option value="0">Year</option> <option value="2018">2018</option> <option value="2017">2017</option> <option value="2016">2016</option> <option value="2015">2015</option> <option value="2014">2014</option> <option value="2013">2013</option> <option value="2012">2012</option> <option value="2011">2011</option> <option value="2010">2010</option> <option value="2009">2009</option> <option value="2008">2008</option> <option value="2007">2007</option> <option value="2006">2006</option> <option value="2005">2005</option> <option value="2004">2004</option> <option value="2003">2003</option> <option value="2002">2002</option> <option value="2001">2001</option> <option value="2000">2000</option> <option value="1999">1999</option> <option value="1998">1998</option> <option value="1997">1997</option> <option value="1996">1996</option> <option value="1995">1995</option> <option value="1994">1994</option> <option value="1993">1993</option> <option value="1992">1992</option> <option value="1991">1991</option> <option value="1990">1990</option> <option value="1989">1989</option> <option value="1988">1988</option> <option value="1987">1987</option> <option value="1986">1986</option> <option value="1985">1985</option> <option value="1984">1984</option> <option value="1983">1983</option> <option value="1982">1982</option> <option value="1981">1981</option> <option value="1980">1980</option> <option value="1979">1979</option> <option value="1978">1978</option> <option value="1977">1977</option> <option value="1976">1976</option> <option value="1975">1975</option> <option value="1974">1974</option> <option value="1973">1973</option> <option value="1972">1972</option> <option value="1971">1971</option> <option value="1970">1970</option> <option value="1969">1969</option> <option value="1968">1968</option> <option value="1967">1967</option> <option value="1966">1966</option> <option value="1965">1965</option> <option value="1964">1964</option> <option value="1963">1963</option> <option value="1962">1962</option> <option value="1961">1961</option> <option value="1960">1960</option> <option value="1959">1959</option> <option value="1958">1958</option> <option value="1957">1957</option> <option value="1956">1956</option> <option value="1955">1955</option> <option value="1954">1954</option> <option value="1953">1953</option> <option value="1952">1952</option> <option value="1951">1951</option> <option value="1950">1950</option> <option value="1949">1949</option> <option value="1948">1948</option> <option value="1947">1947</option> <option value="1946">1946</option> <option value="1945">1945</option> <option value="1944">1944</option> <option value="1943">1943</option> <option value="1942">1942</option> <option value="1941">1941</option> <option value="1940">1940</option> <option value="1939">1939</option> <option value="1938">1938</option> <option value="1937">1937</option> <option value="1936">1936</option> <option value="1935">1935</option> <option value="1934">1934</option> <option value="1933">1933</option> <option value="1932">1932</option> <option value="1931">1931</option> <option value="1930">1930</option> <option value="1929">1929</option> <option value="1928">1928</option> <option value="1927">1927</option> <option value="1926">1926</option> <option value="1925">1925</option> <option value="1924">1924</option> <option value="1923">1923</option> <option value="1922">1922</option> <option value="1921">1921</option> <option value="1920">1920</option> <option value="1919">1919</option> <option value="1918">1918</option> <option value="1917">1917</option> <option value="1916">1916</option> <option value="1915">1915</option> <option value="1914">1914</option> <option value="1913">1913</option> <option value="1912">1912</option> <option value="1911">1911</option> <option value="1910">1910</option> <option value="1909">1909</option> <option value="1908">1908</option> <option value="1907">1907</option> <option value="1906">1906</option> <option value="1905">1905</option>
            </select>
        </div>

        <div class=signup-username><br>
            <input class="signup-input-tags"  v-model="username" id="username" maxlength="20" type="text" placeholder="Username" name="signup-Username" v-on:blur="checkUserName()" required/><br>
            <span id="username_error"> </span><br>
            <input class="signup-input-tags"  v-model="password" id="password" type="password" placeholder="Password" name="signup-Password" v-on:blur="checkPassword()" required/><br>
            <span id="passwordError"> </span><br>
            <input class="signup-input-tags"  v-model="retypePassword" id="retypePassword" type="password" placeholder="Retype Password" name="signup-RetypePassword" v-on:blur="checkPassword()" required/>
            <span id="retypePasswordError"></span><br>
        </div>

        <div class="signup-cin-code"><br>
            <input class="signup-input-tags"  v-model="cin" id="cin" maxlength="9" type="text" placeholder="CIN" name="signup-cin" v-on:blur="checkCIN()"/>
            <span id="error-display"></span>
            <input class="signup-input-tags"  v-model="secretcode" id="textcode" maxlength="25" type="password" placeholder="Secret Code" name="sign-code" v-on:blur="checkSecretCode()" required/><br>
            <span id="error-display"></span><br>
        </div>

        <div class=signup-email><br>
            <input class="signup-input-tags"  v-model="email" id="email" type="email" placeholder="School Email" name="signup-Email" required>
            <input class="signup-input-tags"  v-model="phonenumber" id="phonenumber" maxlength="12" type="tel" placeholder="Phone Number" name="signup-phone" v-on:blur="checkPhoneNumber()" required/>
            <span id="phonenumbererror"></span>
        </div>
        <p id="agreement"> By clicking Sign Up, you agree to our Terms, Data Policy and Cookies Policy. </p>

        <font color="red">
            <div v-if="error">{{ error }}</div>
        </font>

        <div class="signup-button">
            <button href="#" type="submit" id="signup-submit" v-on:click="signup()"> SIGN UP</button>
        </div>
        <a id="signinredirect" href="#" v-on:click="loginpage()"> Have an account? Log In</a>
    </div>
    </form>
</div>

</template>

<script>
import { mapGetters } from 'vuex'

export default {
    name: 'SignupForm',

    computed: {
        ...mapGetters({ currentUser: 'currentUser' })
    },

    data () {
        return {
        firstname: '',
        lastname: '',
        username: '',
        password: '',
        retypePassword: '',
        cin: '',
        phonenumber: '',
        email: '',
        birthday: '',
        secretcode: '',
        error: false
        }
    },
        
    methods: {
        loginpage() {
            this.$router.push('/login')
        },

        signup() {
            if(this.firstname !== '' && this.lastname !== '' && this.username !== '' && this.password !== ''
            && this.password === this.retypePassword && this.phonenumber !== '' && document.getElementById("email").checkValidity() & this.secretcode != ''){
                this.$http.post('/who/humansignup',{
                    firstName: this.firstname,
                    lastName: this.lastname,
                    userName : this.username,
                    password : this.password,
                    CIN : this.cin,
                    phoneNumber : this.phonenumber,
                    emailAddress : this.email,
                    birthDay: "1996-01-01",
                    secretCode : this.secretcode
                })
                .then(response => {
                    if(response.data.message === "User registered successfully"){
                        delete localStorage.token
                        this.$router.push('/login')
                        alert("Successfully registered! You can now login with your username/email.")
                    }
                    else{
                        this.signupFailed( response)
                    }
                })
                .catch(err => {})
            }
            else{

            }
        },

        signupFailed(response) {
            if(response.data.message == "Email Address already in use!") {
                this.error = 'Signup failed. Email Address already in use!'
            }
            if(response.data.message == "Username is already taken!") {
                this.error = 'Signup failed. Username is already taken!'
            }
        },

        checkUserName() {
            var username = document.getElementById("username").value;
            
            if (username.length < 10) {
                document.getElementById("username_error").innerHTML = "Username must have at least 10 characters.";
            }
            else {
                document.getElementById("username_error").innerHTML = "";
            }
        },

        checkPassword() {
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
        },

        checkCIN() {
            var CIN = document.getElementById("cin").value;
            var onlyNumbers = /^[0-9]+$/;
            //If CIN is not entered, set it to 0000000000
            if (CIN.length == 0) {
                CIN = "000000000";
                }
            else if (!(CIN.length == 9) || !(onlyNumbers.test(CIN))) {
                document.getElementById("error-display").innerHTML = "Your CIN must be 9 digits";
            }
            else {
                document.getElementById("error-display").innerHTML = "";
            }
        },

        checkSecretCode() {
            var secretCode = document.getElementById("textcode").value;
            var onlyLetters = /^[a-zA-Z]+$/;
            var words = secretCode.split(' ');
            for (var i = 0; i < words.length; i++) {
                // If a word does not have only letters or is not in lowercase, then not valid
                if (!(onlyLetters.test(words[i].trim()))
                || !(words[i] === words[i].toLowerCase())) {
                    document.getElementById("error-display").innerHTML = "Secret code must have no symbols or be in lowercase.";
                }
                else {
                    document.getElementById("error-display").innerHTML = "";
                }
            }
        },

        checkLastName() {
            var lastname = document.getElementById("lastname").value;
            var hasNumber = /\d/;
            var onlyLetters = /^[a-zA-Z]+$/;
            if(onlyLetters.test(lastname)) {
                document.getElementById("name_error").innerHTML = "";
            }
            else if (hasNumber.test(lastname)){
                document.getElementById("name_error").innerHTML = "Your name should not be consisting numbers.";
            }
        },

        checkFirstName() {
            var firstname = document.getElementById("firstname").value;
            var hasNumber = /\d/;
            var onlyLetters = /^[a-zA-Z]+$/;
            if(onlyLetters.test(firstname)) {
                document.getElementById("name_error").innerHTML = "";
            }
            else if (hasNumber.test(firstname)){
                document.getElementById("name_error").innerHTML = "Your name should not be consisting numbers.";
            }
        },

        checkPhoneNumber() {
            var phonenumber = document.getElementById("phonenumber").value;
            var phonenumberFormat = /\d{3}-\d{3}-\d{4}/;
            if (phonenumberFormat.test(phonenumber)) {
                document.getElementById("phonenumbererror").innerHTML = "";
            }
            else {
                document.getElementById("phonenumbererror").innerHTML = "Phone number must be in (XXX) XXX-XXXX format.";
            }
        }
    }
}
</script>

<style>

</style>
