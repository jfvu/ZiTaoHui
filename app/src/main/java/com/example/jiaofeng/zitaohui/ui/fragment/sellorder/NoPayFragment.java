package com.example.jiaofeng.zitaohui.ui.fragment.sellorder;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/20.
 */

public class NoPayFragment extends BaseFragment {
    @BindView(R.id.rv_nopay)
    RecyclerView mRvNopay;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.buy_nopay;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvNopay.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvNopay.setAdapter(new NoPayFragment.MyAdapter());

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
            holder.mButton.setText("提醒付款");
            holder.mLayout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
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

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_shop_rv_buy);
                mLayout1 = (RelativeLayout) itemView.findViewById(R.id.rl_commodity_rv_buy);
                mButton = (Button) itemView.findViewById(R.id.btn_pay_rv_buy);
            }
        }
    }
}
