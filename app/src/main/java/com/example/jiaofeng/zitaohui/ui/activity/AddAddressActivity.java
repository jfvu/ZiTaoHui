package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class AddAddressActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_addaddress)
    LinearLayout mLlStatusActivityAddaddress;
    @BindView(R.id.img_return_activity_addaddress)
    ImageView mImgReturnActivityAddaddress;
    @BindView(R.id.tv_send_activity_addaddress)
    TextView mTvSendActivityAddaddress;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_add_address;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityAddaddress;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_addaddress, R.id.tv_send_activity_addaddress})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_addaddress:
                finish();
                break;
            case R.id.tv_send_activity_addaddress:
                finish();
                break;
        }
    }
}
