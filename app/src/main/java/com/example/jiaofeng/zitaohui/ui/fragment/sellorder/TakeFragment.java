package com.example.jiaofeng.zitaohui.ui.fragment.sellorder;

import android.content.Intent;
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
import com.example.jiaofeng.zitaohui.ui.activity.LogisticsActivity;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/20.
 */

public class TakeFragment extends BaseFragment {
    @BindView(R.id.rv_take)
    RecyclerView mRvTake;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.buy_take;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvTake.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvTake.setAdapter(new MyAdapter());
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
            //holder.mButton1.setVisibility(View.VISIBLE);
            holder.mButton.setText("查看物流");
            holder.mTextView.setText("待收货");
            holder.mLayout1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
                }
            });
            holder.mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(getActivity(), LogisticsActivity.class));
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
