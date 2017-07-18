package com.example.jiaofeng.zitaohui.ui.fragment;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/18.
 */

public class BuyerFragment extends BaseFragment {
    @BindView(R.id.img_head_fragment_buy)
    ImageView mImgHeadFragmentBuy;
    @BindView(R.id.rl_account_fragment_buy)
    RelativeLayout mRlAccountFragmentBuy;
    @BindView(R.id.rl_message_fragment_buy)
    RelativeLayout mRlMessageFragmentBuy;
    @BindView(R.id.rl_indent_fragment_buy)
    RelativeLayout mRlIndentFragmentBuy;
    @BindView(R.id.ll_take_fragment_buy)
    LinearLayout mLlTakeFragmentBuy;
    @BindView(R.id.ll_send_fragment_buy)
    LinearLayout mLlSendFragmentBuy;
    @BindView(R.id.ll_nopay_fragment_buy)
    LinearLayout mLlNopayFragmentBuy;
    @BindView(R.id.ll_noevaluate_fragment_buy)
    LinearLayout mLlNoevaluateFragmentBuy;
    @BindView(R.id.ll_aftersale_fragment_buy)
    LinearLayout mLlAftersaleFragmentBuy;
    @BindView(R.id.ll_new_fragment_buy)
    LinearLayout mLlNewFragmentBuy;
    @BindView(R.id.ll_record_fragment_buy)
    LinearLayout mLlRecordFragmentBuy;
    @BindView(R.id.ll_baby_fragment_buy)
    LinearLayout mLlBabyFragmentBuy;
    @BindView(R.id.ll_appreciate_fragment_buy)
    LinearLayout mLlAppreciateFragmentBuy;
    @BindView(R.id.ll_school_fragment_buy)
    LinearLayout mLlSchoolFragmentBuy;
    @BindView(R.id.ll_service_fragment_buy)
    LinearLayout mLlServiceFragmentBuy;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_buyer;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }



    @OnClick({R.id.img_head_fragment_buy, R.id.rl_account_fragment_buy, R.id.rl_message_fragment_buy, R.id.rl_indent_fragment_buy, R.id.ll_take_fragment_buy, R.id.ll_send_fragment_buy, R.id.ll_nopay_fragment_buy, R.id.ll_noevaluate_fragment_buy, R.id.ll_aftersale_fragment_buy, R.id.ll_new_fragment_buy, R.id.ll_record_fragment_buy, R.id.ll_baby_fragment_buy, R.id.ll_appreciate_fragment_buy, R.id.ll_school_fragment_buy, R.id.ll_service_fragment_buy})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_head_fragment_buy:
                break;
            case R.id.rl_account_fragment_buy:
                break;
            case R.id.rl_message_fragment_buy:
                break;
            case R.id.rl_indent_fragment_buy:
                break;
            case R.id.ll_take_fragment_buy:
                break;
            case R.id.ll_send_fragment_buy:
                break;
            case R.id.ll_nopay_fragment_buy:
                break;
            case R.id.ll_noevaluate_fragment_buy:
                break;
            case R.id.ll_aftersale_fragment_buy:
                break;
            case R.id.ll_new_fragment_buy:
                break;
            case R.id.ll_record_fragment_buy:
                break;
            case R.id.ll_baby_fragment_buy:
                break;
            case R.id.ll_appreciate_fragment_buy:
                break;
            case R.id.ll_school_fragment_buy:
                break;
            case R.id.ll_service_fragment_buy:
                break;
        }
    }
}
