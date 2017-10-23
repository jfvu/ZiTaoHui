package com.example.jiaofeng.zitaohui.ui.activity;

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

public class EditBypassActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_editbypass)
    LinearLayout mLlStatusActivityEditbypass;
    @BindView(R.id.img_return_activity_editbypass)
    ImageView mImgReturnActivityEditbypass;
    @BindView(R.id.tv_impower)
    TextView mTvImpower;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_edit_bypass;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityEditbypass;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_editbypass, R.id.tv_impower})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_editbypass:
                finish();
                break;
            case R.id.tv_impower:
                finish();
                break;
        }
    }
}
