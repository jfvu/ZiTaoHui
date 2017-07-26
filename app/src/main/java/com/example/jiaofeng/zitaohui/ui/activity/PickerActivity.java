package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.Calendar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;

public class PickerActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_picker)
    LinearLayout mLlStatusActivityPicker;
    @BindView(R.id.img_return_activity_picker)
    ImageView mImgReturnActivityPicker;
    @BindView(R.id.tv_1_picker)
    TextView mTv1Picker;
    @BindView(R.id.tv_2_picker)
    TextView mTv2Picker;
    @BindView(R.id.tv_3_picker)
    TextView mTv3Picker;
    @BindView(R.id.tv_6_picker)
    TextView mTv6Picker;
    @BindView(R.id.tv_4_picker)
    TextView mTv4Picker;
    @BindView(R.id.tv_5_picker)
    TextView mTv5Picker;
    @BindView(R.id.fl_activity_picker)
    FrameLayout mFlActivityPicker;
    private OneFragment mOneFragment;
    private TwoFragment mTwoFragment;
    private FragmentManager mManager;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        Toast.makeText(this, "" + hour, Toast.LENGTH_SHORT).show();
        mTv3Picker.setText(hour + ":00");
        mTv2Picker.setText((hour - 1) + ":00");
        mTv4Picker.setText((hour + 1) + ":00");
        mTv1Picker.setText((hour - 2) + ":00");
        mTv5Picker.setText((hour + 2) + ":00");

        mOneFragment = new OneFragment();
        mTwoFragment = new TwoFragment();
        mManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = mManager.beginTransaction();
        fragmentTransaction.replace(R.id.fl_activity_picker, mOneFragment);
        fragmentTransaction.commit();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_picker;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityPicker;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_picker, R.id.tv_3_picker})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_picker:
                finish();
                break;
            case R.id.tv_3_picker:
                FragmentTransaction fragmentTransaction1 = mManager.beginTransaction();
                fragmentTransaction1.replace(R.id.fl_activity_picker,mTwoFragment);
                fragmentTransaction1.commit();
                break;
        }
    }


    public static class OneFragment extends BaseFragment {
        @BindView(R.id.tv_shoutime_activity_picker)
        TextView mTvShoutimeActivityPicker;
        @BindView(R.id.rv_fragment_this)
        RecyclerView mRvFragmentThis;
        Unbinder unbinder;

        /*private Handler mHandler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what) {
                    case 1:
                        long sysTime = System.currentTimeMillis();
                        CharSequence sysTimeStr = DateFormat.format("hh:mm:ss", sysTime);
                        tvTime.setText(sysTimeStr); //更新时间
　　　　　　      break;
　　　　　　　 default:
　　　　　　　　　 break;

                }
            }
        };*/
       /* private Handler mHandler = new Handler(){
            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                switch (msg.what){
                    case 1:
                        mTvShoutimeActivityPicker.setText("本场更新还剩 "+ ":" + ":");
                }
            }
        };
        class TimeThread extends Thread {
            @Override
            public void run() {
                do {
                    try {
                        Thread.sleep(100);
                        Message msg = new Message();
                        msg.what = 1;  //消息(一个整型值)
                        mHandler.sendMessage(msg);// 每隔1秒发送一个msg给mHandler
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } while (true);
            }
        }*/
        @Override
        protected int getLayoutId() {
            return R.layout.fragment_this;
        }

        @Override
        protected void initData() {

        }

        @Override
        protected void initView() {
            mRvFragmentThis.setLayoutManager(new GridLayoutManager(getActivity(), 2));
            mRvFragmentThis.setAdapter(new MyAdapter());
            //new TimeThread().start();


        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
            // TODO: inflate a fragment view
            View rootView = super.onCreateView(inflater, container, savedInstanceState);
            unbinder = ButterKnife.bind(this, rootView);
            return rootView;
        }

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            unbinder.unbind();
        }

        class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

            @Override
            public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_fragment_join, parent, false);
                AutoUtils.autoSize(view);
                return new ViewHolder(view);
            }

            @Override
            public void onBindViewHolder(ViewHolder holder, final int position) {
                holder.mLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
                    }
                });

            }

            @Override
            public int getItemCount() {
                return 10;
            }

            class ViewHolder extends RecyclerView.ViewHolder {
                private ImageView mView;
                private TextView mView1;
                private TextView mView2;
                private Button mButton;
                private RelativeLayout mLayout;

                public ViewHolder(View itemView) {
                    super(itemView);
                    mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_all_item_join);
                }
            }
        }


    }

    public static class TwoFragment extends BaseFragment {

        @Override
        protected int getLayoutId() {
            return R.layout.fragment_next;
        }

        @Override
        protected void initData() {

        }

        @Override
        protected void initView() {

        }
    }
}
