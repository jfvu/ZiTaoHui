package com.example.jiaofeng.zitaohui.ui.activity;

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

public class SystemMessageActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_systemmessage)
    LinearLayout mLlStatusActivitySystemmessage;
    @BindView(R.id.img_return_activity_systemmessage)
    ImageView mImgReturnActivitySystemmessage;
    @BindView(R.id.rv_activity_systemmessage)
    RecyclerView mRvActivitySystemmessage;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivitySystemmessage.setLayoutManager(new LinearLayoutManager(this));
        mRvActivitySystemmessage.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_system_message;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySystemmessage;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.img_return_activity_systemmessage)
    public void onViewClicked() {
        finish();
    }
    class MyAdapter extends RecyclerView.Adapter<SystemMessageActivity.MyAdapter.ViewHolder> {

        @Override
        public SystemMessageActivity.MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(SystemMessageActivity.this).inflate(R.layout.item_rv_systemmessage, parent, false);
            AutoUtils.autoSize(view);
            return new SystemMessageActivity.MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(SystemMessageActivity.MyAdapter.ViewHolder holder, final int position) {

            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(SystemMessageActivity.this, "" + position, Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private RelativeLayout mLayout;
            private TextView mView;

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_all_item_message);
                mView = (TextView) itemView.findViewById(R.id.tv_check_item_systemmessage);

            }
        }
    }
}
