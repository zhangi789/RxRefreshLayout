package com.xfresh.cn.util;


import com.xfresh.cn.RxRefreshLayout;

public interface PullListener {
        /**
         * 下拉中
         *
         * @param refreshLayout
         * @param fraction
         */
        void onPullingDown(RxRefreshLayout refreshLayout, float fraction);

        /**
         * 上拉
         */
        void onPullingUp(RxRefreshLayout refreshLayout, float fraction);

        /**
         * 下拉松开
         *
         * @param refreshLayout
         * @param fraction
         */
        void onPullDownReleasing(RxRefreshLayout refreshLayout, float fraction);

        /**
         * 上拉松开
         */
        void onPullUpReleasing(RxRefreshLayout refreshLayout, float fraction);

        /**
         * 刷新中。。。
         */
        void onRefresh(RxRefreshLayout refreshLayout);

        /**
         * 加载更多中
         */
        void onLoadMore(RxRefreshLayout refreshLayout);

        /**
         * 手动调用finishRefresh或者finishLoadmore之后的回调
         */
        void onFinishRefresh();

        void onFinishLoadMore();

        /**
        * 正在刷新时向上滑动屏幕，刷新被取消
        */
        void onRefreshCanceled();

        /**
         * 正在加载更多时向下滑动屏幕，加载更多被取消
         */
        void onLoadmoreCanceled();
    }