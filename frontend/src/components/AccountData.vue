<template>

	<div class="container-accountdata100">
		<div class="wrap-accountdata100">
			<form class="accountdata100-form validate-form">
				<span class="accountdata100-form-title">
					Account Information
				</span>

				<div class="wrap-textfield100 validate-input">
					<input v-model="fullname" class="acctdata-100" id="name" type="text" name="name" placeholder="Deric Kwok" disabled>
					<label class="label-input100" for="name">
						<span class="">
							<i class="fa fa-user-circle" style="font-size:24px"></i>
						</span>
					</label>
				</div>

				<div class="wrap-textfield100 validate-input">
					<input v-model="info.username" class="acctdata-100" id="email" type="text" name="email" placeholder="Email" disabled>
					<label class="label-input100" for="email">
						<span class="">
							<i class="fa fa-at" style="font-size:24px"></i>
						</span>
					</label>
				</div>

				<div class="wrap-textfield100 validate-input">
					<input v-model="info.emailaddress" class="acctdata-100" id="phone" type="text" name="phone" placeholder="Phone" disabled>
					<label class="label-input100" for="phone">
						<span class="">
							<i class="fa fa-envelope" style="font-size:24px"></i>
						</span>
					</label>
				</div>

				<div class="wrap-textfield100 validate-input">
					<input v-model="info.phonenumber" class="acctdata-100" id="phone" type="text" name="phone" placeholder="CIN" disabled>
					<label class="label-input100" for="phone">
						<span class="">
							<i class="fa fa-phone" style="font-size:24px"></i>
						</span>
					</label>
				</div>

				<div class="wrap-textfield100 validate-input">
					<input v-model="info.cin" class="acctdata-100" id="phone" type="text" name="phone" placeholder="Username" disabled>
					<label class="label-input100" for="phone">
						<span class="">
							<i class="fa fa-drivers-license-o" style="font-size:24px"></i>
						</span>
					</label>
				</div>

				<div class="wrap-textfield100 validate-input">
					<input v-model="info.birthday" class="acctdata-100" id="phone" type="text" name="phone" placeholder="Birthday" disabled>
					<label class="label-input100" for="phone">
						<span class="">
							<i class="fa fa-calendar" style="font-size:24px"></i>
						</span>
					</label>
				</div>

				<div class="wrap-textfield100 validate-input">
					<input v-model="info.secretcode" class="acctdata-100" id="phone" type="text" name="phone" placeholder="Secret Code" disabled>
					<label class="label-input100" for="phone">
						<span class="">
							<i class="fa fa-eye-slash" style="font-size:24px"></i>
						</span>
					</label>
				</div>

			</form>
		</div>
	</div>

</template>


<script>
	import { mapGetters } from 'vuex'
	
	export default {
		name: 'AccountData',
		
		data () {
			return {
				info: {
					firstname: 'Anonymous Ghost',
					lastname: 'Sr.',
					username: 'peepee',
					cin: '000000000',
					phonenumber: '000-000-0000',
					emailaddress: 'ghost@spooky.com',
					birthday: '0000-00-00',
					secretcode: 'Spooky Scary Skeleton'
				},
				fullname : "Anonymous Ghost Sr."
			}
		},

		computed: {
			...mapGetters({ currentUser: 'currentUser' })
		},

		created() {
			this.fetchData()
		},

		methods: {
			
			fetchData(){

				let urlToCall = "/userdata/accountsettings/"+this.currentUser.userid

				this.$http.get(urlToCall)
					.then(response => {
						// JSON responses are automatically parsed.
						this.info = response.data
						this.fullname = this.info.firstname + " " + this.info.lastname
					})
					.catch(e => {
						// Catch any errors
						this.errors.push(e)

					})

			}
		}
	}
</script>


<style>
</style>