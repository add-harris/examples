<template>

    <v-card hover class="clickable" @click="goToDetails(car)">

        <v-img
                :src="imgSrc"
                class="thumb"
        ></v-img>


        <v-card-title primary-title>
            <p>{{ car.make }} {{ car.model }}</p>
        </v-card-title>

        <v-card-actions>
            <v-btn text color="orange">Details</v-btn>
        </v-card-actions>


    </v-card>

</template>

<script>

    import { getImgResource } from '../utils/utils'

    export default {
        name: 'Card',
        props: {
          car: Object
        },
        data () {
            return {}
        },
        computed: {
            imgSrc() {
                return getImgResource(this.car.thumb)
            }
        },
        methods: {
            goToDetails(car) {
                this.$router.push({ name: 'details', params: { car: car } })
            }
        }
    }

</script>

<style>

    .thumb {
        max-height: 100px;
        max-width: 100px;
    }


</style>