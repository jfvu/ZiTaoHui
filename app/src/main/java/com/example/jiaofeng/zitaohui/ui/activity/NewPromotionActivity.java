package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class NewPromotionActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_newpromotion)
    LinearLayout mLlStatusActivityNewpromotion;
    @BindView(R.id.img_return_activity_oneofclass)
    ImageView mImgReturnActivityOneofclass;
    @BindView(R.id.btn_sure_activity_newpromotion)
    Button mBtnSureActivityNewpromotion;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_new_promotion;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityNewpromotion;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }




    @OnClick({R.id.img_return_activity_oneofclass, R.id.btn_sure_activity_newpromotion})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_oneofclass:
                finish();
                break;
            case R.id.btn_sure_activity_newpromotion:
                finish();
                break;
        }
    }
}
