package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter7;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShopActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_shop)
    LinearLayout mLlStatusActivityShop;
    @BindView(R.id.img_return_activity_shop)
    ImageView mImgReturnActivityShop;
    @BindView(R.id.tl_activity_shop)
    TabLayout mTlActivityShop;
    @BindView(R.id.vp_activity_shop)
    ViewPager mVpActivityShop;
    @BindView(R.id.ll_main_activity_shop)
    LinearLayout mLlMainActivityShop;
    @BindView(R.id.ll_find_activity_shop)
    LinearLayout mLlFindActivityShop;
    @BindView(R.id.ll_my_activity_shop)
    LinearLayout mLlMyActivityShop;
    @BindView(R.id.ll_server_activity_shop)
    LinearLayout mLlServerActivityShop;
    private MyFregmentAdapter7 mMyFregmentAdapter7;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mMyFregmentAdapter7 = new MyFregmentAdapter7(getSupportFragmentManager(),getApplication());
        mVpActivityShop.setAdapter(mMyFregmentAdapter7);
        mTlActivityShop.setupWithViewPager(mVpActivityShop);

        mTlActivityShop.getTabAt(0).setText("店铺首页");
        mTlActivityShop.getTabAt(1).setText("即将截拍");
        mTlActivityShop.getTabAt(2).setText("全部拍品");
        //tlActivityMain.setTabTextColors(Color.parseColor("#40242424"),Color.parseColor("#121212"));
        mTlActivityShop.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivityShop.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivityShop));
        mTlActivityShop.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivityShop));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_shop;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityShop;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_return_activity_shop, R.id.ll_main_activity_shop, R.id.ll_find_activity_shop, R.id.ll_my_activity_shop, R.id.ll_server_activity_shop})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_shop:
                finish();
                break;
            case R.id.ll_main_activity_shop:
                mIntent = new Intent();
                mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK);
                mIntent.setClass(ShopActivity.this, MainActivity.class);
                mIntent.putExtra("MainActivity",0);
                startActivity(mIntent);
                break;
            case R.id.ll_find_activity_shop:
                mIntent = new Intent();
                mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK);
                mIntent.setClass(ShopActivity.this, MainActivity.class);
                mIntent.putExtra("MainActivity",2);
                startActivity(mIntent);
                break;
            case R.id.ll_my_activity_shop:
                mIntent = new Intent();
                mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK);
                mIntent.setClass(ShopActivity.this, MainActivity.class);
                mIntent.putExtra("MainActivity",3);
                startActivity(mIntent);
                break;
            case R.id.ll_server_activity_shop:
                break;
        }
    }
}
