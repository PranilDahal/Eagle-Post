import Vue from 'vue'
import App from './App'
import router from './router'
import axios from './backend/vue-axios'
import store from './store'

Vue.config.productionTip = false

new Vue({
  el: '#App',
  router,
  axios,
  store,
  template: '<App/>',
  components: { App }
})