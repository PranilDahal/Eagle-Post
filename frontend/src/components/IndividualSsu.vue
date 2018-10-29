<template>
		<div class="post_style_A">

			<div class="post_text_inside">
				
				<a href="#" class="username golden_link">
					<img src="../assets/img/default-img.png" alt="Love" style="width:30px;height:30px;"> 
					{{postedBy.username}}
				</a>

				<a href="#">
					<img v-if="allowedToChange" src="../assets/img/edit-ssu.png" alt="Love" style="width:27px;height:27px;float:right;" class="edit_ssu_icon">
				</a>

				<div>
					<a href="#" class="first-last-name">
						{{postedBy.firstname}} {{postedBy.lastname}}
					</a>
				</div>
				<p class="post_heading golden_link" v-on:click.prevent="expandAndShrink">{{title}}</p>
				
				<!-- TODO Issue #5 - This should only show a portion of the description instead of the entire description -->

				<!-- TODO Issue #5 - ADd tiny buttons on the top right corner of each ssu. One for edit and one for delete.
				https://fontawesome.com/v4.7.0/icons/ Look at that link -->

				<p class="post_description" v-on:click.prevent="expandAndShrink">{{description}}</p>

				<div class="date">
					<a href="#" class="likes">
						<img src="../assets/img/white-eagle.png" alt="Love" style="width:30px;height:30px;"> 
						{{ssu.likes}}
					</a>

					<a href="#" class="calendar_display">
						<i class="fa fa-calendar fa-lg"></i> {{ssu.datePosted}}
					</a>

					<a href="#"><i v-if="allowedToChange" class="fa fa-trash trash-button fa-lg golden_link" v-on:click="deleteSsu" ></i></a>
					<!-- TODO Issue #29 - Update this template to include the number of likes. 
					Talk to Deric about where it should be. (whether bottom-left, or bottom-right) -->

				</div>

			</div>

		</div>
</template>


<script>
	import { mapGetters } from 'vuex'
	import axios from 'axios'

	export default {
		name: 'IndividualSsu',

		props: ['ssu'],

		computed: {
			...mapGetters({ currentUser: 'currentUser' })
		},

		data: function(){
			return{
				title: this.ssu.title,
				// TODO Issue #5 - By default, this should show only the first 150 chars
				// Use the following logic to show only the first 150 chars
				//  SOMETHING = SOMETHING.split("").slice(0,150).join("") + "..."  <--- Understand how this works

				description: this.ssu.description.length > 200 ? this.ssu.description.split("").slice(0,150).join("") + "..." : this.ssu.description,
				expand : false,
				allowedToChange: false,
				postedBy: {
					firstname: "anonymous",
					lastname: "ghost",
					userid : "-1",
					username: "peepee"
				}
			}
		},

		created (){
			this.allowedToChange = this.ssu.userid == this.currentUser.userid
			this.$http.get(`/userdata/publique/`+this.ssu.userid)
					.then(response => {
						if(response.data.firstname){
							this.postedBy = response.data
						}
						else{

						}
					})
					.catch(e => {
					})
		},

		methods : {
			expandAndShrink: function(){
				// TODO Issue #5 - Use this method to dynamically uupdate the this.expand boolean AND the this.description
				// IF expand is false : this.description = ssu.description AND this.expand = true (set to exapand)
				// If expand is true : this.descripion = this.ssu.description.split("")[50] AND this.expand = false (set to shrink)

				// TODO Issue #5 - While transitioning from expand -> shrink and shrink -> expand, make the transition smooth. Have the expansion slowed down
				// so that it looks cool. Kind of like this: https://codepen.io/peternguyen/pen/hICga/
				// Make changes inside ssu.css for appropriate class, either post_description or post_style_A or whatever works.
				if(this.ssu.description.length > 200){
				
					if(this.expand == true){
						this.description = this.ssu.description.split("").slice(0,150).join("") + "..."
						this.expand = false
						
					}
					else{
						this.description = this.ssu.description
						this.expand = true
						
					}
				}
				
				return
			},

			deleteSsu: function(){

				if (confirm("Are you sure you want to delete this post?")) {

					this.$http.delete(`/SSU/`+this.ssu.ssuid)
					.then(response => {
						window.location.reload()
					})
					.catch(e => {
					})

				} else {
					// do nothing
				}
				
			}
		}
	}
</script>



<style>

</style>