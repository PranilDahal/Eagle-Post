<template>
  <div id="App">
    <Header></Header>
    <SsuList></SsuList>
    <Footer></Footer>
</div>
</template>

<script>
import Header from './components/Header'
import SsuList from './components/SsuList'
import Footer from './components/Footer'

export default {
  name: 'App',
  components: {
    Header,
    SsuList,
    Footer
  }
}
</script>

<style>
@import './assets/css/generic-classes.css';
@import './assets/css/header.css';
@import './assets/css/ssu.css';
@import './assets/css/footer.css';
</style>