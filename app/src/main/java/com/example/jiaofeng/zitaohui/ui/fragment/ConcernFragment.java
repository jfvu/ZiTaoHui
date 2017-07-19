package com.example.jiaofeng.zitaohui.ui.fragment;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.utils.SharePop;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class ConcernFragment extends BaseFragment {
    @BindView(R.id.rv_fragment_concer)
    RecyclerView mRvFragmentConcer;
    Unbinder unbinder;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_concern;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvFragmentConcer.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvFragmentConcer.setAdapter(new ConcernFragment.MyAdapter());
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
        private SharePop mSharePop;

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_fragment_concer, parent, false);
            AutoUtils.autoSize(view);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
                }
            });
            holder.lshare.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mSharePop = new SharePop(getActivity(),onClickListener);
                    mSharePop.showAtLocation(getActivity().findViewById(R.id.rl_main), Gravity.BOTTOM,0,0);
                }
            });
        }

        @Override
        public int getItemCount() {
            return 10;
        }



        class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView mView;
            private LinearLayout lheat;
            private LinearLayout lshare;
            private LinearLayout lcollect;
            private ImageView iheat;
            private ImageView ishare;
            private ImageView icollect;
            private TextView theat;
            private TextView tshare;
            private TextView tcollect;
            private Button mButton;

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (ImageView) itemView.findViewById(R.id.img_fragment_concern);
                lheat = (LinearLayout) itemView.findViewById(R.id.ll_heat_fragment_concern);
                lshare = (LinearLayout) itemView.findViewById(R.id.ll_share_fragment_concern);
                lcollect = (LinearLayout) itemView.findViewById(R.id.ll_collect_fragment_concern);
                iheat = (ImageView) itemView.findViewById(R.id.img_heat_fragment_concern);
                ishare = (ImageView) itemView.findViewById(R.id.img_share_fragment_concern);
                icollect = (ImageView) itemView.findViewById(R.id.img_collect_fragment_concern);
                theat = (TextView) itemView.findViewById(R.id.tv_number_heat);
                tshare = (TextView) itemView.findViewById(R.id.tv_number_share);
                tcollect = (TextView) itemView.findViewById(R.id.tv_number_collect);
            }
        }
        private View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.ll_qr_share:
                        mSharePop.dismiss();
                        break;
                    case R.id.ll_link_share:
                        mSharePop.dismiss();
                        break;
                    case R.id.btn_cancal_share:
                        mSharePop.dismiss();
                        break;
                }
            }
        };
    }
}
