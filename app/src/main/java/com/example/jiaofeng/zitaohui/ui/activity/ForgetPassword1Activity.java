package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class ForgetPassword1Activity extends BaseActivity {


    @BindView(R.id.ll_status)
    LinearLayout mLlStatus;
    @BindView(R.id.rl_return)
    RelativeLayout mRlReturn;
    @BindView(R.id.btn_sure)
    Button mBtnSure;
    @BindView(R.id.tv_show)
    TextView mTvShow;
    private Intent mIntent;
    private final static int REQUEST_CODE = 1;
    private int i;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mIntent = getIntent();
        i = mIntent.getIntExtra("ForgetPassword1Activity", 6);
        if (i == 0) {
            mTvShow.setText("修改身份信息");
        }

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_forget_password1;
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
                if (i == 0){
                    finish();
                }else {
                mIntent = new Intent();
                mIntent.setClass(this, SetPasswordActivity.class);
                startActivityForResult(mIntent, REQUEST_CODE);}
                break;
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_CODE) {
            if (resultCode == SetPasswordActivity.RESULT_CODE) {
                finish();

            }
        }
    }

}
