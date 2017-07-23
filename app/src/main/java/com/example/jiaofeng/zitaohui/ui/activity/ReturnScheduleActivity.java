package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ReturnScheduleActivity extends BaseActivity {

    @BindView(R.id.ll_status_activity_returnschedule)
    LinearLayout mLlStatusActivityReturnschedule;
    @BindView(R.id.img_return_activity_returnschedule)
    ImageView mImgReturnActivityReturnschedule;
    @BindView(R.id.rv_activity_returnschedule)
    RecyclerView mRvActivityReturnschedule;
    private List<ReturnScheduleActivity.Records> mList;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mList = new ArrayList<>();
        Resources resources = this.getResources();

        ReturnScheduleActivity.Records record1 = new ReturnScheduleActivity.Records(resources.getDrawable(R.drawable.shape_item_record2),"用户","提交物流单号","2017-07-04 17:20");
        ReturnScheduleActivity.Records record2 = new ReturnScheduleActivity.Records(resources.getDrawable(R.drawable.shape_item_record),"物流","XXX公司已收件","2017-07-04 17:20");
        ReturnScheduleActivity.Records record3 = new ReturnScheduleActivity.Records(resources.getDrawable(R.drawable.shape_item_record3),"卖家","签收人：已签收","2017-07-04 17:20");
        mList.add(record1);
        mList.add(record2);
        mList.add(record3);
        mRvActivityReturnschedule.setLayoutManager(new LinearLayoutManager(this));
        mRvActivityReturnschedule.setAdapter(new MyAdapter());
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_return_schedule;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityReturnschedule;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick(R.id.img_return_activity_returnschedule)
    public void onViewClicked() {
        finish();
    }
    class MyAdapter extends RecyclerView.Adapter<ReturnScheduleActivity.MyAdapter.ViewHolder> {

        @Override
        public ReturnScheduleActivity.MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(ReturnScheduleActivity.this).inflate(R.layout.item_rv_complainsrecords, parent, false);
            AutoUtils.autoSize(view);
            return new ReturnScheduleActivity.MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ReturnScheduleActivity.MyAdapter.ViewHolder holder, final int position) {
            holder.mView.setText(mList.get(position).getFlag());
            holder.mView.setBackground(mList.get(position).getBg());
            holder.mView1.setText(mList.get(position).getContent());
            holder.mView2.setText(mList.get(position).getTime());

        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private TextView mView,mView1,mView2;

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (TextView) itemView.findViewById(R.id.tv_flag_item_complainsrecords);
                mView1 = (TextView) itemView.findViewById(R.id.tv_content_item_complainsrecords);
                mView2 = (TextView) itemView.findViewById(R.id.tv_time_item_complainsrecords);
            }
        }
    }
    class Records{
        private Drawable bg;
        private String flag;
        private String content;
        private String time;

        public Drawable getBg() {
            return bg;
        }

        public String getFlag() {
            return flag;
        }

        public String getContent() {
            return content;
        }

        public String getTime() {
            return time;
        }

        public Records(Drawable bg, String flag, String content, String time) {
            this.bg = bg;
            this.flag = flag;
            this.content = content;
            this.time = time;
        }
    }
}
