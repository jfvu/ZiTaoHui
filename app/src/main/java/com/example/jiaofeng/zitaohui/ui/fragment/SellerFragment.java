package com.example.jiaofeng.zitaohui.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.activity.ExpandActivity;
import com.example.jiaofeng.zitaohui.ui.activity.MassActivity;
import com.example.jiaofeng.zitaohui.ui.activity.MessageActivity;
import com.example.jiaofeng.zitaohui.ui.activity.PersonalDataActivity;
import com.example.jiaofeng.zitaohui.ui.activity.PromotionActivity;
import com.example.jiaofeng.zitaohui.ui.activity.RechargeActivity;
import com.example.jiaofeng.zitaohui.ui.activity.Report1Activity;
import com.example.jiaofeng.zitaohui.ui.activity.ReportActivity;
import com.example.jiaofeng.zitaohui.ui.activity.SalesManageActivity;
import com.example.jiaofeng.zitaohui.ui.activity.SellOrderActivity;
import com.example.jiaofeng.zitaohui.ui.activity.SetCenterActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/18.
 */

public class SellerFragment extends BaseFragment {
    @BindView(R.id.img_head_fragment_sell)
    ImageView mImgHeadFragmentSell;
    @BindView(R.id.rl_account_fragment_sell)
    RelativeLayout mRlAccountFragmentSell;
    @BindView(R.id.rl_message_fragment_sell)
    RelativeLayout mRlMessageFragmentSell;
    @BindView(R.id.rl_indent_fragment_sell)
    RelativeLayout mRlIndentFragmentSell;
    @BindView(R.id.ll_take_fragment_sell)
    LinearLayout mLlTakeFragmentSell;
    @BindView(R.id.ll_send_fragment_sell)
    LinearLayout mLlSendFragmentSell;
    @BindView(R.id.ll_nopay_fragment_sell)
    LinearLayout mLlNopayFragmentSell;
    @BindView(R.id.ll_aftersale_fragment_sell)
    LinearLayout mLlAftersaleFragmentSell;
    @BindView(R.id.ll_report_fragment_sell)
    LinearLayout mLlReportFragmentSell;
    @BindView(R.id.rl_manage_fragment_sell)
    RelativeLayout mRlManageFragmentSell;
    @BindView(R.id.rl_generalize_fragment_sell)
    RelativeLayout mRlGeneralizeFragmentSell;
    @BindView(R.id.rl_mese_fragment_sell)
    RelativeLayout mRlMeseFragmentSell;
    @BindView(R.id.rl_extend_fragment_sell)
    RelativeLayout mRlExtendFragmentSell;
    @BindView(R.id.rl_set_fragment_sell)
    RelativeLayout mRlSetFragmentSell;
    Unbinder unbinder;
    private Intent mIntent;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_seller;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder.unbind();
    }

    @OnClick({R.id.img_head_fragment_sell, R.id.rl_account_fragment_sell, R.id.rl_message_fragment_sell, R.id.rl_indent_fragment_sell, R.id.ll_take_fragment_sell, R.id.ll_send_fragment_sell, R.id.ll_nopay_fragment_sell, R.id.ll_aftersale_fragment_sell, R.id.ll_report_fragment_sell, R.id.rl_manage_fragment_sell, R.id.rl_generalize_fragment_sell, R.id.rl_mese_fragment_sell, R.id.rl_extend_fragment_sell, R.id.rl_set_fragment_sell})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_head_fragment_sell:
                mIntent = new Intent(getActivity(), PersonalDataActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_account_fragment_sell:
                mIntent = new Intent(getActivity(), RechargeActivity.class);
                mIntent.putExtra("RechargeActivity",1);
                startActivity(mIntent);
                break;
            case R.id.rl_message_fragment_sell:
                mIntent = new Intent(getActivity(), MessageActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_indent_fragment_sell:
                mIntent = new Intent(getActivity(), SellOrderActivity.class);
                mIntent.putExtra("SellOrderActivity",0);
                startActivity(mIntent);
                break;
            case R.id.ll_take_fragment_sell:
                mIntent = new Intent(getActivity(), SellOrderActivity.class);
                mIntent.putExtra("SellOrderActivity",4);
                startActivity(mIntent);
                break;
            case R.id.ll_send_fragment_sell:
                mIntent = new Intent(getActivity(), SellOrderActivity.class);
                mIntent.putExtra("SellOrderActivity",3);
                startActivity(mIntent);
                break;
            case R.id.ll_nopay_fragment_sell:
                mIntent = new Intent(getActivity(), SellOrderActivity.class);
                mIntent.putExtra("SellOrderActivity",2);
                startActivity(mIntent);
                break;
            case R.id.ll_aftersale_fragment_sell:

                break;
            case R.id.ll_report_fragment_sell:
                mIntent = new Intent(getActivity(), Report1Activity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_manage_fragment_sell:
                mIntent = new Intent(getActivity(), SalesManageActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_generalize_fragment_sell:
                mIntent = new Intent(getActivity(), PromotionActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_mese_fragment_sell:
                mIntent = new Intent(getActivity(), MassActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_extend_fragment_sell:
                mIntent = new Intent(getActivity(), ExpandActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_set_fragment_sell:
                mIntent = new Intent(getActivity(), SetCenterActivity.class);
                startActivity(mIntent);
                break;
        }
    }
}
