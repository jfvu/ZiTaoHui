package com.example.jiaofeng.zitaohui.ui.fragment.buyorder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.activity.EvaluateActivity;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/20.
 */

public class NoEvaluateFragment extends BaseFragment {
    @BindView(R.id.rv_noevaluate)
    RecyclerView mRvNoevaluate;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.buy_noevaluate;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvNoevaluate.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvNoevaluate.setAdapter(new MyAdapter());
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

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_nopay, parent, false);
            AutoUtils.autoSize(view);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mButton1.setVisibility(View.VISIBLE);
            holder.mButton1.setText("立即评价");
            holder.mButton.setText("申请售后");
            holder.mTextView.setText("待评价");
            holder.mLayout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
                }
            });
            holder.mButton1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getActivity(), EvaluateActivity.class));
                }
            });

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private RelativeLayout mLayout;
            private RelativeLayout mLayout1;
            private Button mButton;
            private Button mButton1;
            private TextView mTextView;

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_shop_rv_buy);
                mLayout1 = (RelativeLayout) itemView.findViewById(R.id.rl_commodity_rv_buy);
                mButton = (Button) itemView.findViewById(R.id.btn_pay_rv_buy);
                mButton1 = (Button) itemView.findViewById(R.id.btn_where_rv_buy);
                mTextView = (TextView) itemView.findViewById(R.id.tv_title_rv_buy);
            }
        }
    }
}
