<script setup>
import {
  VerticalNavLink,
  VerticalNavSectionTitle,
} from '@layouts'
</script>

<template>
    <ul>
        <VerticalNavSectionTitle :item="{ heading: '작가 등록' }" />
        <VerticalNavLink
            :item="{
                title: '작가 등록',
                to: '/writers',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'EnrollView',
                to: '/enrollViews',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '원고 관리' }" />
        <VerticalNavLink
            :item="{
                title: '원고 관리',
                to: '/publishScripts',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'WriteView',
                to: '/writeViews',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'AI서비스' }" />
        <VerticalNavLink
            :item="{
                title: 'AI서비스',
                to: '/services',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '사용자 인증' }" />
        <VerticalNavLink
            :item="{
                title: '사용자',
                to: '/users',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'UserView',
                to: '/userViews',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '책(개인)' }" />
        <VerticalNavLink
            :item="{
                title: '책',
                to: '/books',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'BookView',
                to: '/bookViews',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: 'Point' }" />
        <VerticalNavLink
            :item="{
                title: '포인트',
                to: '/points',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'PointView',
                to: '/pointViews',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '결제' }" />
        <VerticalNavLink
            :item="{
                title: '결제',
                to: '/payments',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'PaymentView',
                to: '/paymentViews',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '출간 도서 관리' }" />
        <VerticalNavLink
            :item="{
                title: '책 관리',
                to: '/publishBooks',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'PublishbookView',
                to: '/publishbookViews',
            }"
        />
        <VerticalNavSectionTitle :item="{ heading: '알림' }" />
        <VerticalNavLink
            :item="{
                title: '알림',
                to: '/알림',
            }"
        />
        <VerticalNavLink
            :item="{
                title: 'AlertView',
                to: '/alertViews',
            }"
        />
    </ul>
</template>
