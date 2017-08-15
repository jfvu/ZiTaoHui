package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.DetailAdapter;

import butterknife.BindView;
import butterknife.OnClick;

public class DetailActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_detail)
    LinearLayout mLlStatusActivityDetail;
    @BindView(R.id.rl_return_activity_detail)
    RelativeLayout mRlReturnActivityDetail;
    @BindView(R.id.tl_activity_detail)
    TabLayout mTlActivityDetail;
    @BindView(R.id.vp_activity_detail)
    ViewPager mVpActivityDetail;
    private DetailAdapter mDetailAdapter;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mDetailAdapter = new DetailAdapter(getSupportFragmentManager(),getApplication());
        mVpActivityDetail.setAdapter(mDetailAdapter);
        mTlActivityDetail.setupWithViewPager(mVpActivityDetail);

        mTlActivityDetail.getTabAt(0).setText("全部");
        mTlActivityDetail.getTabAt(1).setText("冻结中");
        mTlActivityDetail.getTabAt(2).setText("已解冻");
        mTlActivityDetail.getTabAt(3).setText("已提现");
        mTlActivityDetail.getTabAt(4).setText("保证金");
        //tlActivityMain.setTabTextColors(Color.parseColor("#40242424"),Color.parseColor("#121212"));
        mTlActivityDetail.setTabGravity(TabLayout.GRAVITY_FILL);
        mVpActivityDetail.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(mTlActivityDetail));
        mTlActivityDetail.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mVpActivityDetail));
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_detail;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityDetail;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.rl_return_activity_detail)
    public void onViewClicked() {
        finish();
    }
}
