package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.DetailAdapter;
import com.example.jiaofeng.zitaohui.adapter.SalesManageAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SalesManageActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_selesmanage)
    LinearLayout mLlStatusActivitySelesmanage;
    @BindView(R.id.rl_return_activity_selesmanage)
    RelativeLayout mRlReturnActivitySelesmanage;
    @BindView(R.id.tl_activity_salesmanage)
    TabLayout mTlActivitySalesmanage;
    @BindView(R.id.vp_activity_salesmanage)
    ViewPager mVpActivitySalesmanage;
    private SalesManageAdapter mSalesManageAdapter;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mSalesManageAdapter = new SalesManageAdapter(getSupportFragmentManager(),getApplication());
        mVpActivitySalesmanage.setAdapter(mSalesManageAdapter);
        mTlActivitySalesmanage.setupWithViewPager(mVpActivitySalesmanage);

        mTlActivitySalesmanage.getTabAt(0).setText("竞拍中");
        mTlActivitySalesmanage.getTabAt(1).setText("已截拍");
        mTlActivitySalesmanage.getTabAt(2).setText("已流拍");
        mTlActivitySalesmanage.getTabAt(3).setText("已失败");
        mTlActivitySalesmanage.getTabAt(4).setText("草稿箱");
        //tlActivityMain.setTabTextColors(Color.parseColor("#40242424"),Color.parseColor("#121212"));
        mTlActivitySalesmanage.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivitySalesmanage.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivitySalesmanage));
        mTlActivitySalesmanage.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivitySalesmanage));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sales_manage;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySelesmanage;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick(R.id.rl_return_activity_selesmanage)
    public void onViewClicked() {
        finish();
    }
}
