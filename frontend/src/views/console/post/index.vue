<template>
    <v-container fluid fill-height>
        <v-layout justify-center>
            <v-responsive max-width="1280px" width="100%" height="100%">
                <v-row class="mt-8" justify="center" align="center">
                    <v-col cols="auto">게시물 관리</v-col>
                    <v-spacer></v-spacer>
                </v-row>
            </v-responsive>
        </v-layout>
    </v-container>
</template>

<script>
import { mdiMenu } from '@mdi/js';

export default {
    data() {
        return {
            path: mdiMenu,
            drawer: true
        }
    }
};
</script>