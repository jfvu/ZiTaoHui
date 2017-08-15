package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class SetPasswordActivity extends BaseActivity {

    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.rl_return)
    RelativeLayout mRlReturn;
    @BindView(R.id.btn_sure)
    Button mBtnSure;
    public final static int RESULT_CODE = 2;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_set_password;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatus;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.rl_return, R.id.btn_sure})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return:
                finish();
                break;
            case R.id.btn_sure:
                Intent intent = new Intent();
                setResult(RESULT_CODE, intent);
                finish();
                break;
        }
    }
}
