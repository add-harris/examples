<template>

    <v-list shaped>

        <v-list-group>
            <v-list-item>
                <v-list-item-icon></v-list-item-icon>
            </v-list-item>


        </v-list-group>

    </v-list>

</template>

<script>


    export default {
        name: 'Sidebar',
        data () {
            return {}
        }
    }


</script>

<style>

    .sidebar {
        position: fixed;
        width: 200px;
        height: 100%;
        background-color: lightgray;
        top: 0;
        left: 0;
        z-index: 1;
        padding-top: 100px;
        padding-left: 20px;
    }


</style>