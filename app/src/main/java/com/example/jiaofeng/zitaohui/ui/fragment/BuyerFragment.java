package com.example.jiaofeng.zitaohui.ui.fragment;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.activity.BuyOrderActivity;
import com.example.jiaofeng.zitaohui.ui.activity.ComplaintActivity;
import com.example.jiaofeng.zitaohui.ui.activity.CustomerServicesActivity;
import com.example.jiaofeng.zitaohui.ui.activity.MessageActivity;
import com.example.jiaofeng.zitaohui.ui.activity.MyHistoryActivity;
import com.example.jiaofeng.zitaohui.ui.activity.PersonalDataActivity;
import com.example.jiaofeng.zitaohui.ui.activity.RechargeActivity;
import com.example.jiaofeng.zitaohui.ui.activity.SchoolActivity;

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
    private Intent mIntent;

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
                mIntent = new Intent(getActivity(), PersonalDataActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_account_fragment_buy:
                mIntent = new Intent(getActivity(), RechargeActivity.class);
                mIntent.putExtra("RechargeActivity",0);
                startActivity(mIntent);
                break;
            case R.id.rl_message_fragment_buy:
                mIntent = new Intent(getActivity(), MessageActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_indent_fragment_buy:
                mIntent = new Intent(getActivity(), BuyOrderActivity.class);
                mIntent.putExtra("BuyOrderActivity",0);
                startActivity(mIntent);
                break;
            case R.id.ll_take_fragment_buy:
                mIntent = new Intent(getActivity(), BuyOrderActivity.class);
                mIntent.putExtra("BuyOrderActivity",2);
                startActivity(mIntent);
                break;
            case R.id.ll_send_fragment_buy:
                mIntent = new Intent(getActivity(), BuyOrderActivity.class);
                mIntent.putExtra("BuyOrderActivity",1);
                startActivity(mIntent);
                break;
            case R.id.ll_nopay_fragment_buy:
                mIntent = new Intent(getActivity(), BuyOrderActivity.class);
                mIntent.putExtra("BuyOrderActivity",0);
                startActivity(mIntent);
                break;
            case R.id.ll_noevaluate_fragment_buy:
                mIntent = new Intent(getActivity(), BuyOrderActivity.class);
                mIntent.putExtra("BuyOrderActivity",3);
                startActivity(mIntent);
                break;
            case R.id.ll_aftersale_fragment_buy:
                mIntent = new Intent(getActivity(), BuyOrderActivity.class);
                mIntent.putExtra("BuyOrderActivity",4);
                startActivity(mIntent);
                break;
            case R.id.ll_new_fragment_buy:
                break;
            case R.id.ll_record_fragment_buy:
                mIntent = new Intent(getActivity(), MyHistoryActivity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_baby_fragment_buy:
                break;
            case R.id.ll_appreciate_fragment_buy:
                break;
            case R.id.ll_school_fragment_buy:
                mIntent = new Intent(getActivity(), SchoolActivity.class);
                startActivity(mIntent);
                break;
            case R.id.ll_service_fragment_buy:
                //mIntent = new Intent(getActivity(), ComplaintActivity.class);
                mIntent = new Intent(getActivity(), CustomerServicesActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
