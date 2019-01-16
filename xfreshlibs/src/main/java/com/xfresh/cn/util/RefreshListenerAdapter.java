package com.xfresh.cn.util;


import com.xfresh.cn.RxRefreshLayout;

public abstract class RefreshListenerAdapter implements PullListener {
        @Override
        public void onPullingDown(RxRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullingUp(RxRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullDownReleasing(RxRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onPullUpReleasing(RxRefreshLayout refreshLayout, float fraction) {
        }

        @Override
        public void onRefresh(RxRefreshLayout refreshLayout) {
        }

        @Override
        public void onLoadMore(RxRefreshLayout refreshLayout) {
        }

        @Override
        public void onFinishRefresh() {

        }

        @Override
        public void onFinishLoadMore() {

        }

        @Override
        public void onRefreshCanceled() {

        }

        @Override
        public void onLoadmoreCanceled() {

        }
}