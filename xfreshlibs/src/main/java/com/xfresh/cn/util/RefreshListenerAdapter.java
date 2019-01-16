package com.xfresh.cn.util;

/**
 * @author 张海洋
 * @Date on 2019/01/16.
 * @org 上海..科技有限公司
 * @describe
 */
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