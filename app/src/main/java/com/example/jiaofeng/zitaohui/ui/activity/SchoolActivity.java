package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter6;
import com.example.jiaofeng.zitaohui.adapter.SchoolAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SchoolActivity extends BaseActivity {


    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.img_return)
    ImageView mImgReturn;
    @BindView(R.id.tl_activity_school)
    TabLayout mTlActivitySchool;
    @BindView(R.id.vp_activity_school)
    ViewPager mVpActivitySchool;
    private SchoolAdapter mSchoolAdapter;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mSchoolAdapter = new SchoolAdapter(getSupportFragmentManager(),this);
        mVpActivitySchool.setAdapter(mSchoolAdapter);
        mTlActivitySchool.setupWithViewPager(mVpActivitySchool);

        mTlActivitySchool.getTabAt(0).setText("紫陶百问");
        mTlActivitySchool.getTabAt(1).setText("帮助中心");

        mTlActivitySchool.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivitySchool.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivitySchool));
        mTlActivitySchool.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivitySchool));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_school;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatus;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.img_return)
    public void onViewClicked() {
        finish();
    }
}
