<template>

    <div>
        <h2>Details view</h2>



        <Carousel :car="car"/>



        <p>{{ car.make }}</p>
        <p>{{ car.model }}</p>


    </div>

</template>

<script>

    import Carousel from '../components/Carousel'

    export default {
        name: 'Details',
        components: {
            Carousel
        },
        props: {
            car: Object
        },
        data () {
            return {}
        }
    }

</script>