package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class ResetPasswordActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_resetpassword)
    LinearLayout mLlStatusActivityResetpassword;
    @BindView(R.id.rl_return_activity_resetpassword)
    RelativeLayout mRlReturnActivityResetpassword;
    @BindView(R.id.btn_sure)
    Button mBtnSure;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_reset_password;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityResetpassword;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.rl_return_activity_resetpassword, R.id.btn_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_resetpassword:
                finish();
                break;
            case R.id.btn_sure:
                finish();
                break;
        }
    }
}
