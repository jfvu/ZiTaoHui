package com.example.jiaofeng.zitaohui;

import android.app.Application;

/**
 * Created by jiaofeng on 2017/8/9.
 */

public class App extends Application {

    public static App context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }
}
