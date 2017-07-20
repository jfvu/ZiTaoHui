package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.example.jiaofeng.zitaohui.utils.SelectReasonPop;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ApplyServeActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_applyserve)
    LinearLayout mLlStatusActivityApplyserve;
    @BindView(R.id.img_return_activity_applyserve)
    ImageView mImgReturnActivityApplyserve;
    @BindView(R.id.rl_menony_applyserve)
    RelativeLayout mRlMenonyApplyserve;
    @BindView(R.id.rl_thing_applyserve)
    RelativeLayout mRlThingApplyserve;
    @BindView(R.id.tv_reason_applyserve)
    TextView mTvReasonApplyserve;
    @BindView(R.id.tv_showreason_applyserve)
    TextView mTvShowreasonApplyserve;
    @BindView(R.id.img_pull_applysreve)
    ImageView mImgPullApplysreve;
    @BindView(R.id.rl_selectreason_applyserve)
    RelativeLayout mRlSelectreasonApplyserve;
    @BindView(R.id.fl_applyserve)
    FrameLayout mFlApplyserve;
    private SelectReasonPop mReasonPop;
    private boolean flag =true;
    private OneFragment mOneFragment;
    private TwoFragment mTwoFragment;
    private FragmentManager mManager;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mOneFragment = new OneFragment();
        mTwoFragment = new TwoFragment();
        mManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_applyserve,mOneFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_apply_serve;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityApplyserve;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_applyserve, R.id.rl_menony_applyserve, R.id.rl_thing_applyserve, R.id.rl_selectreason_applyserve})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_applyserve:
                finish();
                break;
            case R.id.rl_menony_applyserve:
                mTvShowreasonApplyserve.setText("我要退款");
                mTvShowreasonApplyserve.setTextColor(Color.parseColor("#121212"));
                FragmentTransaction fragmentTransaction1 = mManager.beginTransaction();
                fragmentTransaction1.replace(R.id.fl_applyserve,mOneFragment);
                fragmentTransaction1.commit();
                break;
            case R.id.rl_thing_applyserve:
                mTvShowreasonApplyserve.setText("我要退货");
                mTvShowreasonApplyserve.setTextColor(Color.parseColor("#121212"));

                FragmentTransaction fragmentTransaction = mManager.beginTransaction();
                fragmentTransaction.replace(R.id.fl_applyserve,mTwoFragment);
                fragmentTransaction.commit();
                break;
            case R.id.rl_selectreason_applyserve:
                if (mReasonPop == null){
                    mReasonPop = new SelectReasonPop(this,onClickListener);
                }
                if (!mReasonPop.isShowing()){

                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
                        mReasonPop.showAsDropDown(this.findViewById(R.id.rl_selectreason_applyserve),0,0,Gravity.CENTER);
                    }
                }else {

                    mReasonPop.dismiss();
                }
                break;
        }
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.rl_1_reason:
                    mReasonPop.dismiss();
                    mTvShowreasonApplyserve.setText("我要退款");
                    mTvShowreasonApplyserve.setTextColor(Color.parseColor("#121212"));
                    FragmentTransaction fragmentTransaction = mManager.beginTransaction();
                    fragmentTransaction.replace(R.id.fl_applyserve,mOneFragment);
                    fragmentTransaction.commit();
                    break;
                case R.id.rl_2_reason:
                    mReasonPop.dismiss();
                    mTvShowreasonApplyserve.setText("我要退货");
                    mTvShowreasonApplyserve.setTextColor(Color.parseColor("#121212"));
                    FragmentTransaction fragmentTransaction1 = mManager.beginTransaction();
                    fragmentTransaction1.replace(R.id.fl_applyserve,mTwoFragment);
                    fragmentTransaction1.commit();
                    break;

            }
        }
    };
    public static class OneFragment extends BaseFragment{
        @Override
        protected int getLayoutId() {
            return R.layout.fragment_one;
        }

        @Override
        protected void initData() {

        }

        @Override
        protected void initView() {

        }
    }
    public static class TwoFragment extends BaseFragment{

        @Override
        protected int getLayoutId() {
            return R.layout.fragment_two;
        }

        @Override
        protected void initData() {

        }

        @Override
        protected void initView() {

        }
    }
}
