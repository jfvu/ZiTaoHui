package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.gyf.barlibrary.ImmersionBar;

import butterknife.BindView;
import butterknife.OnClick;

public class FasterLoginActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_fasterlogin)
    LinearLayout mLlStatusActivityFasterlogin;
    @BindView(R.id.img_return_activity_fasterlogin)
    ImageView mImgReturnActivityFasterlogin;
    @BindView(R.id.tv_getcode_activity_fasterlogin)
    TextView mTvGetcodeActivityFasterlogin;
    @BindView(R.id.btn_sure_activity_fasterlogin)
    Button mBtnSureActivityFasterlogin;
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
        return R.layout.activity_faster_login;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityFasterlogin;
    }

    @Override
    protected int color() {
        return Color.parseColor("#ffffff");
    }


    @OnClick({R.id.img_return_activity_fasterlogin, R.id.tv_getcode_activity_fasterlogin, R.id.btn_sure_activity_fasterlogin})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_fasterlogin:
                finish();
                break;
            case R.id.tv_getcode_activity_fasterlogin:
                break;
            case R.id.btn_sure_activity_fasterlogin:
                mIntent = new Intent();
                mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                mIntent.setClass(this,MainActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
