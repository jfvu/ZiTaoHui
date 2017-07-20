package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class EvaluateActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_evaluate)
    LinearLayout mLlStatusActivityEvaluate;
    @BindView(R.id.img_return_activity_evaluate)
    ImageView mImgReturnActivityEvaluate;
    @BindView(R.id.img_add_evaluate)
    ImageView mImgAddEvaluate;
    @BindView(R.id.img_star1)
    ImageView mImgStar1;
    @BindView(R.id.img_star2)
    ImageView mImgStar2;
    @BindView(R.id.img_star3)
    ImageView mImgStar3;
    @BindView(R.id.img_star4)
    ImageView mImgStar4;
    @BindView(R.id.img_star5)
    ImageView mImgStar5;
    @BindView(R.id.tv_show_star)
    TextView mTvShowStar;
    @BindView(R.id.btn_sure_evaluate)
    Button mBtnSureEvaluate;
    private boolean ms1,ms2,ms3,ms4,ms5 = false;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_evaluate;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityEvaluate;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_add_evaluate, R.id.img_star1, R.id.img_star2, R.id.img_star3, R.id.img_star4, R.id.img_star5, R.id.btn_sure_evaluate,R.id.img_return_activity_evaluate})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_evaluate:
                finish();
                break;
            case R.id.img_add_evaluate:
                break;
            case R.id.img_star1:
                if (!ms1){
                    ms1 = true;
                    ms2 = false;
                    ms3 = false;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.stared);
                    mImgStar2.setImageResource(R.drawable.star);
                    mImgStar3.setImageResource(R.drawable.star);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("1分");
                }
                else if (ms1){
                    ms1 = false;
                    ms2 = false;
                    ms3 = false;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.star);
                    mImgStar2.setImageResource(R.drawable.star);
                    mImgStar3.setImageResource(R.drawable.star);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("0分");
                }

                break;
            case R.id.img_star2:
                if (!ms2){
                    ms1 = true;
                    ms2 = true;
                    ms3 = false;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.stared);
                    mImgStar2.setImageResource(R.drawable.stared);
                    mImgStar3.setImageResource(R.drawable.star);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("2分");

                }else if (ms2){
                    ms1 = false;
                    ms2 = false;
                    ms3 = false;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.star);
                    mImgStar2.setImageResource(R.drawable.star);
                    mImgStar3.setImageResource(R.drawable.star);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("0分");
                }

                break;
            case R.id.img_star3:
                if (!ms3){
                    ms1 = true;
                    ms2 = true;
                    ms3 = true;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.stared);
                    mImgStar2.setImageResource(R.drawable.stared);
                    mImgStar3.setImageResource(R.drawable.stared);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("3分");
                }
                else if (ms3){
                    ms1 = false;
                    ms2 = false;
                    ms3 = false;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.star);
                    mImgStar2.setImageResource(R.drawable.star);
                    mImgStar3.setImageResource(R.drawable.star);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("0分");
                }

                break;
            case R.id.img_star4:
                if (!ms4){
                    ms1 = true;
                    ms2 = true;
                    ms3 = true;
                    ms4 = true;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.stared);
                    mImgStar2.setImageResource(R.drawable.stared);
                    mImgStar3.setImageResource(R.drawable.stared);
                    mImgStar4.setImageResource(R.drawable.stared);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("4分");
                }
                else if (ms4){
                    ms1 = false;
                    ms2 = false;
                    ms3 = false;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.star);
                    mImgStar2.setImageResource(R.drawable.star);
                    mImgStar3.setImageResource(R.drawable.star);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("0分");
                }

                break;
            case R.id.img_star5:
                if (!ms5){
                    ms1 = true;
                    ms2 = true;
                    ms3 = true;
                    ms4 = true;
                    ms5 = true;
                    mImgStar1.setImageResource(R.drawable.stared);
                    mImgStar2.setImageResource(R.drawable.stared);
                    mImgStar3.setImageResource(R.drawable.stared);
                    mImgStar4.setImageResource(R.drawable.stared);
                    mImgStar5.setImageResource(R.drawable.stared);
                    mTvShowStar.setText("5分");
                }
                else if (ms5){
                    ms1 = false;
                    ms2 = false;
                    ms3 = false;
                    ms4 = false;
                    ms5 = false;
                    mImgStar1.setImageResource(R.drawable.star);
                    mImgStar2.setImageResource(R.drawable.star);
                    mImgStar3.setImageResource(R.drawable.star);
                    mImgStar4.setImageResource(R.drawable.star);
                    mImgStar5.setImageResource(R.drawable.star);
                    mTvShowStar.setText("0分");
                }

                break;
            case R.id.btn_sure_evaluate:
                finish();
                break;
        }
    }

}
