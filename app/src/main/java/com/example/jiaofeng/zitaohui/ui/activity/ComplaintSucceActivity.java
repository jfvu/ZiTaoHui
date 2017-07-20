package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class ComplaintSucceActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_complaintsucce)
    LinearLayout mLlStatusActivityComplaintsucce;
    @BindView(R.id.img_return_activity_complaintsucce)
    ImageView mImgReturnActivityComplaintsucce;
    @BindView(R.id.btn_sure_activity_complaintsucce)
    Button mBtnSureActivityComplaintsucce;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_complaint_succe;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityComplaintsucce;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_complaintsucce, R.id.btn_sure_activity_complaintsucce})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_complaintsucce:
                finish();
                break;
            case R.id.btn_sure_activity_complaintsucce:
                finish();
                break;
        }
    }
}
