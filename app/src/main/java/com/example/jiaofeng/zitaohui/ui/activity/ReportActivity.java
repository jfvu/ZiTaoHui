package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.ReportAdapter;
import com.example.jiaofeng.zitaohui.adapter.SchoolAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReportActivity extends BaseActivity {


    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.img_return)
    ImageView mImgReturn;
    @BindView(R.id.tl_activity_report)
    TabLayout mTlActivityReport;
    @BindView(R.id.vp_activity_report)
    ViewPager mVpActivityReport;
    private ReportAdapter mReportAdapter;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mReportAdapter = new ReportAdapter(getSupportFragmentManager(),this);
        mVpActivityReport.setAdapter(mReportAdapter);
        mTlActivityReport.setupWithViewPager(mVpActivityReport);

        mTlActivityReport.getTabAt(0).setText("上周");
        mTlActivityReport.getTabAt(1).setText("上月");
        mTlActivityReport.getTabAt(2).setText("本月");
        mTlActivityReport.getTabAt(3).setText("最近30天");

        mTlActivityReport.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivityReport.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivityReport));
        mTlActivityReport.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivityReport));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_report;
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
