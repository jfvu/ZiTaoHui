package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class LogisticsActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_logistics)
    LinearLayout mLlStatusActivityLogistics;
    @BindView(R.id.img_return_activity_logistics)
    ImageView mImgReturnActivityLogistics;
    @BindView(R.id.rl_call_activity_logistics)
    RelativeLayout mRlCallActivityLogistics;
    @BindView(R.id.rl_message_activity_logistics)
    RelativeLayout mRlMessageActivityLogistics;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_logistics;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityLogistics;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_return_activity_logistics, R.id.rl_call_activity_logistics, R.id.rl_message_activity_logistics})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_logistics:
                finish();
                break;
            case R.id.rl_call_activity_logistics:
                break;
            case R.id.rl_message_activity_logistics:
                break;
        }
    }
}
