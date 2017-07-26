package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.gyf.barlibrary.ImmersionBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class RegisterActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_register)
    LinearLayout mLlStatusActivityRegister;
    @BindView(R.id.img_return_activity_register)
    ImageView mImgReturnActivityRegister;
    @BindView(R.id.tv_getcode_activity_register)
    TextView mTvGetcodeActivityRegister;
    @BindView(R.id.btn_sure_activity_register)
    Button mBtnSureActivityRegister;
    @BindView(R.id.tv_return_activity_register)
    TextView mTvReturnActivityRegister;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        ImmersionBar.with(this).statusBarDarkFont(true).init();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_register;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityRegister;
    }

    @Override
    protected int color() {
        return Color.parseColor("#ffffff");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    @OnClick({R.id.img_return_activity_register, R.id.tv_getcode_activity_register, R.id.btn_sure_activity_register, R.id.tv_return_activity_register})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_register:
                finish();
                break;
            case R.id.tv_getcode_activity_register:
                break;
            case R.id.btn_sure_activity_register:
                finish();
                break;
            case R.id.tv_return_activity_register:
                finish();
                break;
        }
    }
}
