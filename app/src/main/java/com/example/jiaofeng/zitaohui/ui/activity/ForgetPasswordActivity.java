package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.gyf.barlibrary.ImmersionBar;

import butterknife.BindView;
import butterknife.OnClick;

public class ForgetPasswordActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_forgetpassword)
    LinearLayout mLlStatusActivityForgetpassword;
    @BindView(R.id.img_return_activity_forgetpassword)
    ImageView mImgReturnActivityForgetpassword;
    @BindView(R.id.rl_title_activity_forgetpassword)
    RelativeLayout mRlTitleActivityForgetpassword;
    @BindView(R.id.tv_getcode_activity_forgetpassword)
    TextView mTvGetcodeActivityForgetpassword;
    @BindView(R.id.btn_sure_activity_forgetpassword)
    Button mBtnSureActivityForgetpassword;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ImmersionBar.with(this).statusBarDarkFont(true).init();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_password;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityForgetpassword;
    }

    @Override
    protected int color() {
        return Color.parseColor("#ffffff");
    }



    @OnClick({R.id.img_return_activity_forgetpassword, R.id.tv_getcode_activity_forgetpassword, R.id.btn_sure_activity_forgetpassword})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_forgetpassword:
                finish();
                break;
            case R.id.tv_getcode_activity_forgetpassword:
                break;
            case R.id.btn_sure_activity_forgetpassword:
                finish();
                break;
        }
    }
}
