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

public class MassActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_mass)
    LinearLayout mLlStatusActivityMass;
    @BindView(R.id.img_return_activity_mass)
    ImageView mImgReturnActivityMass;
    @BindView(R.id.tv_new)
    TextView mTvNew;
    @BindView(R.id.tv_number)
    TextView mTvNumber;
    @BindView(R.id.rv_activity_mass)
    RecyclerView mRvActivityMass;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivityMass.setLayoutManager(new LinearLayoutManager(this));
        mRvActivityMass.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_mass;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityMass;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_mass, R.id.tv_new})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_mass:
                finish();
                break;
            case R.id.tv_new:
                Intent intent = new Intent(this,ContactsActivity.class);
                startActivity(intent);
                break;
        }
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(MassActivity.this).inflate(R.layout.item_rv_mass, parent, false);
            AutoUtils.autoSize(view);
            return new MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(MyAdapter.ViewHolder holder, final int position) {

            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(MassActivity.this, "" + position, Toast.LENGTH_SHORT).show();
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
