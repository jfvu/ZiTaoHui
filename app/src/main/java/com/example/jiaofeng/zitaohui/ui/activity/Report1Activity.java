package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.ReportAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Report1Activity extends BaseActivity {


    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.img_return)
    ImageView mImgReturn;
    @BindView(R.id.tl_activity_report1)
    TabLayout mTlActivityReport1;
    @BindView(R.id.vp_activity_report1)
    ViewPager mVpActivityReport1;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        //mReportAdapter = new ReportAdapter(getSupportFragmentManager(),this);
        //mVpActivityReport1.setAdapter(mReportAdapter);
        mTlActivityReport1.setupWithViewPager(mVpActivityReport1);

        mTlActivityReport1.getTabAt(0).setText("资金报表");
        mTlActivityReport1.getTabAt(1).setText("经营报表");

        mTlActivityReport1.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivityReport1.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivityReport1));
        mTlActivityReport1.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivityReport1));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_report1;
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
