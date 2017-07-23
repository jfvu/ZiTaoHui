package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ComplaintsTypeActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_complaintstype)
    LinearLayout mLlStatusActivityComplaintstype;
    @BindView(R.id.img_return_activity_complainstype)
    ImageView mImgReturnActivityComplainstype;
    @BindView(R.id.et_input_activity_complaintstype)
    EditText mEtInputActivityComplaintstype;
    @BindView(R.id.tv_showingput_activity_complaintstype)
    TextView mTvShowingputActivityComplaintstype;
    @BindView(R.id.img_add_activity_complaintstype)
    ImageView mImgAddActivityComplaintstype;
    @BindView(R.id.btn_sure_activity_complaintstype)
    Button mBtnSureActivityComplaintstype;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_complaints_type;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityComplaintstype;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_complainstype, R.id.img_add_activity_complaintstype, R.id.btn_sure_activity_complaintstype})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_complainstype:
                finish();
                break;
            case R.id.img_add_activity_complaintstype:
                break;
            case R.id.btn_sure_activity_complaintstype:
                startActivity(new Intent(ComplaintsTypeActivity.this,ComplaintSucceActivity.class));
                break;
        }
    }
}
