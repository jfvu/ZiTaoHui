package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class CouponActivity extends BaseActivity {


    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.rl_return)
    RelativeLayout mRlReturn;
    @BindView(R.id.rb_use)
    RadioButton mRbUse;
    @BindView(R.id.rb_used)
    RadioButton mRbUsed;
    @BindView(R.id.rb_pass)
    RadioButton mRbPass;
    @BindView(R.id.rv_activity_coupon)
    RecyclerView mRvActivityCoupon;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRbUse.setChecked(true);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_coupon;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatus;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick(R.id.rl_return)
    public void onViewClicked() {
        finish();
    }
}
