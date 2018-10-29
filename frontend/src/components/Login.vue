<template>
		<LoginForm></LoginForm>
</template>

<script>
	import { mapGetters } from 'vuex'
	import LoginForm from './LoginForm'

	export default {
		name: 'Login',

		data () {
			return {
				
			}
		},

		components :{
			LoginForm
		},
		
		computed: {
			...mapGetters({ currentUser: 'currentUser' })
		},

		created () {
			this.checkCurrentLogin()
		},

		updated () {
			this.checkCurrentLogin()
		},

		methods: {

			checkCurrentLogin () {
				if (this.currentUser) {
					this.$router.replace('/home')
				}
			}

		}

	}
</script>


<style>
@import '../assets/css/login.css';
</style>
