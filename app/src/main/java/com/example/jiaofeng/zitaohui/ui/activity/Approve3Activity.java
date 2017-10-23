package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
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

public class Approve3Activity extends BaseActivity {


    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.img_return)
    ImageView mImgReturn;
    @BindView(R.id.rl_next)
    RelativeLayout mRlNext;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_approve3;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatus;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return, R.id.rl_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return:
                finish();
                break;
            case R.id.rl_next:
                Intent intent = new Intent(this,Approve5Activity.class);
                startActivity(intent);
                break;
        }
    }
}
