import { createRouter, createWebHistory } from 'vue-router'
// import routes from "~pages";

const router = createRouter({
    history: createWebHistory(import.meta.env.BASE_URL),
    routes: [
        {
            path: "/",
            component: () => { return import("@/views/client/index.vue") }
        },
        {
            path: "/post",
            component: () => { return import("@/views/client/post/index.vue") }
        },

        {
            path: "/console",
            component: () => { return import("@/views/console/index.vue") }
        },
        {
            path: "/console/post",
            component: () => { return import("@/views/console/post/index.vue") }
        }
    ]
})

export default router
