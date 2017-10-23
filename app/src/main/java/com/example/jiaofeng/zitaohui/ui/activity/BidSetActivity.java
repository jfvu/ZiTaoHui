package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.zcw.togglebutton.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BidSetActivity extends BaseActivity {


    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.img_return)
    ImageView mImgReturn;
    @BindView(R.id.tv_save)
    TextView mTvSave;
    @BindView(R.id.tb_1)
    ToggleButton mTb1;
    @BindView(R.id.tb_2)
    ToggleButton mTb2;
    @BindView(R.id.tb_3)
    ToggleButton mTb3;
    @BindView(R.id.tb_4)
    ToggleButton mTb4;
    @BindView(R.id.tb_5)
    ToggleButton mTb5;
    @BindView(R.id.tb_6)
    ToggleButton mTb6;
    @BindView(R.id.tb_7)
    ToggleButton mTb7;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_bid_set;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatus;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return, R.id.tv_save})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return:
                finish();
                break;
            case R.id.tv_save:
                finish();
                break;
        }
    }
}
