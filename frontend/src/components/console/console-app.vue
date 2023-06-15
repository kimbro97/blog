<template>
    <v-app>
        <console-bar v-model="drawer"></console-bar>
        <console-drawer v-model="drawer"></console-drawer>
        <v-main>
            <v-container fluid fill-height>
                <slot />
            </v-container>
        </v-main>
    </v-app>

</template>

<script>
import consoleBar from './console-bar.vue'
import consoleDrawer from './console-drawer.vue'

export default {
	components: {
		consoleBar,
		consoleDrawer
	},

	data() {
		return {
			drawer: true
		}
	}
}

</script>