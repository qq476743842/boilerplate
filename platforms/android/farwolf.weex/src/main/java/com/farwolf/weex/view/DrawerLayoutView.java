package com.farwolf.weex.view;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.util.AttributeSet;
import android.util.Log;

import com.farwolf.base.ViewBase;
import com.farwolf.util.ScreenTool;
import com.farwolf.weex.R;

import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EViewGroup;
import org.androidannotations.annotations.ViewById;

/**
 * Created by even on 2017/10/18.
 */
@EViewGroup
public class DrawerLayoutView extends ViewBase {
    @Bean
    public ScreenTool tool;

    @ViewById
    public WXPageView_ main_view;
    @ViewById
    public WXPageView nav_view;
    @ViewById
    public DrawerLayout drawer_layout;

    public DrawerLayoutView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawerLayoutView(Context context) {
        super(context);
    }


    @Override
    public int getViewId() {
        return R.layout.drawerlayoutview;
    }

    @Override
    public void init() {
        Log.e("init state", "init");
    }

    public void setSlidUrl(String url)
    {

        nav_view.setSrc(url);
        Log.e("nav_view url", url);
    }

    public void setMainUrl(String url)
    {
        main_view.setSrc(url);
        Log.e("main_view url", url);
    }

    @Click
    public void main_viewClicked() {

    }
}
