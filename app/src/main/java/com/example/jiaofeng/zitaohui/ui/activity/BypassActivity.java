package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BypassActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_bypass)
    LinearLayout mLlStatusActivityBypass;
    @BindView(R.id.img_return_activity_bypass)
    ImageView mImgReturnActivityBypass;
    @BindView(R.id.tv_editbypass)
    TextView mTvEditbypass;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_bypass;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityBypass;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_return_activity_bypass, R.id.tv_editbypass})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_bypass:
                finish();
                break;
            case R.id.tv_editbypass:
                Intent intent = new Intent(this,EditBypassActivity.class);
                startActivity(intent);
                break;
        }
    }
}
