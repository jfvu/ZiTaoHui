package com.example.jiaofeng.zitaohui.ui.fragment.myhistory;

import android.support.v7.widget.GridLayoutManager;
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
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/19.
 */

public class AttentionFragment extends BaseFragment {
    @BindView(R.id.rv_fragment_attention)
    RecyclerView mRvFragmentAttention;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_attention;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvFragmentAttention.setLayoutManager(new GridLayoutManager(getActivity(),3));
        mRvFragmentAttention.setAdapter(new MyAdapter());
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_fragment_attention, parent, false);
            AutoUtils.autoSize(view);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
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
            private ImageView mView;
            private TextView mView1;
            private TextView mView2;
            private Button mButton;
            private RelativeLayout mLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (ImageView) itemView.findViewById(R.id.img_menu);
                mView1 = (TextView) itemView.findViewById(R.id.tv_content_menu);
                mView2 = (TextView) itemView.findViewById(R.id.tv_price_menu);
                mButton = (Button) itemView.findViewById(R.id.btn_find_menu);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_all_item_attention);
            }
        }
    }
}
