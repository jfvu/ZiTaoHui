package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ExpandActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_addressexpand)
    LinearLayout mLlStatusActivityAddressexpand;
    @BindView(R.id.img_return_activity_expand)
    ImageView mImgReturnActivityExpand;
    @BindView(R.id.ll_1)
    LinearLayout mLl1;
    @BindView(R.id.ll_2)
    LinearLayout mLl2;
    @BindView(R.id.ll_3)
    LinearLayout mLl3;
    @BindView(R.id.ll_4)
    LinearLayout mLl4;
    @BindView(R.id.ll_5)
    LinearLayout mLl5;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_expand;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityAddressexpand;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_expand, R.id.ll_1, R.id.ll_2, R.id.ll_3, R.id.ll_4, R.id.ll_5})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_expand:
                finish();
                break;
            case R.id.ll_1:
                break;
            case R.id.ll_2:
                break;
            case R.id.ll_3:
                mIntent = new Intent(this,BypassActivity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_4:
                break;
            case R.id.ll_5:
                mIntent = new Intent(this,FastSendActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
