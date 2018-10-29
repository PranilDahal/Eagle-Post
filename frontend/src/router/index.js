import Vue from 'vue'
import Router from 'vue-router'
import Login from '@/components/Login'
import Logout from '@/components/Logout'
import Home from '@/components/Home'
import Signup from '@/components/Signup'
import AccountSettings from '@/components/AccountSettings'

Vue.use(Router)

export default new Router({
  mode: "history",
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home
    },
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/signup',
      name: 'Signup',
      component: Signup
    },
    {
      path: '/home',
      name: 'Home',
      component: Home
    },
    {
      path: '/logout',
      name: 'Logout',
      component: Logout
    },
    {
      path: '/accountsettings',
      name: 'AccountSettings',
      component : AccountSettings
    }
  ]
})