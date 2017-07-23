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

public class OptimalStoreActivity extends BaseActivity {
    public static enum ITEM_TYPE {
        ITEM_TYPE_1,
        ITEM_TYPE_2
    }

    @BindView(R.id.ll_status_activity_optimalstore)
    LinearLayout mLlStatusActivityOptimalstore;
    @BindView(R.id.img_return_activity_optimalstore)
    ImageView mImgReturnActivityOptimalstore;
    @BindView(R.id.rv_activity_optimalstore)
    RecyclerView mRvActivityOptimalstore;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivityOptimalstore.setLayoutManager(new LinearLayoutManager(this));
        mRvActivityOptimalstore.setAdapter(new MyAdapter());

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_optimal_store;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityOptimalstore;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.img_return_activity_optimalstore)
    public void onViewClicked() {
        finish();
    }
    class MyAdapter extends RecyclerView.Adapter<OptimalStoreActivity.MyAdapter.ViewHolder> {


        @Override
        public OptimalStoreActivity.MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(OptimalStoreActivity.this).inflate(R.layout.item_rv_optimalstore1, parent, false);
            View view2 = LayoutInflater.from(OptimalStoreActivity.this).inflate(R.layout.item_rv_optimalstore2, parent, false);
            AutoUtils.autoSize(view1);
            AutoUtils.autoSize(view2);
            if (viewType == ITEM_TYPE.ITEM_TYPE_1.ordinal()){
                return new OptimalStoreActivity.MyAdapter.ViewHolder(view1);
            }else {
            return new OptimalStoreActivity.MyAdapter.ViewHolder(view2);}
        }

        @Override
        public void onBindViewHolder(OptimalStoreActivity.MyAdapter.ViewHolder holder, final int position) {
            if (position%3 == 0){
                holder.mView1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OptimalStoreActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                    }
                });
            }else {
                holder.mView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(OptimalStoreActivity.this, ""+position, Toast.LENGTH_SHORT).show();
                    }
                });
            }



        }

        @Override
        public int getItemViewType(int position) {
            if (position%3==0){
                return ITEM_TYPE.ITEM_TYPE_1.ordinal();
            }else {
                return ITEM_TYPE.ITEM_TYPE_2.ordinal();
            }
        }

        @Override
        public int getItemCount() {
            return 12;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private RelativeLayout mView1,mView2;


            public ViewHolder(View itemView) {
                super(itemView);
                mView1 = (RelativeLayout) itemView.findViewById(R.id.rl_item_1);
                mView2 = (RelativeLayout) itemView.findViewById(R.id.rl_item_2);

            }
        }
    }
}
