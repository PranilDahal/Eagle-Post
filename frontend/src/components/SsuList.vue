<template>
<section class="padding_120">

		<div class="container col-lg-8">

			<!-- ******** this is where individual post starts******** -->
			<IndividualSsu></IndividualSsu>
			<IndividualSsu></IndividualSsu>
			<IndividualSsu></IndividualSsu>
			<IndividualSsu></IndividualSsu>

		</div>

	</section>
</template>


<script>
	import IndividualSsu from './IndividualSsu'

	export default {
		name: 'SsuList',
		components: {
			IndividualSsu
		}
	}
</script>



<style>

</style>