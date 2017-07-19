package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter4;

import butterknife.BindView;
import butterknife.OnClick;

public class MyHistoryActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_myhistory)
    LinearLayout mLlStatusActivityMyhistory;
    @BindView(R.id.img_return_activity_myhistory)
    ImageView mImgReturnActivityMyhistory;
    @BindView(R.id.tl_activity_myhistory)
    TabLayout mTlActivityMyhistory;
    @BindView(R.id.vp_activity_myhistory)
    ViewPager mVpActivityMyhistory;
    private MyFregmentAdapter4 mFregmentAdapter4;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mFregmentAdapter4 = new MyFregmentAdapter4(getSupportFragmentManager(),getBaseContext());
        mVpActivityMyhistory.setAdapter(mFregmentAdapter4);
        mTlActivityMyhistory.setupWithViewPager(mVpActivityMyhistory);

        mTlActivityMyhistory.getTabAt(0).setText("关注");
        mTlActivityMyhistory.getTabAt(1).setText("参拍");
        mTlActivityMyhistory.getTabAt(2).setText("围观");
        mTlActivityMyhistory.getTabAt(3).setText("足迹");
        mTlActivityMyhistory.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivityMyhistory.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivityMyhistory));
        mTlActivityMyhistory.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivityMyhistory));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_my_history;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityMyhistory;
    }

    @Override
    protected int color() {
        return Color.parseColor("#5f3104");
    }


    @OnClick(R.id.img_return_activity_myhistory)
    public void onViewClicked() {
        finish();
    }
}
