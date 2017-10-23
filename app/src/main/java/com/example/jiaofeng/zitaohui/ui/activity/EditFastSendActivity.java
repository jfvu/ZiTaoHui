package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.zcw.togglebutton.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class EditFastSendActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_editfastsend)
    LinearLayout mLlStatusActivityEditfastsend;
    @BindView(R.id.img_return_activity_editfastsend)
    ImageView mImgReturnActivityEditfastsend;
    @BindView(R.id.tv_save)
    TextView mTvSave;
    @BindView(R.id.rl_choose)
    RelativeLayout mRlChoose;
    @BindView(R.id.tb_1)
    ToggleButton mTb1;
    @BindView(R.id.tb_2)
    ToggleButton mTb2;
    @BindView(R.id.tb_3)
    ToggleButton mTb3;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_edit_fast_send;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityEditfastsend;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_editfastsend, R.id.tv_save, R.id.rl_choose})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_editfastsend:
                finish();
                break;
            case R.id.tv_save:
                finish();
                break;
            case R.id.rl_choose:
                break;
        }
    }
}
