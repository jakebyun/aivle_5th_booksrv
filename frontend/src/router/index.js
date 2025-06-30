import { createRouter, createWebHashHistory } from 'vue-router';

const router = createRouter({
  history: createWebHashHistory(),
  routes: [
    {
      path: '/',
      component: () => import('../components/pages/Index.vue'),
    },
    {
      path: '/writers',
      component: () => import('../components/ui/WriterGrid.vue'),
    },
    {
      path: '/enrollViews',
      component: () => import('../components/EnrollViewView.vue'),
    },
    {
      path: '/publishScripts',
      component: () => import('../components/ui/PublishScriptGrid.vue'),
    },
    {
      path: '/writeViews',
      component: () => import('../components/WriteViewView.vue'),
    },
    {
      path: '/services',
      component: () => import('../components/ui/ServiceGrid.vue'),
    },
    {
      path: '/users',
      component: () => import('../components/ui/UserGrid.vue'),
    },
    {
      path: '/userViews',
      component: () => import('../components/UserViewView.vue'),
    },
    {
      path: '/books',
      component: () => import('../components/ui/BookGrid.vue'),
    },
    {
      path: '/bookViews',
      component: () => import('../components/BookViewView.vue'),
    },
    {
      path: '/points',
      component: () => import('../components/ui/PointGrid.vue'),
    },
    {
      path: '/pointViews',
      component: () => import('../components/PointViewView.vue'),
    },
    {
      path: '/payments',
      component: () => import('../components/ui/PaymentGrid.vue'),
    },
    {
      path: '/paymentViews',
      component: () => import('../components/PaymentViewView.vue'),
    },
    {
      path: '/publishBooks',
      component: () => import('../components/ui/PublishBookGrid.vue'),
    },
    {
      path: '/publishbookViews',
      component: () => import('../components/PublishbookViewView.vue'),
    },
    {
      path: '/알림',
      component: () => import('../components/ui/알림Grid.vue'),
    },
    {
      path: '/alertViews',
      component: () => import('../components/AlertViewView.vue'),
    },
  ],
})

export default router;
