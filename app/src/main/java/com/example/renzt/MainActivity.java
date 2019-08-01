package com.example.renzt;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import zuo.biao.library.base.BaseActivity;
import zuo.biao.library.util.Log;
import zuo.biao.library.util.SettingUtil;

public class MainActivity extends BaseActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        initData();
        initEvent();
        Log

    }


    @Override
    public void initView() {
        showProgressDialog("测试");
    }

    @Override
    public void initData() {

    }

    @Override
    public void initEvent() {

    }
}
