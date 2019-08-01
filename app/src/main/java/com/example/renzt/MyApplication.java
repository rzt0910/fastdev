package com.example.renzt;

import zuo.biao.library.base.BaseApplication;

public class MyApplication extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        BaseApplication.init(this);
    }
}
