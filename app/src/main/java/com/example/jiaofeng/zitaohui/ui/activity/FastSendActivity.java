package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FastSendActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_fastsend)
    LinearLayout mLlStatusActivityFastsend;
    @BindView(R.id.img_return_activity_fastsend)
    ImageView mImgReturnActivityFastsend;
    @BindView(R.id.tv_set)
    TextView mTvSet;
    @BindView(R.id.tv_help)
    TextView mTvHelp;
    @BindView(R.id.rv_activity_fastsend)
    RecyclerView mRvActivityFastsend;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivityFastsend.setLayoutManager(new LinearLayoutManager(this));
        mRvActivityFastsend.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_fast_send;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityFastsend;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_return_activity_fastsend, R.id.tv_set, R.id.tv_help})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_fastsend:
                finish();
                break;
            case R.id.tv_set:
                Intent intent = new Intent(this,EditFastSendActivity.class);
                startActivity(intent);
                break;
            case R.id.tv_help:
                break;
        }
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(FastSendActivity.this).inflate(R.layout.item_rv_fastsend, parent, false);
            AutoUtils.autoSize(view1);
            return new MyAdapter.ViewHolder(view1);
        }

        @Override
        public void onBindViewHolder(MyAdapter.ViewHolder holder, final int position) {
            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(FastSendActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public int getItemCount() {
            return 8;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private RelativeLayout mLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_all_item_next);

            }
        }
    }
}
