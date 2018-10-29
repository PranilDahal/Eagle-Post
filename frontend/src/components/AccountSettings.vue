<template>
  <div class="home_page_root">
    
    <MinimumHeader></MinimumHeader>

    <AccountData></AccountData>
    
    <SsuList v-bind:timelineurl="timelineurl"></SsuList>

    <Footer></Footer>

 </div>
</template>

<script>
import MinimumHeader from './MinimumHeader'
import SsuList from './SsuList'
import AccountData from './AccountData'
import Footer from './Footer'

import { mapGetters } from 'vuex'

export default {
  name: 'Home',

  components: {
    MinimumHeader,
    SsuList,
    AccountData,
    Footer
  },

  data: function(){
    return{
      timelineurl: ""
    }
  },

  computed: {
    ...mapGetters({ currentUser: 'currentUser' })
  },

  created () {
    this.checkCurrentLogin()
    this.timelineurl = "/SSU/byuser/"+this.currentUser.userid
  },

  updated () {
    this.checkCurrentLogin()
  },
  
  methods:{

    checkCurrentLogin () {
      if (!this.currentUser) {
        this.$router.push('/login')
      }
    }

  }
}
</script>

<style>
@import '../assets/css/generic-classes.css';
@import '../assets/css/header.css';
@import '../assets/css/ssu.css';
@import '../assets/css/footer.css';
@import '../assets/css/account-data.css';

.fade-enter-active, .fade-leave-active {
  transition: opacity .5s;
}
.fade-enter, .fade-leave-to /* .fade-leave-active below version 2.1.8 */ {
  opacity: 0;
}
</style>