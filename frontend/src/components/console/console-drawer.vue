<template>
	<v-navigation-drawer v-bind:model-value="modelValue" permanent color="#414C60">
		<v-list v-model="selected">
            <v-list-group v-for="(item, index) in items" :key="index" :value="index">
                <template v-slot:activator="{ props }">
                    <v-list-item v-bind="props" prepend-icon="mdi-account-circle" :title="item.title" base-color="white"></v-list-item>
                </template>
                <v-divider/>
                <div style="background-color: #2A3140">
                    <v-list-item v-for="(child, index) in item.childs" :key="index" :title="child.title" :to="child.path" base-color="white"></v-list-item>
                </div>
                <v-divider/>
            </v-list-group>
		</v-list>

		<template v-slot:append>
			<div class="pa-2">
				<v-btn block>
					Logout
				</v-btn>
			</div>
		</template>
	</v-navigation-drawer>
</template>

<script>
export default {
	props: {
		modelValue: { type: Boolean, default: true }
	},
	data() {
		return {
            selected: null,
			items: [
                {
                    title: "블로그 관리",
                    childs: [
                        {
                            title: "블로그",
                            path: "/console/post"
                        },
                        {
                            title: "시리즈",
                            path: "/console/postㄴ"
                        },
                    ]
                }
            ],
            open: ['Users'],
            admins: [
                ['Management', 'mdi-account-multiple-outline'],
                ['Settings', 'mdi-cog-outline'],
            ],
		}
	}
}
</script>