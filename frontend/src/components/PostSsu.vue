<template>

    <div id="box">

		<div id="createAPost">
			<h1>CREATE A POST</h1>
		</div>

		<form>
			<span v-if="processing">
				<i class="fa fa-spinner fa-spin" style="font-size:30px; margin-left:50%;"></i>
			</span>

			<div id="titleEntry">
				Title <span id="titleError"></span><br>
				<input v-model="title" id="title" type="text" name="title" maxlength="50" required><br><br>
			</div>

			<div id="descriptionEntry">				
				Description <span id="descriptionError"></span><br>
				<textarea v-model="description" id="description" rows="20" name="description" maxlength="1000" required></textarea>
			</div>

			<div id="noInputError"></div>
			<button type="button" id="post" v-on:click="createNewPost()">Post It!</button>

		</form>
	</div>

</template>


<script>
	import { mapGetters } from 'vuex'
	
	export default {
		name: 'PostSsu',
		
		data () {
			return {
				title: '',
				description: '',
				processing: false
			}
		},

		computed: {
			...mapGetters({ currentUser: 'currentUser' })
		},

		methods: {

			createNewPost(){
				this.processing = true;

				var cur_date_vue = new Date();
				var month = ('0' + (cur_date_vue.getMonth() + 1)).slice(-2);
				var date = ('0' + cur_date_vue.getDate()).slice(-2);
				var year = cur_date_vue.getFullYear();
				var date_formated_vue = year + '-' + month + '-' + date;
				
				this.$http.post('/SSU/SSU', { userid: this.currentUser.userid, title: this.title, description: this.description, dateposted: date_formated_vue})
					.then(Response => this.postSuccessful(Response))
					.catch(e => this.postFailed(e))
			},

			postSuccessful(request) {
				if (!request.data.newSsuId){
					this.postFailed()
					return
				}
				
				this.$emit("posted")
				this.processing = false
			},

			postFailed(e){
				this.processing = true
			}
			
		}
	}
</script>


<style>
</style>