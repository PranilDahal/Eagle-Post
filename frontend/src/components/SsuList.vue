<template>
<section class="padding_120">

		<div v-if="SSUs && SSUs.length" class="container col-lg-8">

			<!-- ******** this is where individual post starts******** -->
			<IndividualSsu v-for="ssu in SSUs" v-bind:key="ssu.ssuId" v-bind:ssu="ssu">
			</IndividualSsu>

		</div>

	</section>
</template>


<script>
	import IndividualSsu from './IndividualSsu'
	import axios from 'axios'

	export default {
		name: 'SsuList',

		components: {
			IndividualSsu
		},
		data(){
			return {
				SSUs: [],
				errors: []
    		}
		},
		created() {
			axios.get(`http://localhost:8080/SSU/all`)
			.then(response => {
				// JSON responses are automatically parsed.
				this.SSUs = response.data
			})
			.catch(e => {
				// Catch any errors
				this.errors.push(e)
			})
		}
	}
</script>



<style>

</style>