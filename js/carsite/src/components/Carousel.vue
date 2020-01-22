<template>
    <div>
        <v-carousel>
            <v-carousel-item v-for="(image, i) in car.images" :key="i" class="carousel-item">
                <div>
                    <v-img :src="imgSrc(image)" class="carousel-image" contain ></v-img>
                </div>
            </v-carousel-item>
        </v-carousel>
    </div>
</template>

<script>

    import { getImgResource } from '../utils/utils'

    export default {
        name: 'Carousel',
        props: {
            car: Object
        },
        data () {
            return {}
        },
        methods: {
            imgSrc(image) {
                return getImgResource(image)
            }
        }
    }

</script>

<style>

    .carousel-image {
        max-height: 500px !important;
    }

    .carousel-item {
        background-color: darkgrey;
    }

</style>