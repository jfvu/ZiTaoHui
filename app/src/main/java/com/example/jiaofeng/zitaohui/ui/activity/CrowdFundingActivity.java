package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.utils.CrowdPop1;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CrowdFundingActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_crowdfunding)
    LinearLayout mLlStatusActivityCrowdfunding;
    @BindView(R.id.img_return_activity_crowdfunding)
    ImageView mImgReturnActivityCrowdfunding;
    @BindView(R.id.rb_1_activity_crowdfunding)
    CheckBox mRb1ActivityCrowdfunding;
    @BindView(R.id.rb_2_activity_crowdfunding)
    CheckBox mRb2ActivityCrowdfunding;
    @BindView(R.id.fl_activity_crowdfunding)
    FrameLayout mFlActivityCrowdfunding;
    @BindView(R.id.ll_activity_crowdfunding)
    LinearLayout mLlActivityCrowdfunding;
    private boolean flag1 = false;
    private boolean flag2 = false;
    private CrowdPop1 mPop1;

    @Override
    protected void initData() {

        mRb1ActivityCrowdfunding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mRb2ActivityCrowdfunding.setChecked(!isChecked);
                    if (mPop1 == null){
                    mPop1 = new CrowdPop1(CrowdFundingActivity.this, onClickListener);}
                    mPop1.showAsDropDown(mLlActivityCrowdfunding);
                    mPop1.setOnDismissListener(new PopupWindow.OnDismissListener() {
                        @Override
                        public void onDismiss() {
                            mRb1ActivityCrowdfunding.setChecked(false);
                        }
                    });
                    int i = 0;
                    for (int j = 0; j < CrowdPop1.mList.size(); j++) {
                       if( mRb1ActivityCrowdfunding.getText().toString().equals(CrowdPop1.mList.get(j))){
                            i = j;
                        }
                    }
                    RecyclerView view = (RecyclerView) mPop1.getContentView().findViewById(R.id.rv_crowd1);
                    RecyclerView.LayoutManager layoutManager = view.getLayoutManager();
                    TextView textView = (TextView) layoutManager.getChildAt(i).findViewById(R.id.tv_item_crowd1);
                    //ImageView imageView = (ImageView) mPop1.view.findViewById(R.id.rv_crowd1).findViewWithTag(i).findViewById(R.id.img_yes_crowd1);
                    textView.setTextColor(Color.parseColor("#242424"));
                    //imageView.setVisibility(View.VISIBLE);
                }else {
                    if (mPop1.isShowing()){
                        mPop1.dismiss();
                    }
                }
            }
        });
        mRb2ActivityCrowdfunding.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    mRb1ActivityCrowdfunding.setChecked(!isChecked);
                }
            }
        });

    }

    @Override
    protected void initView() {
        mRb1ActivityCrowdfunding.setChecked(flag1);
        mRb2ActivityCrowdfunding.setChecked(flag2);
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
    private CrowdPop1.OnItemClickListener onClickListener = new CrowdPop1.OnItemClickListener() {
        @Override
        public void onItemClick(View view, int position) {
            //TextView textView = (TextView) view.findViewWithTag(position);
            TextView textView1 = (TextView) view.findViewById(R.id.tv_item_crowd1);

            mRb1ActivityCrowdfunding.setText(textView1.getText().toString());
            mPop1.dismiss();
        }
    };
}
