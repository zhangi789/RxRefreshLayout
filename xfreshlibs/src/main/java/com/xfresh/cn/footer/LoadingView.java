package com.xfresh.cn.footer;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

import com.xfresh.cn.R;
import com.xfresh.cn.util.DensityUtil;
import com.xfresh.cn.util.IBottomView;


/**
 * @author 张海洋
 * @Date on 2019/01/16.
 * @org 上海..科技有限公司
 * @describe
 */

public class LoadingView extends ImageView implements IBottomView {
    public LoadingView(Context context) {
        this(context, null);
    }

    public LoadingView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public LoadingView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        int size = DensityUtil.dp2px(context,34);
        FrameLayout.LayoutParams params = new FrameLayout.LayoutParams(size,size);
        params.gravity = Gravity.CENTER;
        setLayoutParams(params);
        setImageResource(R.drawable.anim_loading_view);
    }

    @Override
    public View getView() {
        return this;
    }

    @Override
    public void onPullingUp(float fraction, float maxHeadHeight, float headHeight) {

    }

    @Override
    public void startAnim(float maxHeadHeight, float headHeight) {
        ((AnimationDrawable)getDrawable()).start();
    }

    @Override
    public void onPullReleasing(float fraction, float maxHeadHeight, float headHeight) {

    }
    @Override
    public void onFinish() {

    }
    @Override
    public void reset() {

    }
}
