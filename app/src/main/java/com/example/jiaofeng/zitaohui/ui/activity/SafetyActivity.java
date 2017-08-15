package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class SafetyActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_safety)
    LinearLayout mLlStatusActivitySafety;
    @BindView(R.id.rl_return_activity_safety)
    RelativeLayout mRlReturnActivitySafety;
    @BindView(R.id.ll_resetpassword)
    LinearLayout mLlResetpassword;
    @BindView(R.id.ll_forgetpassword)
    LinearLayout mLlForgetpassword;
    @BindView(R.id.ll_editdetail)
    LinearLayout mLlEditdetail;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_safety;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySafety;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.rl_return_activity_safety, R.id.ll_resetpassword, R.id.ll_forgetpassword, R.id.ll_editdetail})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_safety:
                finish();
                break;
            case R.id.ll_resetpassword:
                mIntent = new Intent(this,ResetPasswordActivity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_forgetpassword:
                mIntent = new Intent(this,ForgetPassword1Activity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_editdetail:
                mIntent = new Intent(this,ForgetPassword1Activity.class);
                mIntent.putExtra("ForgetPassword1Activity",0);
                startActivity(mIntent);
                break;
        }
    }

}
