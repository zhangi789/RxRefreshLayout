package com.xfresh.cn.processor;


import com.xfresh.cn.RxRefreshLayout;

/**
 * Created by lcodecore on 2017/3/3.
 */

public abstract class Decorator implements IDecorator {
    protected IDecorator decorator;
    protected RxRefreshLayout.CoContext cp;

    public Decorator(RxRefreshLayout.CoContext processor, IDecorator decorator1) {
        cp = processor;
        decorator = decorator1;
    }
}
