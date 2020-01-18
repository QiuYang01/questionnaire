import Vue from 'vue'
import Router from 'vue-router'
import HelloWorld from '@/components/HelloWorld'
import register from '@/components/register'
import login from '@/components/login'
import homepage from '@/components/Homepage'
import publish from '@/components/questionManage/publishQuestionnaire'
import myquestionnaire from '@/components/questionManage/myquestionnaire'
import answer from '@/components/userPage/answer'
import userPageMain from '@/components/userPage/userPageMain'

Vue.use(Router)

export default new Router({
  routes: [
    {
      path: '/',
      name: 'HelloWorld',
      // redirect:'login',
      component: userPageMain
    },
    {
      path:'/register',
      component:register
    },
    {
      path:'/login',
      component:login
    },
    {
      path:'/homepage',
      component:homepage,
      children :[ //主页的子路由
        {
          path:'publish',
          component:publish
        },
        {
          path:'myquestionnaire',
          component:myquestionnaire
        }
      ]
    }
  ]
})
