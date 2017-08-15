package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter6;

import butterknife.BindView;
import butterknife.OnClick;

public class SellOrderActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_sellorder)
    LinearLayout mLlStatusActivitySellorder;
    @BindView(R.id.img_return_activity_sellorder)
    ImageView mImgReturnActivitySellorder;
    @BindView(R.id.tl_activity_sellorder)
    TabLayout mTlActivitySellorder;
    @BindView(R.id.vp_activity_sellorder)
    ViewPager mVpActivitySellorder;
    private Intent mIntent;
    private MyFregmentAdapter6 myFregmentAdapter6;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mIntent = getIntent();
        int i = mIntent.getIntExtra("SellOrderActivity",6);
        int j = mIntent.getIntExtra("RechargeActivity",6);
        myFregmentAdapter6 = new MyFregmentAdapter6(getSupportFragmentManager(),SellOrderActivity.this);
        mVpActivitySellorder.setAdapter(myFregmentAdapter6);
        mTlActivitySellorder.setupWithViewPager(mVpActivitySellorder);

        mTlActivitySellorder.getTabAt(0).setText("全部");
        mTlActivitySellorder.getTabAt(1).setText("冻结款");
        mTlActivitySellorder.getTabAt(2).setText("待付款");
        mTlActivitySellorder.getTabAt(3).setText("未发货");
        mTlActivitySellorder.getTabAt(4).setText("待收货");
        mTlActivitySellorder.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivitySellorder.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivitySellorder));
        mTlActivitySellorder.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivitySellorder));
       if (i != 6){mVpActivitySellorder.setCurrentItem(i);}
        if (j != 6){
            mVpActivitySellorder.setCurrentItem(j);
        }
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_sell_order;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySellorder;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.img_return_activity_sellorder)
    public void onViewClicked() {
        finish();
    }
}
