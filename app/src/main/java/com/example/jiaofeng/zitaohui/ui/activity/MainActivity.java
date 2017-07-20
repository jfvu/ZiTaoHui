package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter;

import butterknife.BindView;

public class MainActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_main)
    LinearLayout llStatusActivityMain;
    @BindView(R.id.tl_activity_main)
    TabLayout tlActivityMain;
    @BindView(R.id.vp_activity_main)
    ViewPager vpActivityMain;
    private MyFregmentAdapter myFregmentAdapter;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        myFregmentAdapter = new MyFregmentAdapter(getSupportFragmentManager(),getApplication());
        vpActivityMain.setAdapter(myFregmentAdapter);
        tlActivityMain.setupWithViewPager(vpActivityMain);

        tlActivityMain.getTabAt(0).setCustomView(tab_icon("首页",R.drawable.select_tab_main));
        tlActivityMain.getTabAt(1).setCustomView(tab_icon("分类",R.drawable.select_tab_class));
        tlActivityMain.getTabAt(2).setCustomView(tab_icon("发现",R.drawable.select_tab_find));
        tlActivityMain.getTabAt(3).setCustomView(tab_icon("我的",R.drawable.select_tab_my));
        //tlActivityMain.setTabTextColors(Color.parseColor("#40242424"),Color.parseColor("#121212"));
        tlActivityMain.setTabGravity(TabLayout.GRAVITY_FILL);
        vpActivityMain.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tlActivityMain));
        tlActivityMain.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(vpActivityMain));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return llStatusActivityMain;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }

    private View tab_icon(String name, int icon){
        View view = LayoutInflater.from(this).inflate(R.layout.tablayout,null);
        TextView textView = (TextView) view.findViewById(R.id.tv_tab);
        textView.setText(name);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_tab);
        imageView.setImageResource(icon);
        return view;
    }
}
