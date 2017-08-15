package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

import static com.example.jiaofeng.zitaohui.ui.activity.AddressActivity.RESULT_CODE;

public class PersonalDataActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_personaldata)
    LinearLayout mLlStatusActivityPersonaldata;
    @BindView(R.id.rl_return_activity_personaldata)
    RelativeLayout mRlReturnActivityPersonaldata;
    @BindView(R.id.ll_head)
    LinearLayout mLlHead;
    @BindView(R.id.ll_signature)
    LinearLayout mLlSignature;
    @BindView(R.id.ll_contacts)
    LinearLayout mLlContacts;
    @BindView(R.id.ll_wechat)
    LinearLayout mLlWechat;
    @BindView(R.id.ll_phone)
    LinearLayout mLlPhone;
    @BindView(R.id.ll_address)
    LinearLayout mLlAddress;
    @BindView(R.id.rl_out)
    RelativeLayout mRlOut;
    @BindView(R.id.tv_signature)
    TextView mTvSignature;
    private Intent mIntent;
    private final static int REQUEST_CODE=1;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_personal_data;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityPersonaldata;
    }

    @Override
    protected int color() {
        return Color.parseColor("#FF242424");
    }


    @OnClick({R.id.rl_return_activity_personaldata, R.id.ll_head, R.id.ll_signature, R.id.ll_contacts, R.id.ll_wechat, R.id.ll_phone, R.id.ll_address, R.id.rl_out})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_personaldata:
                finish();
                break;
            case R.id.ll_head:
                break;
            case R.id.ll_signature:
                mIntent=new Intent();
                mIntent.setClass(this, SignatureActivity.class);
                startActivityForResult(mIntent, REQUEST_CODE);
                break;
            case R.id.ll_contacts:
                break;
            case R.id.ll_wechat:
                break;
            case R.id.ll_phone:
                break;
            case R.id.ll_address:
                mIntent = new Intent(this,AddressActivity.class);
                startActivity(mIntent);
                break;
            case R.id.rl_out:
                mIntent = new Intent();
                mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK |
                        Intent.FLAG_ACTIVITY_CLEAR_TASK);
                mIntent.setClass(PersonalDataActivity.this, LoginActivity.class);
                startActivity(mIntent);
                break;
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQUEST_CODE)
        {
            if (resultCode== RESULT_CODE)
            {
                mTvSignature.setText(data.getStringExtra("SignatureActivity"));

            }
        }
    }
}
