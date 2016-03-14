package com.feelingcook.activity;

import android.view.LayoutInflater;
import android.view.View;

/**
 * Created by Administrator on 2016/3/14.
 */
public class HomePageAct extends BaseActivity{
    private View contentView;
    @Override
    public View setContent() {
        contentView= LayoutInflater.from(this)
                .inflate(com.feelingcook.R.layout.homepage,null);
        return contentView;
    }

    @Override
    public void initViews() {

    }

    @Override
    public void initData() {

    }

    @Override
    public void initListener() {

    }

    @Override
    public void clickEvent(View view) {

    }

    @Override
    public void onClick(View v) {
        super.onClick(v);
    }
}
