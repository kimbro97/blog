<template>
    <div id="app">
        <console-app>
            <router-view/>
        </console-app>
    <!--    <console-sign-in />-->
    </div>
</template>

<script>
import ConsoleApp from "@/components/console/console-app.vue";
import ConsoleSignIn from "@/components/console/console-sign-in.vue";
import { RouterView } from "vue-router"

export default {
    components: {
        ConsoleApp,
        ConsoleSignIn,
        RouterView
    }
}

</script>
