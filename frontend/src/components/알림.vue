<template>
    <div>
        <String
            label="Email"
            v-model="value.email"
            :editMode="editMode"
        />
        <String
            label="Message"
            v-model="value.message"
            :editMode="editMode"
        />
        <Boolean
            label="IsRead"
            v-model="value.isRead"
            :editMode="editMode"
        />
        <Date
            label="CreatedAt"
            v-model="value.createdAt"
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
    name: '알림',
    mixins:[BaseEntity],
    components:{
    },
    
    data: () => ({
        path: "알림",
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
