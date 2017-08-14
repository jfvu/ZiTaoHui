package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import butterknife.BindView;
import butterknife.OnClick;

public class SimilarActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_similar)
    LinearLayout mLlStatusActivitySimilar;
    @BindView(R.id.rl_return_activity_similar)
    RelativeLayout mRlReturnActivitySimilar;
    @BindView(R.id.rv_activity_similar)
    RecyclerView mRvActivitySimilar;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvActivitySimilar.setLayoutManager(new GridLayoutManager(this,2));
        mRvActivitySimilar.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_similar;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySimilar;
    }

    @Override
    protected int color() {
        return Color.parseColor("#FF5F3104");
    }



    @OnClick(R.id.rl_return_activity_similar)
    public void onViewClicked() {
        finish();
    }
    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {


        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(SimilarActivity.this).inflate(R.layout.item_rv_fragment_join, parent, false);
            AutoUtils.autoSize(view1);
            return new ViewHolder(view1);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(SimilarActivity.this, "" + position, Toast.LENGTH_SHORT).show();
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
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_all_item_join);

            }
        }
    }
}
