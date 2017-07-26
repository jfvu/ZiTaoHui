package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.gyf.barlibrary.ImmersionBar;

import butterknife.BindView;
import butterknife.OnClick;

public class LoginActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_login)
    LinearLayout mLlStatusActivityLogin;
    @BindView(R.id.btn_login_activity_login)
    Button mBtnLoginActivityLogin;
    @BindView(R.id.tv_register_activity_login)
    TextView mTvRegisterActivityLogin;
    @BindView(R.id.tv_sms_activity_login)
    TextView mTvSmsActivityLogin;
    @BindView(R.id.tv_weixin_activity_login)
    TextView mTvWeixinActivityLogin;
    @BindView(R.id.tv_forget_activity_login)
    TextView mTvForgetActivityLogin;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ImmersionBar.with(this).statusBarDarkFont(true).init();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityLogin;
    }

    @Override
    protected int color() {
        return Color.parseColor("#ffffff");
    }



    @OnClick({R.id.btn_login_activity_login, R.id.tv_register_activity_login, R.id.tv_sms_activity_login, R.id.tv_weixin_activity_login, R.id.tv_forget_activity_login})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_login_activity_login:
                mIntent = new Intent(this,MainActivity.class);
                startActivity(mIntent);
                finish();
                break;
            case R.id.tv_register_activity_login:
                mIntent = new Intent(this,RegisterActivity.class);
                startActivity(mIntent);
                break;
            case R.id.tv_sms_activity_login:
                mIntent = new Intent(this,FasterLoginActivity.class);
                startActivity(mIntent);

                break;
            case R.id.tv_weixin_activity_login:
                break;
            case R.id.tv_forget_activity_login:
                mIntent = new Intent(this,ForgetPasswordActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
