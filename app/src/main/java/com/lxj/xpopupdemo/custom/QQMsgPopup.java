package com.lxj.xpopupdemo.custom;

import android.content.Context;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;

import com.lxj.xpopup.core.PositionPopupView;
import com.lxj.xpopupdemo.R;

/**
 * Description:
 * Create by dance, at 2019/6/14
 */
public class QQMsgPopup extends PositionPopupView {
    public QQMsgPopup(@NonNull Context context) {
        super(context);
    }

    @Override
    protected int getImplLayoutId() {
        return R.layout.popup_qq_msg;
    }
}
