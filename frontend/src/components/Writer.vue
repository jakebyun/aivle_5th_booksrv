<template>
    <div>
        <String
            label="Email"
            v-model="value.email"
            :editMode="editMode"
        />
        <String
            label="Info"
            v-model="value.info"
            :editMode="editMode"
        />
        <String
            label="Status"
            v-model="value.status"
            :editMode="editMode"
        />
        <String
            label="PortfolioUrl"
            v-model="value.portfolioUrl"
            :editMode="editMode"
        />
        <v-row class="ma-0 pa-0">
            <v-spacer></v-spacer>
            <v-btn width="64px" color="primary" @click="save">
                저장
            </v-btn>
        </v-row>
    </div>
</template>


<script>
import BaseEntity from './base-ui/BaseEntity.vue'

export default {
    name: 'Writer',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "writers",
        value: {
        }
    }),
    created(){
    },
    computed:{
    },
    methods: {
    },
}
</script>
