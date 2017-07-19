package com.example.jiaofeng.zitaohui.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.activity.MyHistoryActivity;
import com.example.jiaofeng.zitaohui.utils.SharePop;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class AuctionFragment extends BaseFragment {
    @BindView(R.id.btn_test)
    Button btnTest;
    Unbinder unbinder;
    private SharePop sharePop;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_auction;
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

    @OnClick(R.id.btn_test)
    public void onViewClicked() {
        /*sharePop = new SharePop(getActivity(),onClickListener);
        sharePop.showAtLocation(getActivity().findViewById(R.id.rl_rl), Gravity.BOTTOM,0,0);*/
        startActivity(new Intent(getActivity(), MyHistoryActivity.class));
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.ll_qr_share:
                    sharePop.dismiss();
                    break;
                case R.id.ll_link_share:
                    sharePop.dismiss();
                    break;
            }
        }
    };
}
