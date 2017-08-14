package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class CustomizeActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_customize)
    LinearLayout mLlStatusActivityCustomize;
    @BindView(R.id.rl_return_activity_customize)
    RelativeLayout mRlReturnActivityCustomize;
    @BindView(R.id.rb_1_activity_customize)
    RadioButton mRb1ActivityCustomize;
    @BindView(R.id.rb_2_activity_customize)
    RadioButton mRb2ActivityCustomize;
    @BindView(R.id.rv_activity_customize)
    RecyclerView mRvActivityCustomize;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRb1ActivityCustomize.setChecked(true);
        mRvActivityCustomize.setLayoutManager(new LinearLayoutManager(this));
        mRvActivityCustomize.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_customize;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityCustomize;
    }

    @Override
    protected int color() {
        return Color.parseColor("#FF242424");
    }



    @OnClick({R.id.rl_return_activity_customize, R.id.rb_1_activity_customize, R.id.rb_2_activity_customize})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_customize:
                finish();
                break;
            case R.id.rb_1_activity_customize:
                break;
            case R.id.rb_2_activity_customize:
                break;
        }
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(CustomizeActivity.this).inflate(R.layout.item_rv_customize, parent, false);
            AutoUtils.autoSize(view);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(CustomizeActivity.this,CustomizeSetActivity.class));
                }
            });

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private Button mButton;

            public ViewHolder(View itemView) {
                super(itemView);
                mButton = (Button) itemView.findViewById(R.id.btn_reserve_item_customize);
            }
        }
    }
}
