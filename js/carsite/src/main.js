import Vue from 'vue'

// Bootstrap
// TODO installed to try & fix the image issue, but now not used, can be removed if not used in future (also remove from package.json)
// import BootstrapVue from 'bootstrap-vue'
// import 'bootstrap/dist/css/bootstrap.css'
// import 'bootstrap-vue/dist/bootstrap-vue.css'

import './plugins/vuetify'
import 'vuetify/dist/vuetify.min.css'
import 'vuetify/src/styles/main.sass'

import App from './App.vue'

import router from './router'
import store from './store'
import vuetify from './plugins/vuetify';

// Vue.use(BootstrapVue)
Vue.config.productionTip = false

new Vue({
  router,
  store,
  vuetify,
  render: h => h(App)
}).$mount('#app')
