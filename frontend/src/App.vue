<template>
  <div id="App" class="main_app">
    <router-view></router-view>
  </div>
</template>

<script>
import { mapGetters } from 'vuex'

export default {
  
  name: 'App',

  components: {

  },

  computed: {
      ...mapGetters({ currentUser: 'currentUser' })
    },

    created () {
      this.checkCurrentLogin()
    },

    updated () {
      this.checkCurrentLogin()
    },

    methods: {

      checkCurrentLogin () {
        if (!this.currentUser && this.$route.path !== '/signup') {
          this.$router.push('/login')
        }
      }

    }
  }
</script>

<style>

</style>