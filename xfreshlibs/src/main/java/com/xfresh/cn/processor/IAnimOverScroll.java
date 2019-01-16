package com.xfresh.cn.processor;

/**
 * @author 张海洋
 * @Date on 2019/01/16.
 * @org 上海..科技有限公司
 * @describe
 */

public interface IAnimOverScroll {
    void animOverScrollTop(float vy, int computeTimes);
    void animOverScrollBottom(float vy, int computeTimes);
}
