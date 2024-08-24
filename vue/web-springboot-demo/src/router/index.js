import Vue from 'vue'
import VueRouter from 'vue-router'

Vue.use(VueRouter)

const routes = [
  {
    path: '/',
    name: 'home',
    component: () => import(/* webpackChunkName: "home" */ '../views/tlias/EmpView.vue')
  },
  {
    path: '/emp',
    name: 'emp',
    component: () => import(/* webpackChunkName: "emp" */ '../views/tlias/EmpView.vue')
  },
  {
    path: '/dept',
    name: 'dept',
    component: () => import(/* webpackChunkName: "dept" */ '../views/tlias/DeptView.vue')
  },
]

const router = new VueRouter({
  routes
})

export default router
