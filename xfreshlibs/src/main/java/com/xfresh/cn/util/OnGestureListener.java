package com.xfresh.cn.util;

import android.view.MotionEvent;
/**
 * @author 张海洋
 * @Date on 2019/01/16.
 * @org 上海..科技有限公司
 * @describe
 */
public interface OnGestureListener {
    void onDown(MotionEvent ev);

    void onScroll(MotionEvent downEvent, MotionEvent currentEvent, float distanceX, float distanceY);

    void onUp(MotionEvent ev, boolean isFling);

    void onFling(MotionEvent downEvent, MotionEvent upEvent, float velocityX, float velocityY);
}