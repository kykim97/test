
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import TestManager from "./components/listers/TestCards"
import TestDetail from "./components/listers/TestDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/tests',
                name: 'TestManager',
                component: TestManager
            },
            {
                path: '/tests/:id',
                name: 'TestDetail',
                component: TestDetail
            },



    ]
})
