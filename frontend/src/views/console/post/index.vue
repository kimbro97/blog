<template>
    <console-app>
        <div>sss</div>
    </console-app>
</template>

<script>
import { mdiMenu } from '@mdi/js';
import consoleApp from '@/components/console/console-app.vue';

export default {
    components: {
        consoleApp
    },
    data() {
        return {
            path: mdiMenu,
            drawer: true
        }
    }
};
</script>