package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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
import com.example.jiaofeng.zitaohui.ui.fragment.buyorder.TakeFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.myhistory.HistoryFragment;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MessageActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_message)
    LinearLayout mLlStatusActivityMessage;
    @BindView(R.id.img_return_activity_message)
    ImageView mImgReturnActivityMessage;
    @BindView(R.id.rl_system_activity_message)
    RelativeLayout mRlSystemActivityMessage;
    @BindView(R.id.rv_activity_message)
    RecyclerView mRvActivityMessage;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivityMessage.setLayoutManager(new LinearLayoutManager(this));
        mRvActivityMessage.setAdapter(new MessageActivity.MyAdapter());

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_message;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityMessage;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_message, R.id.rl_system_activity_message})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_message:
                finish();
                break;
            case R.id.rl_system_activity_message:
                startActivity(new Intent(MessageActivity.this,SystemMessageActivity.class));
                break;
        }
    }
    class MyAdapter extends RecyclerView.Adapter<MessageActivity.MyAdapter.ViewHolder> {

        @Override
        public MessageActivity.MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MessageActivity.this).inflate(R.layout.item_rv_message, parent, false);
            AutoUtils.autoSize(view);
            return new MessageActivity.MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MessageActivity.MyAdapter.ViewHolder holder, final int position) {

            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MessageActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private RelativeLayout mLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_all_item_message);

            }
        }
    }
}
