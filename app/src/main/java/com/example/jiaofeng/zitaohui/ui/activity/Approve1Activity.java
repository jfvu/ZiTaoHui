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

public class Approve1Activity extends BaseActivity {


    @BindView(R.id.ll_status_activity_approve)
    LinearLayout mLlStatusActivityApprove;
    @BindView(R.id.img_return)
    ImageView mImgReturn;
    @BindView(R.id.rl_1)
    RelativeLayout mRl1;
    @BindView(R.id.rl_2)
    RelativeLayout mRl2;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_approve1;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityApprove;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_return, R.id.rl_1, R.id.rl_2})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return:
                finish();
                break;
            case R.id.rl_1:
                mIntent = new Intent(this,Approve2Activity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_2:
                mIntent = new Intent(this,Approve3Activity.class);
                startActivity(mIntent);
                break;
        }
    }
}
