<template>
  <v-app>

    <Navbar/>

    <v-container fluid>

      <v-layout>

<!--        <v-flex xs0 sm0 md lg0 xl2>-->
<!--          <Sidebar/>-->
<!--        </v-flex>-->

        <v-flex xs12 sm12 md12 lg12 xl10>

          <v-content>
            <v-container fluid>
              <router-view></router-view>
            </v-container>
          </v-content>

        </v-flex>

      </v-layout>

    </v-container>

  </v-app>
</template>

<script>

  import Navbar from './components/Navbar'
  import Sidebar from './components/Sidebar'

  export default {
    name: 'App',
    components: {
      Navbar,
      Sidebar
    },
    data () {
      return {
        //
      }
    }
  }
</script>
