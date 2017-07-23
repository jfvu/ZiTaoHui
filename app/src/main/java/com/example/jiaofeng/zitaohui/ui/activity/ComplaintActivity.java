package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.utils.ComplaintHintPop;

import butterknife.BindView;
import butterknife.OnClick;

public class ComplaintActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_complaint)
    LinearLayout mLlStatusActivityComplaint;
    @BindView(R.id.img_return_activity_complaint)
    ImageView mImgReturnActivityComplaint;
    @BindView(R.id.rl_class_activity_complaint)
    RelativeLayout mRlClassActivityComplaint;
    @BindView(R.id.rl_taboo_activity_complaint)
    RelativeLayout mRlTabooActivityComplaint;
    @BindView(R.id.rl_error_activity_complaint)
    RelativeLayout mRlErrorActivityComplaint;
    @BindView(R.id.rl_false_activity_complaint)
    RelativeLayout mRlFalseActivityComplaint;
    @BindView(R.id.rl_complaint_activity_complaint)
    RelativeLayout mRlComplaintActivityComplaint;
    @BindView(R.id.tv_record_activity_complaint)
    TextView mTvRecordActivityComplaint;
    private ComplaintHintPop mHintPop;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_complaint;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityComplaint;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_return_activity_complaint, R.id.rl_class_activity_complaint, R.id.rl_taboo_activity_complaint, R.id.rl_error_activity_complaint, R.id.rl_false_activity_complaint, R.id.rl_complaint_activity_complaint, R.id.tv_record_activity_complaint})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_complaint:
                finish();
                break;
            case R.id.rl_class_activity_complaint:
                ShowPop();
                break;
            case R.id.rl_taboo_activity_complaint:
                ShowPop();
                break;
            case R.id.rl_error_activity_complaint:
                ShowPop();
                break;
            case R.id.rl_false_activity_complaint:
                ShowPop();
                break;
            case R.id.rl_complaint_activity_complaint:
                ShowPop();
                break;
            case R.id.tv_record_activity_complaint:
                startActivity(new Intent(ComplaintActivity.this,ComplainsRecordsActivity.class));
                break;
        }
    }
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.tv_cancel_hint:
                    mHintPop.dismiss();
                    break;
                case R.id.tv_sure_hint:
                    mHintPop.dismiss();
                    startActivity(new Intent(ComplaintActivity.this,ComplaintsTypeActivity.class));
                    break;

            }
        }
    };
    private void ShowPop(){
        if (mHintPop == null){
            mHintPop = new ComplaintHintPop(getApplicationContext(),onClickListener);
        }
        mHintPop.showAtLocation(this.findViewById(R.id.rl_5), Gravity.CENTER,0,0);
    }
}
