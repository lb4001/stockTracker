import Vue from 'vue'
import Router from 'vue-router'
import OrgChart from '@/components/OrgChart'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'OrgChart',
      component: OrgChart
    }
  ]
})
