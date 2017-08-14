package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.utils.CrowdPop1;
import com.example.jiaofeng.zitaohui.utils.CrowdPop3;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.OnClick;

public class CrowdFundingActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_crowdfunding)
    LinearLayout mLlStatusActivityCrowdfunding;
    @BindView(R.id.img_return_activity_crowdfunding)
    ImageView mImgReturnActivityCrowdfunding;
    @BindView(R.id.rv_activity_crowdfunding)
    RecyclerView mFlActivityCrowdfunding;
    @BindView(R.id.ll_activity_crowdfunding)
    RadioGroup mLlActivityCrowdfunding;
    @BindView(R.id.rb_1_activity_crowdfunding)
    RadioButton mRb1ActivityCrowdfunding;
    @BindView(R.id.rb_2_activity_crowdfunding)
    RadioButton mRb2ActivityCrowdfunding;
    private boolean flag1 = false;

    private CrowdPop1 mPop1;
    private CrowdPop3 mPop3;
    private ArrayList<String> mList,mList1;
    private WindowManager.LayoutParams lp;
    private Window window;
    private boolean flag = false;
    private boolean soon;
    private MyAdapter mAdapter;

    @Override
    protected void initData() {


        mRb1ActivityCrowdfunding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    flag = true;
                }
            }
        });
        mRb1ActivityCrowdfunding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mRb1ActivityCrowdfunding.isChecked() && flag) {
                    openPop();
                }
            }
        });

        mRb2ActivityCrowdfunding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    flag1 = true;
                }
            }
        });
        mRb2ActivityCrowdfunding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mRb2ActivityCrowdfunding.isChecked() && flag1) {
                    openPop1();
                }
            }
        });

    }

    @Override
    protected void initView() {
        soon = true;
        mList = new ArrayList<>();
        mList.add("综合推荐");
        mList.add("最新上线");
        mList.add("金额最多");
        mList.add("支持最多");
        mList.add("即将结束");
        mList.add("即将开始");
        mRb1ActivityCrowdfunding.setChecked(true);
        flag = true;
        flag1 = true;
        mList1 = new ArrayList<>();
        mList1.add("全部类别");
        mList1.add("分类分类");
        mList1.add("分类分类");
        mList1.add("分类分类");
        mList1.add("分类分类");
        mList1.add("分类分类");
        mList1.add("分类分类");
        mList1.add("分类分类");
        mList1.add("分类分类");
        mFlActivityCrowdfunding.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new MyAdapter(soon);
        mFlActivityCrowdfunding.setAdapter(mAdapter);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_crowd_funding;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityCrowdfunding;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.img_return_activity_crowdfunding)
    public void onViewClicked() {
        finish();
    }

    /*private CrowdPop1.OnItemClickListener onClickListener = new CrowdPop1.OnItemClickListener() {
        @Override
        public void onItemClick(View view, int position) {
            //TextView textView = (TextView) view.findViewWithTag(position);
            TextView textView1 = (TextView) view.findViewById(R.id.tv_item_crowd1);

            mRb1ActivityCrowdfunding.setText(textView1.getText().toString());
            mPop1.dismiss();
        }
    };*/
    private void openPop() {
        int j = 0;
        for (int i = 0; i < mList.size(); i++) {
            if (mRb1ActivityCrowdfunding.getText().equals(mList.get(i))){
                j = i;
            }
        }

        mPop1 = new CrowdPop1(this, onClickListener, mList,j);
        window = this.getWindow();
        lp = this.getWindow()
                .getAttributes();
        lp.alpha = 0.4f;
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        this.getWindow().setAttributes(lp);
        mPop1.setTouchable(true);
        mPop1.setFocusable(true);
        mPop1.setBackgroundDrawable(new BitmapDrawable());
        mPop1.setOutsideTouchable(true);



        mPop1.showAsDropDown(mLlActivityCrowdfunding);
        mPop1.setOnDismissListener(new PopupWindow.OnDismissListener() {

            // 在dismiss中恢复透明度
            public void onDismiss() {

                lp.alpha = 1f;
                window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                window.setAttributes(lp);
            }
        });
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.rl_crowd1:
                    mPop1.dismiss();
                    mRb1ActivityCrowdfunding.setText(mList.get((Integer) v.getTag()));
                    if ((Integer)v.getTag()==4){
                        soon = false;
                        mAdapter.notifyDataSetChanged();

                    }else {
                        soon = true;
                        mAdapter.notifyDataSetChanged();
                    }

            }
        }
    };

    private void openPop1() {
        int j = 0;
        for (int i = 0; i < mList.size(); i++) {
            if (mRb2ActivityCrowdfunding.getText().equals(mList1.get(i))){
                j = i;
            }
        }

        mPop3 = new CrowdPop3(this, onClickListener1, mList1,j);
        window = this.getWindow();
        lp = this.getWindow()
                .getAttributes();
        lp.alpha = 0.4f;
        this.getWindow().addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
        this.getWindow().setAttributes(lp);
        mPop3.setTouchable(true);
        mPop3.setFocusable(true);
        mPop3.setBackgroundDrawable(new BitmapDrawable());
        mPop3.setOutsideTouchable(true);



        mPop3.showAsDropDown(mLlActivityCrowdfunding);
        mPop3.setOnDismissListener(new PopupWindow.OnDismissListener() {

            // 在dismiss中恢复透明度
            public void onDismiss() {

                lp.alpha = 1f;
                window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
                window.setAttributes(lp);
            }
        });
    }

    private View.OnClickListener onClickListener1 = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.cb_pop:
                    mPop3.dismiss();
                    mRb2ActivityCrowdfunding.setText(mList1.get((Integer) v.getTag()));

            }
        }
    };

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
        private boolean flag;

        public MyAdapter(boolean flag) {
            this.flag = flag;
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(CrowdFundingActivity.this).inflate(R.layout.item_rv_crowdfunding, parent, false);
            AutoUtils.autoSize(view1);
            return new ViewHolder(view1);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            if (flag){
                holder.mLayout1.setVisibility(View.VISIBLE);
                holder.mLayout2.setVisibility(View.GONE);
            }else {
                holder.mLayout2.setVisibility(View.VISIBLE);
                holder.mLayout1.setVisibility(View.GONE);
            }

        }

        @Override
        public int getItemCount() {
            return 8;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private LinearLayout mLayout1,mLayout2;

            public ViewHolder(View itemView) {
                super(itemView);
                mLayout1 = (LinearLayout) itemView.findViewById(R.id.ll_soon_item_rv_crowdfunding);
                mLayout2 = (LinearLayout) itemView.findViewById(R.id.ll_normal_item_rv_crowdfunding);


            }
        }
    }
}
