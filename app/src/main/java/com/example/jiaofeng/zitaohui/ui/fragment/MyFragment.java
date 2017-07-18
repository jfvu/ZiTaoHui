package com.example.jiaofeng.zitaohui.ui.fragment;


import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class MyFragment extends BaseFragment {
    @BindView(R.id.tv_title_fragment_my)
    TextView mTvTitleFragmentMy;
    @BindView(R.id.img_select_fragment_my)
    ImageView mImgSelectFragmentMy;
    @BindView(R.id.fragment_fragment_my)
    FrameLayout mFragmentFragmentMy;
    Unbinder unbinder;
    @BindView(R.id.ll_name_fragment_my)
    LinearLayout mLlNameFragmentMy;
    Unbinder unbinder1;
    private BuyerFragment mBuyerFragment;
    private SellerFragment mSellerFragment;
    private boolean flag = true;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        setDefaultFragment();
    }


    @OnClick(R.id.ll_name_fragment_my)
    public void onViewClicked() {
        FragmentManager Manager;
        FragmentTransaction Transaction;
        Manager = getFragmentManager();
        Transaction = Manager.beginTransaction();
        if (flag) {
            flag = false;
            if (mSellerFragment == null) {
                mSellerFragment = new SellerFragment();
                Transaction.replace(R.id.fragment_fragment_my, mSellerFragment);
                mTvTitleFragmentMy.setText("卖家中心");
            } else {
                Transaction.replace(R.id.fragment_fragment_my, mSellerFragment);
                mTvTitleFragmentMy.setText("卖家中心");
            }
        } else {
            flag = true;
            Transaction.replace(R.id.fragment_fragment_my, mBuyerFragment);
            mTvTitleFragmentMy.setText("买家中心");
        }
        Transaction.commit();
    }

    private void setDefaultFragment() {
        FragmentManager mManager;
        FragmentTransaction mTransaction;
        mManager = getFragmentManager();
        mTransaction = mManager.beginTransaction();
        mBuyerFragment = new BuyerFragment();
        mTransaction.replace(R.id.fragment_fragment_my, mBuyerFragment);
        mTransaction.commit();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }
}
