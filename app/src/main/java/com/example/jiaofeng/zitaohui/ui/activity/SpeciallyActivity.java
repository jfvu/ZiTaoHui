package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class SpeciallyActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_specially)
    LinearLayout mLlStatusActivitySpecially;
    @BindView(R.id.rl_return_activity_specially)
    RelativeLayout mRlReturnActivitySpecially;
    @BindView(R.id.img_specially)
    RelativeLayout mImgSpecially;
    @BindView(R.id.rv_activity_specially)
    RecyclerView mRvActivitySpecially;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivitySpecially.setLayoutManager(new LinearLayoutManager(this));
        mRvActivitySpecially.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_specially;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySpecially;
    }

    @Override
    protected int color() {
        return Color.parseColor("#FF5F3104");
    }



    @OnClick(R.id.rl_return_activity_specially)
    public void onViewClicked() {
        finish();
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private View mView;
        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            mView = LayoutInflater.from(SpeciallyActivity.this).inflate(R.layout.item_rv_specially, parent, false);
            AutoUtils.autoSize(mView);
            return new ViewHolder(mView);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            holder.mBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                    if (isChecked){
                        holder.mBox.setText("已提醒");
                    }
                }
            });

        }

        @Override
        public int getItemCount() {
            return 10;
        }

        class ViewHolder extends RecyclerView.ViewHolder {

            private LinearLayout mLayout;
            private CheckBox mBox;

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout = (LinearLayout) itemView.findViewById(R.id.ll_item_specially);
                mBox = (CheckBox) itemView.findViewById(R.id.cb_hint);
            }
        }
    }
}
