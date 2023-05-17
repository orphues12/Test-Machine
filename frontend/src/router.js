
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import MachineManager from "./components/listers/MachineCards"
import MachineDetail from "./components/listers/MachineDetail"
import GroupManager from "./components/listers/GroupCards"
import GroupDetail from "./components/listers/GroupDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/machines',
                name: 'MachineManager',
                component: MachineManager
            },
            {
                path: '/machines/:id',
                name: 'MachineDetail',
                component: MachineDetail
            },
            {
                path: '/groups',
                name: 'GroupManager',
                component: GroupManager
            },
            {
                path: '/groups/:id',
                name: 'GroupDetail',
                component: GroupDetail
            },



    ]
})
