package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter5;

import butterknife.BindView;
import butterknife.OnClick;

public class BuyOrderActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_buyorder)
    LinearLayout mLlStatusActivityBuyorder;
    @BindView(R.id.img_return_activity_buyorder)
    ImageView mImgReturnActivityBuyorder;
    @BindView(R.id.tl_activity_buyorder)
    TabLayout mTlActivityBuyorder;
    @BindView(R.id.vp_activity_buyorder)
    ViewPager mVpActivityBuyorder;
    private MyFregmentAdapter5 myFregmentAdapter5;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mIntent = getIntent();
        int i = mIntent.getIntExtra("BuyOrderActivity",0);
        myFregmentAdapter5 = new MyFregmentAdapter5(getSupportFragmentManager(),BuyOrderActivity.this);
        mVpActivityBuyorder.setAdapter(myFregmentAdapter5);
        mTlActivityBuyorder.setupWithViewPager(mVpActivityBuyorder);

        mTlActivityBuyorder.getTabAt(0).setText("未付款");
        mTlActivityBuyorder.getTabAt(1).setText("待发货");
        mTlActivityBuyorder.getTabAt(2).setText("未收货");
        mTlActivityBuyorder.getTabAt(3).setText("待评价");
        mTlActivityBuyorder.getTabAt(4).setText("售后");
        mTlActivityBuyorder.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivityBuyorder.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivityBuyorder));
        mTlActivityBuyorder.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivityBuyorder));
        mVpActivityBuyorder.setCurrentItem(i);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_buyorder;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityBuyorder;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.img_return_activity_buyorder)
    public void onViewClicked() {
        finish();
    }
}
