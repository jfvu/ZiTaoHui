package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.ClipboardManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CustomerServicesActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_customerservices)
    LinearLayout mLlStatusActivityCustomerservices;
    @BindView(R.id.img_return_activity_customerservices)
    ImageView mImgReturnActivityCustomerservices;
    @BindView(R.id.rl_weixin_activity_customerservices)
    RelativeLayout mRlWeixinActivityCustomerservices;
    @BindView(R.id.rl_qq_activity_customerservices)
    RelativeLayout mRlQqActivityCustomerservices;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_customer_services;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityCustomerservices;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_customerservices, R.id.rl_weixin_activity_customerservices, R.id.rl_qq_activity_customerservices})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_customerservices:
                finish();
                break;
            case R.id.rl_weixin_activity_customerservices:
                ClipboardManager cm = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                // 将文本内容放到系统剪贴板里。
                cm.setText("微信账号");
                Toast.makeText(this, "已复制到粘贴板"+cm, Toast.LENGTH_SHORT).show();
                break;
            case R.id.rl_qq_activity_customerservices:
                ClipboardManager cm1 = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
                // 将文本内容放到系统剪贴板里。
                cm1.setText("微信账号");
                Toast.makeText(this, "已复制到粘贴板"+cm1, Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
