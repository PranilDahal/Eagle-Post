<template>
		<div class="post_style_A">

			<div class="post_text_inside">

				<a href="#">
					<h5 class="post_heading golden_link" v-on:click="expandAndShrink">{{ssu.title}}</h5>
				</a>

				<!-- TODO Issue #5 - This should only show a portion of the description instead of the entire description -->

				<!-- TODO Issue #5 - ADd tiny buttons on the top right corner of each ssu. One for edit and one for delete.
				https://fontawesome.com/v4.7.0/icons/ Look at that link -->

				<p class="post_description">{{ssu.description}}</p>

				<div class="date">
					<a href="" class="post_sub_details_links">
						<i class="fa fa-calendar"></i> {{ssu.datePosted}}</a>
					<!-- <a href="">
									<i class="fa fa-comments-o"></i> 05</a> -->

					<!-- TODO Issue #29 - Update this template to include the number of likes.
					Talk to Deric about where it should be. (whether bottom-left, or bottom-right) -->

				</div>

			</div>

		</div>
</template>


<script>

	export default {
		name: 'IndividualSsu',

		props: ['ssu'],

		data: function(){
			return{
				title: this.ssu.title,
				description: ssu.description = this.ssu.description.split("").slice(0,150).join("") + "...",
				expand : false
			}
		},

		methods : {
			expandAndShrink: function(){
				// TODO Issue #5 - Use this method to dynamically update the this.expand boolean AND the this.description
				// IF expand is false : this.description = ssu.description AND this.expand = true (set to exapand)
        // If expand is true : this.descripion = this.ssu.description.split("")[50] AND this.expand = false (set to shrink)
        // if (expand == false) {
        //   this.description = ssu.description;
        //   this.expand = true;
        // } else {
        //   this.description = this.ssu.description.split("")[50];
        //   this.expand = false
        }


				// TODO Issue #5 - While transitioning from expand -> shrink and shrink -> expand, make the transition smooth. Have the expansion slowed down
				// so that it looks cool. Kind of like this: https://codepen.io/peternguyen/pen/hICga/
				// Make changes inside ssu.css for appropriate class, either post_description or post_style_A or whatever works.
			}
		}
</script>



<style>

</style>
