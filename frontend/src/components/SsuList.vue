<template>
<section class="padding_120">

		<font color="white">
			<div v-if="someError" class="container col-lg-8 main_ssu_block">
				hmm... something went wrong :( try logging out and loggin back in
			</div>
		</font>

		<i v-if="waiting" class="fa fa-spinner fa-spin" style="font-size:30px; margin-left:50%;"></i>

		<IndividualSsu v-bind:ssu="defaultPost" v-if="noPostsYet" class="container col-lg-8 main_ssu_block"></IndividualSsu>

		<div v-if="SSUs && SSUs.length>0 && !noPostsYet" class="container col-lg-8 main_ssu_block">

			<!-- ******** this is where individual post starts******** -->
			<IndividualSsu v-for="ssu in SSUs" v-bind:key="ssu.ssuId" v-bind:ssu="ssu">
			</IndividualSsu>

		</div>

	</section>
</template>


<script>
	import { mapGetters } from 'vuex'
	import IndividualSsu from './IndividualSsu'
	import axios from 'axios'

	export default {
		name: 'SsuList',

		props: ['timelineurl'],

		components: {
			IndividualSsu
		},

		computed: {
			...mapGetters({ currentUser: 'currentUser' })
		},

		data(){
			return {
				SSUs: [],
				errors: [],
				someError: false,
				noPostsYet: false,
				waiting: false,
				defaultPost: {
					userid: -1,
					likes: 0,
					title: "its pretty lonley in here",
					description: "This webstie was made by ACM members <3 Looks like there are no posts in your timeline. Click \
					the \"POST\" button on the top to create a new Post and share it with your friends!",
					datePosted: "0000-00-00"
				}
    		}
		},
		// this function gets called when the vue component is created
		created() {
			this.fetchData()
		},

		methods: {
			
			fetchData(){

				this.waiting = true

				let urlToCall = this.timelineurl

				this.$http.get(urlToCall)
					.then(response => {
						// JSON responses are automatically parsed.
						this.SSUs = response.data
						if(this.SSUs.length == 0){
							this.noPostsYet = true
							this.someError = false
						}
						this.waiting = false
					})
					.catch(e => {
						// Catch any errors
						this.errors.push(e)
						this.someError = true
						this.waiting = false
					})

			}
		}
	}
</script>



<style>

</style>