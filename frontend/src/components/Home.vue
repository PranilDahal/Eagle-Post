<template>
  <div class="home_page_root">
    
    <Header v-on:post="posttrigger()"></Header>

    <transition name="fade">
      <PostSsu v-if="postMode" v-on:posted="afterPostingNewSsu()"></PostSsu>
    </transition>

    <SsuList v-bind:timelineurl="timelineurl"></SsuList>

</div>
</template>

<script>
import Header from './Header'
import SsuList from './SsuList'
import PostSsu from './PostSsu'

import { mapGetters } from 'vuex'

export default {
  name: 'Home',

  components: {
    Header,
    SsuList,
    PostSsu
  },

  data: function(){
    return{
      postMode : false,
      timelineurl: "/SSU/all"
    }
	},

  computed: {
    ...mapGetters({ currentUser: 'currentUser' })
  },

  created () {
    this.checkCurrentLogin()
    this.postMode = false
  },

  updated () {
    this.checkCurrentLogin()
  },
  
  methods:{

    checkCurrentLogin () {
      if (!this.currentUser) {
        this.$router.push('/login')
      }
    },

    posttrigger(){
      if(this.postMode){
        this.postMode = false
      }
      else{
        this.postMode = true
      }
    },

    afterPostingNewSsu(){
      // vm.$forceUpdate()
      window.location.reload()
      this.posttrigger()
    }

  }
}
</script>

<style>

  @import '../assets/css/generic-classes.css';
  @import '../assets/css/header.css';
  @import '../assets/css/ssu.css';
  @import '../assets/css/ssu-form.css';

  .fade-enter-active, .fade-leave-active {
    transition: opacity .5s;
  }
  .fade-enter, .fade-leave-to /* .fade-leave-active below version 2.1.8 */ {
    opacity: 0;
  }
</style>