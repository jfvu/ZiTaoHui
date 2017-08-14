package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class AddressActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_address)
    LinearLayout mLlStatusActivityAddress;
    @BindView(R.id.rl_return_activity_address)
    RelativeLayout mRlReturnActivityAddress;
    @BindView(R.id.rv_activity_address)
    RecyclerView mRvActivityAddress;
    @BindView(R.id.ll_add)
    LinearLayout mLlAdd;
    @BindView(R.id.tv_finish_activity_address)
    TextView mTvFinishActivityAddress;
    public final static int RESULT_CODE=2;
    private Intent mIntent;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivityAddress.setLayoutManager(new MyLayoutManager(this));
        mRvActivityAddress.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_address;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityAddress;
    }

    @Override
    protected int color() {
        return Color.parseColor("#FF242424");
    }


    @OnClick({R.id.rl_return_activity_address, R.id.ll_add,R.id.tv_finish_activity_address})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_address:
                finish();
                break;
            case R.id.ll_add:
                mIntent = new Intent(this,AddAddressActivity.class);
                mIntent.putExtra("AddAddressActivity","保存");
                startActivity(mIntent);
                break;
            case R.id.tv_finish_activity_address:
                Intent intent=new Intent();
                setResult(RESULT_CODE, intent);
                finish();
                break;
        }
    }



    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(AddressActivity.this).inflate(R.layout.item_rv_address, parent, false);
            AutoUtils.autoSize(view);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

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
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_edit);
            }
        }
    }

    class MyLayoutManager extends LinearLayoutManager {
        private boolean isScrollEnabled = true;

        public MyLayoutManager(Context context) {
            super(context);
        }

        public MyLayoutManager(Context context, int orientation, boolean reverseLayout) {
            super(context, orientation, reverseLayout);
        }

        public MyLayoutManager(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
            super(context, attrs, defStyleAttr, defStyleRes);
        }

        /**
         * 是否支持滑动
         *
         * @param flag
         */
        public void setScrollEnabled(boolean flag) {
            this.isScrollEnabled = flag;
        }

        @Override
        public boolean canScrollVertically() {
            //isScrollEnabled：recyclerview是否支持滑动
            //super.canScrollVertically()：是否为竖直方向滚动
            return isScrollEnabled && super.canScrollVertically();
        }
    }
}
