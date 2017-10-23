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

public class EditMessageActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_editmessage)
    LinearLayout mLlStatusActivityEditmessage;
    @BindView(R.id.img_return_activity_editmessage)
    ImageView mImgReturnActivityEditmessage;
    @BindView(R.id.rl_finsh)
    RelativeLayout mRlFinsh;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_edit_message;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityEditmessage;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_editmessage, R.id.rl_finsh})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_editmessage:
                finish();
                break;
            case R.id.rl_finsh:
                finish();
                break;
        }
    }
}
