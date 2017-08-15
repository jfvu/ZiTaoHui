package com.example.jiaofeng.zitaohui.ui.fragment.detail;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/8/15.
 */

public class FreezeFragment extends BaseFragment {
    @BindView(R.id.rv_fragment_freeze)
    RecyclerView mRvFragmentFreeze;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_freeze;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvFragmentFreeze.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvFragmentFreeze.setAdapter(new MyAdapter());
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_frament_freeze, parent, false);
            AutoUtils.autoSize(view);
            return new MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyAdapter.ViewHolder holder, final int position) {

            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private LinearLayout mLayout;


            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (LinearLayout) itemView.findViewById(R.id.ll_item_freeze);


            }
        }
    }
}
