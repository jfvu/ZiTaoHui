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

public class RechargeActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_recharge)
    LinearLayout mLlStatusActivityRecharge;
    @BindView(R.id.rl_return_activity_recharge)
    RelativeLayout mRlReturnActivityRecharge;
    @BindView(R.id.tv_detail)
    TextView mTvDetail;
    @BindView(R.id.ll_freeze)
    LinearLayout mLlFreeze;
    @BindView(R.id.ll_unpaid)
    LinearLayout mLlUnpaid;
    @BindView(R.id.ll_nosend)
    LinearLayout mLlNosend;
    @BindView(R.id.ll_notake)
    LinearLayout mLlNotake;
    @BindView(R.id.btn_recharge)
    Button mBtnRecharge;
    @BindView(R.id.btn_withdraw)
    Button mBtnWithdraw;
    @BindView(R.id.ll_safety)
    LinearLayout mLlSafety;
    @BindView(R.id.ll_favorable)
    LinearLayout mLlFavorable;
    private Intent mIntent;
    private int i;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mIntent = getIntent();
        i = mIntent.getIntExtra("RechargeActivity",3);
        if (i == 0){}
        if (i == 1){}
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_recharge;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityRecharge;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.rl_return_activity_recharge, R.id.tv_detail, R.id.ll_freeze, R.id.ll_unpaid, R.id.ll_nosend, R.id.ll_notake, R.id.btn_recharge, R.id.btn_withdraw, R.id.ll_safety, R.id.ll_favorable})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_recharge:
                finish();
                break;
            case R.id.tv_detail:
                mIntent = new Intent(this,DetailActivity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_freeze:
                if (i ==1){
                    mIntent = new Intent(this,SellOrderActivity.class);
                    mIntent.putExtra("RechargeActivity",1);
                    startActivity(mIntent);
                }
                break;
            case R.id.ll_unpaid:
                if (i == 0 ){
                    mIntent = new Intent(this,BuyOrderActivity.class);
                    mIntent.putExtra("RechargeActivity",0);
                }else {
                    mIntent = new Intent(this,SellOrderActivity.class);
                    mIntent.putExtra("RechargeActivity",2);
                }

                startActivity(mIntent);
                break;
            case R.id.ll_nosend:
                if (i == 0){
                mIntent = new Intent(this,BuyOrderActivity.class);
                mIntent.putExtra("RechargeActivity",1);}
                else{
                    mIntent = new Intent(this,SellOrderActivity.class);
                    mIntent.putExtra("RechargeActivity",3);
                }
                startActivity(mIntent);
                break;
            case R.id.ll_notake:
                if (i == 0){
                mIntent = new Intent(this,BuyOrderActivity.class);
                mIntent.putExtra("RechargeActivity",2);}
                else {
                    mIntent = new Intent(this,SellOrderActivity.class);
                    mIntent.putExtra("RechargeActivity",4);
                }
                startActivity(mIntent);
                break;
            case R.id.btn_recharge:
                break;
            case R.id.btn_withdraw:
                break;
            case R.id.ll_safety:
                mIntent = new Intent(this,SafetyActivity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_favorable:
                mIntent = new Intent(this,CouponActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
