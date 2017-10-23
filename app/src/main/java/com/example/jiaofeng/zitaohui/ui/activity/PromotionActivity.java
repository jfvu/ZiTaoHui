package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.PromotionAdapter;
import com.example.jiaofeng.zitaohui.adapter.SalesManageAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PromotionActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_promotion)
    LinearLayout mLlStatusActivityPromotion;
    @BindView(R.id.rl_return_activity_promotion)
    RelativeLayout mRlReturnActivityPromotion;
    @BindView(R.id.tv_new)
    TextView mTvNew;
    @BindView(R.id.tl_activity_promotion)
    TabLayout mTlActivityPromotion;
    @BindView(R.id.vp_activity_promotion)
    ViewPager mVpActivityPromotion;
    private PromotionAdapter mPromotionAdapter;
    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mPromotionAdapter = new PromotionAdapter(getSupportFragmentManager(),getApplication());
        mVpActivityPromotion.setAdapter(mPromotionAdapter);
        mTlActivityPromotion.setupWithViewPager(mVpActivityPromotion);

        mTlActivityPromotion.getTabAt(0).setText("有效的");
        mTlActivityPromotion.getTabAt(1).setText("失效的");

        //tlActivityMain.setTabTextColors(Color.parseColor("#40242424"),Color.parseColor("#121212"));
        mTlActivityPromotion.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivityPromotion.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivityPromotion));
        mTlActivityPromotion.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivityPromotion));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_promotion;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityPromotion;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.rl_return_activity_promotion, R.id.tv_new})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_promotion:
                finish();
                break;
            case R.id.tv_new:
                Intent intent = new Intent(this,NewPromotionActivity.class);
                startActivity(intent);
                break;
        }
    }
}
