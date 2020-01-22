<template>

  <div>
    <div v-for="car in cars" class="card-container">
      <Card :car="car"/>
    </div>
  </div>

</template>

<script>
  import Card from '../components/Card'
  import axios from 'axios';

  export default {
    name: 'Home',
    components: {
      Card
    },
    data () {
      return {
        "cars": [
          {
            "make": "Volo",
            "model": "V40",
            "images": [
                "Volvo-Logo.jpg", "volvo_v40_rear.webp"
            ],
            "thumb": "Volvo-Logo.jpg"
          },
          {
            "make": "VW",
            "model": "Golf",
            "images": [
                "Volvo-Logo.jpg", "volvo_v40_rear.webp"
            ],
            "thumb": "volvo_v40_rear.webp"
          },
          {
            "make": "Volo",
            "model": "V40",
            "images": [
              "Volvo-Logo.jpg", "volvo_v40_rear.webp"
            ],
            "thumb": "Volvo-Logo.jpg"
          },
          {
            "make": "VW",
            "model": "Golf",
            "images": [
              "Volvo-Logo.jpg", "volvo_v40_rear.webp"
            ],
            "thumb": "volvo_v40_rear.webp"
          }
        ]
      }
    },
    mounted () {
      getCarDetails: {
        axios.get("http://localhost:8080/car-service/").then( response => {
          console.log(response)
          console.log(response.status)
          console.log(response.data)
          this.cars = response.data.cars
        })
      }
    }
  }
</script>

<style>
  .card-container {
    padding-bottom: 10px;
  }
</style>
