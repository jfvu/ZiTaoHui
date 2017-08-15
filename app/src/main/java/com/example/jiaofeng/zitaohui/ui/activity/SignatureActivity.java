package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class SignatureActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_signature)
    LinearLayout mLlStatusActivitySignature;
    @BindView(R.id.rl_return_activity_signature)
    RelativeLayout mRlReturnActivitySignature;
    @BindView(R.id.tv_submit)
    TextView mTvSubmit;
    public final static int RESULT_CODE = 2;
    @BindView(R.id.et_input)
    EditText mEtInput;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_signature;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivitySignature;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.rl_return_activity_signature, R.id.tv_submit})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_return_activity_signature:
                finish();
                break;
            case R.id.tv_submit:
                if (mEtInput.getText().toString()!=null){
                Intent intent = new Intent();
                intent.putExtra("SignatureActivity",mEtInput.getText().toString() );
                setResult(RESULT_CODE, intent);
                finish();}
                else {
                    Toast.makeText(this, "请输入内容后提交", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

}
