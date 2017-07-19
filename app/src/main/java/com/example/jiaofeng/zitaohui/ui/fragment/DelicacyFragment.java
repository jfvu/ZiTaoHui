package com.example.jiaofeng.zitaohui.ui.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class DelicacyFragment extends BaseFragment {
    @BindView(R.id.rv_fragment_delicacy)
    RecyclerView mRvFragmentDelicacy;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_delicacy;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvFragmentDelicacy.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvFragmentDelicacy.setAdapter(new MyAdapter());
    }


    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_fragment_delicay, parent, false);
            AutoUtils.autoSize(view);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mLayout.setOnClickListener(new View.OnClickListener() {
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
            private ImageView mView;
            private TextView mView1;
            private TextView mView2;
            private Button mButton;
            private RelativeLayout mLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_fragment_delicaay);
            }
        }
    }
}
