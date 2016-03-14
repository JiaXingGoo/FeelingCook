package com.feelingcook.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.Window;

import com.feelingcook.utils.SteepStubarUtil;

/**
 * Created by Administrator on 2016/3/14.
 */
public abstract class BaseActivity extends FragmentActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View contentView=setContent();
        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(contentView);
        SteepStubarUtil steepStubarUtil = new SteepStubarUtil();
        steepStubarUtil.setSteep(this);
        initViews();
        initData();
        initListener();
    }

    public abstract View setContent();

    public abstract void initViews();

    public abstract void initData();

    public abstract void initListener();

    public abstract void clickEvent(View view);

    @Override
    public void onClick(View v) {
        clickEvent(v);
    }
}
