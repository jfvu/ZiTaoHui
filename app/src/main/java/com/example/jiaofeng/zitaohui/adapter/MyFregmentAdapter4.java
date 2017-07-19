package com.example.jiaofeng.zitaohui.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.FragmentFactory4;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class MyFregmentAdapter4 extends FragmentPagerAdapter {
    private Context context;

    public MyFregmentAdapter4(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        BaseFragment baseFragment = FragmentFactory4.createFragment(position);
        return baseFragment;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
