package com.xfresh.cn.processor;


import com.xfresh.cn.RxRefreshLayout;

/**
 * @author 张海洋
 * @Date on 2019/01/16.
 * @org 上海..科技有限公司
 * @describe
 */

public abstract class Decorator implements IDecorator {
    protected IDecorator decorator;
    protected RxRefreshLayout.CoContext cp;

    public Decorator(RxRefreshLayout.CoContext processor, IDecorator decorator1) {
        cp = processor;
        decorator = decorator1;
    }
}
