package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.zcw.togglebutton.ToggleButton;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SetCenterActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_setcenter)
    LinearLayout mLlStatusActivitySetcenter;
    @BindView(R.id.img_return_activity_setcenter)
    ImageView mImgReturnActivitySetcenter;
    @BindView(R.id.rl_1)
    RelativeLayout mRl1;
    @BindView(R.id.rl_2)
    RelativeLayout mRl2;
    @BindView(R.id.rl_3)
    RelativeLayout mRl3;
    @BindView(R.id.rl_4)
    RelativeLayout mRl4;
    @BindView(R.id.rl_5)
    RelativeLayout mRl5;
    @BindView(R.id.rl_6)
    RelativeLayout mRl6;
    @BindView(R.id.rl_7)
    RelativeLayout mRl7;
    @BindView(R.id.rl_8)
    RelativeLayout mRl8;
    @BindView(R.id.rl_9)
    RelativeLayout mRl9;
    @BindView(R.id.rl_11)
    RelativeLayout mRl11;
    @BindView(R.id.rl_10)
    RelativeLayout mRl10;
    @BindView(R.id.tb_1)
    ToggleButton mTb1;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_set_center;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySetcenter;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_setcenter, R.id.rl_1, R.id.rl_2, R.id.rl_3, R.id.rl_4, R.id.rl_5, R.id.rl_6, R.id.rl_7, R.id.rl_8, R.id.rl_9, R.id.rl_11, R.id.rl_10})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_setcenter:
                finish();
                break;
            case R.id.rl_1:
                break;
            case R.id.rl_2:
                mIntent = new Intent(this,Approve1Activity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_3:
                mIntent = new Intent(this,CashActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_4:
                mIntent = new Intent(this,AuctionSetActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_5:
                mIntent = new Intent(this,SetAuctionActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_6:
                mIntent = new Intent(this,CouponsActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_7:
                mIntent = new Intent(this,DiscountActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_8:
                mIntent = new Intent(this,BidSetActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_9:
                mIntent = new Intent(this,LoctionActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_11:
                mIntent = new Intent(this,ShieldActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_10:

                mIntent = new Intent(this,FansActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
