package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

import static com.example.jiaofeng.zitaohui.ui.activity.AddressActivity.RESULT_CODE;

public class CustomizeSetActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_customizeset)
    LinearLayout mLlStatusActivityCustomizeset;
    @BindView(R.id.rl_return_activity_customizeset)
    RelativeLayout mRlReturnActivityCustomizeset;
    @BindView(R.id.btn_sure_activity_customizeset)
    Button mBtnSureActivityCustomizeset;
    @BindView(R.id.tv_beginshow)
    TextView mTvBeginshow;
    @BindView(R.id.ll_nextshow)
    LinearLayout mLlNextshow;
    private boolean flag = false;
    private final static int REQUEST_CODE=1;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mTvBeginshow.setVisibility(View.VISIBLE);
        mLlNextshow.setVisibility(View.GONE);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_customize_set;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityCustomizeset;
    }

    @Override
    protected int color() {
        return Color.parseColor("#FF242424");
    }


    @OnClick({R.id.rl_return_activity_customizeset, R.id.btn_sure_activity_customizeset})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_customizeset:
                finish();
                break;
            case R.id.btn_sure_activity_customizeset:
                if (flag){
                    Intent intent=new Intent();
                    intent.setClass(this, AddressActivity.class);
                    startActivityForResult(intent, REQUEST_CODE);

                }else {
                flag = true;
                mTvBeginshow.setVisibility(View.GONE);
                mLlNextshow.setVisibility(View.VISIBLE);
                mBtnSureActivityCustomizeset.setText("下一步");}
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_CODE)
        {
            if (resultCode== AddressActivity.RESULT_CODE)
            {
                Toast.makeText(this, "123", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent();
                setResult(RESULT_CODE, intent);
                this.finish();

            }
        }
    }

}
