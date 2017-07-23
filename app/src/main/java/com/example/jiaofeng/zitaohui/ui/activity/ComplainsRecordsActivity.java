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

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ComplainsRecordsActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_complaintsrecords)
    LinearLayout mLlStatusActivityComplaintsrecords;
    @BindView(R.id.img_return_activity_complaintsrecords)
    ImageView mImgReturnActivityComplaintsrecords;
    @BindView(R.id.rv_activity_complaintsrecords)
    RecyclerView mRvActivityComplaintsrecords;
    private List<Records> mList;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mList = new ArrayList<>();
        Resources resources = this.getResources();

        Records record1 = new Records(resources.getDrawable(R.drawable.shape_item_record),"平台","已核实，该投诉有误！","2017-07-04 17:20");
        Records record2 = new Records(resources.getDrawable(R.drawable.shape_item_record),"平台","平台已受理","2017-07-04 17:20");
        Records record3 = new Records(resources.getDrawable(R.drawable.shape_item_record2),"用户","分类错误投诉","2017-07-04 17:20");
        mList.add(record1);
        mList.add(record2);
        mList.add(record3);
        mRvActivityComplaintsrecords.setLayoutManager(new LinearLayoutManager(this));
        mRvActivityComplaintsrecords.setAdapter(new ComplainsRecordsActivity.MyAdapter());

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_complains_records;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityComplaintsrecords;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick(R.id.img_return_activity_complaintsrecords)
    public void onViewClicked() {
        finish();
    }
    class MyAdapter extends RecyclerView.Adapter<ComplainsRecordsActivity.MyAdapter.ViewHolder> {

        @Override
        public ComplainsRecordsActivity.MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(ComplainsRecordsActivity.this).inflate(R.layout.item_rv_complainsrecords, parent, false);
            AutoUtils.autoSize(view);
            return new ComplainsRecordsActivity.MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ComplainsRecordsActivity.MyAdapter.ViewHolder holder, final int position) {
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
