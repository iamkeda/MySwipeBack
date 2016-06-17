package com.kd.myswipeback.base;

import com.kd.myswipeback.layout.SwipeBackLayout;

/**
 * Created by KD on 2016/6/18.
 */
public interface SwipeBackActivityBase {
    /**
     * @return the SwipeBackLayout associated with this activity.
     */
    public abstract SwipeBackLayout getSwipeBackLayout();

    public abstract void setSwipeBackEnable(boolean enable);

    /**
     * Scroll out contentView and finish the activity
     */
    public abstract void scrollToFinishActivity();

}