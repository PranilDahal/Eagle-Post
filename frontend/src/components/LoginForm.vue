<template>
	<div class="login-box">
        <span class="logo"></span>
        <form class="login-form validate-input" @submit.prevent="login">

		<!-- [Text] -->

			<span class="eagle-text">
				EAGLE
			</span>
			<span class="username-text">
				Username
			</span>
			<span class="password-text">
				Password
			</span>

		<!-- [Text Input Boxes] -->
		
			<input v-model="email" class="username-input" type="text" id="username" spellcheck="false" required>
			<input v-model="password" class="password-input" type="password" id="password" required>

		<!-- [Buttons] -->

			<button class="login-button-btn" value="login">
				LOGIN
			</button>
			<!--Sign Up link should be placed here-->

			<button class="signup-button-btn" value="singup" v-on:click="goSignup()">
				SIGN UP
			</button>

		<!-- [Buttons Divider] -->

			<span class="left-box-line">
			</span>
			<span class="right-box-line">
			</span>
			<span class="or-text">
				OR
			</span>

		<!-- [Recovery URL] -->
			<!--Recovery of username/password link should be placed here-->
			<a class="recovery" href="#">
				forgot account?
			</a>

			<font color="red">
				<div v-if="error">{{ error }}</div>
			</font>
        </form>
    </div>
</template>

<script>
	export default {
		name: 'Login',

		data () {
			return {
			email: '',
			password: '',
			error: false
			}
		},

		methods: {

			goSignup(){
				this.$router.replace(this.$route.query.redirect || '/signup')
			},

			login () {
				this.$http.post('/who/humansignin', { usernameOrEmail: this.email, password: this.password })
						.then(request => {
							this.loginSuccessful(request)
							this.$router.replace(this.$route.query.redirect || '/home')
						})
						.catch(() => this.loginFailed())
			},

			loginSuccessful (req) {
				if (!req.data.accessToken) {
					this.loginFailed()
					return
				}
				this.error = false
				localStorage.token = req.data.accessToken
				this.$store.dispatch('login')
			},
			
			loginFailed () {
				this.error = 'Login failed. Your username and password is incorrect.'
				this.$store.dispatch('logout')
				delete localStorage.token
			}

		}

	}
</script>


<style>

</style>
