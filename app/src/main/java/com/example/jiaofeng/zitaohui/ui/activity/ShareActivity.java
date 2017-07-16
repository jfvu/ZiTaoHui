package com.example.jiaofeng.zitaohui.ui.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ShareActivity extends BaseActivity {


    @BindView(R.id.btn_cancal_share)
    Button btnCancalShare;
    @BindView(R.id.ll_qr_share)
    LinearLayout llQrShare;
    @BindView(R.id.ll_link_share)
    LinearLayout llLinkShare;
    @BindView(R.id.ll_status_share)
    LinearLayout llStatusShare;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }

    @Override
    protected int getLayoutId() {
        return R.layout.share_share;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return llStatusShare;
    }

    @Override
    protected int color() {
        return Color.parseColor("#e6121212");
    }


    @OnClick({R.id.btn_cancal_share, R.id.ll_qr_share, R.id.ll_link_share})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_cancal_share:
                finish();
                break;
            case R.id.ll_qr_share:
                Toast.makeText(this, "二维码分享", Toast.LENGTH_SHORT).show();
                break;
            case R.id.ll_link_share:
                Toast.makeText(this, "链接分享", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }
}
