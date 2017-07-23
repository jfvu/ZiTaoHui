package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class PaySafeActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_paysafe)
    LinearLayout mLlStatusActivityPaysafe;
    @BindView(R.id.img_return_activity_paysafe)
    ImageView mImgReturnActivityPaysafe;
    @BindView(R.id.rl_reset_activity_paysafe)
    RelativeLayout mRlResetActivityPaysafe;
    @BindView(R.id.rl_forget_activity_paysafe)
    RelativeLayout mRlForgetActivityPaysafe;
    @BindView(R.id.rl_change_activity_paysafe)
    RelativeLayout mRlChangeActivityPaysafe;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_pay_safe;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityPaysafe;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_return_activity_paysafe, R.id.rl_reset_activity_paysafe, R.id.rl_forget_activity_paysafe, R.id.rl_change_activity_paysafe})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_paysafe:
                finish();
                break;
            case R.id.rl_reset_activity_paysafe:
                break;
            case R.id.rl_forget_activity_paysafe:
                break;
            case R.id.rl_change_activity_paysafe:
                break;
        }
    }
}
