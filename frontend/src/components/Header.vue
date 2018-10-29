<template>
	<header>

		<div class="top_menu">

			<nav class="navbar navbar-expand-lg navbar-light">

				<div class="container">

					<a href="">
						<img src="./../assets/img/csula-heading.png" alt="Cal State LA" style="width:45px;height:55px;">
					</a>

					<!-- TODO Issue #3 - When user clicks this "Post" text, a form should appear -->
					<a class="navbar_link golden_link" href="#" v-on:click="$emit('post')" title="New Post">Post</a>

					<ul class="navbar-nav">
						<li class="navbar-menu-item">

							<router-link to="/home">
								<a class="navbar_link golden_link" href="" title="Home" v-on:click="goHome()">Home</a>
							</router-link>

							<router-link to="/accountsettings">
								<a href="#" title="Account Info" class="fa fa-graduation-cap golden_link head_icon"></a>
							</router-link>

							<router-link to="/logout" title="Logout">
								<a href="#" class="fa fa-share-square-o golden_link head_icon"></a>
							</router-link>
						
						</li>
					</ul>

				</div>
			</nav>

		</div>

	</header>
</template>


<script>
	export default {
		name: 'Header',

		methods: {
			goHome(){
				this.$router.replace(this.$route.query.redirect || '/home')
			}
		},
	}
</script>


<style>

</style>



