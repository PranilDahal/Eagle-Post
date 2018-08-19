<template>
		<div class="post_style_A">

			<div class="post_text_inside">

				<a href="">
					<h5 class="post-heading">{{ssu.title}}</h5>
				</a>

				<p class="post_description">{{ssu.description}}</p>

				<div class="date">
					<a href="" class="post_sub_details_links">
						<i class="fa fa-calendar"></i> {{ssu.datePosted}}</a>
					<!-- <a href="">
									<i class="fa fa-comments-o"></i> 05</a> -->
				</div>

			</div>

		</div>
</template>


<script>

	export default {
		name: 'IndividualSsu',
		props: ['ssu']
	}
</script>



<style>

</style>