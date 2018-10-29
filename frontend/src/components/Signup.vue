<template>

<div>
    <SignupForm></SignupForm>
</div>

</template>

<script>
import SignupForm from './SignupForm'

export default {
    name: 'Signup',

    data () {
		return {
				
		}
	},

    components :{
        SignupForm
    },

    methods: {

    }
}
</script>

<style>
@import '../assets/css/signup.css';
</style>
