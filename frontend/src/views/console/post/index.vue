<template>
    <v-container fluid fill-height>
        <v-layout justify-center>
            <v-responsive max-width="1440px" width="100%" height="100%">
                <v-row class="mt-8" justify="center" align="center">
                    <v-col cols="auto">게시물 관리</v-col>
                    <v-spacer></v-spacer>
                </v-row>
                <section>
                    <v-card variant="outlined">
                        <v-card-title>검색필터</v-card-title>
                        <v-row align="center">
                            <v-col cols="12" sm="6" md="4">
                                <v-text-field label="label" variant="outlined"></v-text-field>
                            </v-col>
                            <v-col cols="12" sm="6" md="4">
                                <v-text-field label="label" variant="outlined"></v-text-field>
                            </v-col>
                            <v-col cols="12" sm="6" md="4">
                                <v-text-field label="label" variant="outlined"></v-text-field>
                            </v-col>
                            <v-col cols="12" sm="6" md="4">
                                <v-text-field label="label" variant="outlined"></v-text-field>
                            </v-col>
                        </v-row>
                    </v-card>
                </section>
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