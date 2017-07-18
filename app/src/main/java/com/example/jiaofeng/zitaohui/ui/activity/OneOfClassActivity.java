package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

import butterknife.BindView;
import butterknife.OnClick;

public class OneOfClassActivity extends BaseActivity {
    @BindView(R.id.ll_status_activity_oneofclass)
    LinearLayout mLlStatusActivityOneofclass;
    @BindView(R.id.img_return_activity_oneofclass)
    ImageView mImgReturnActivityOneofclass;
    @BindView(R.id.tv_classname_activity_oneofclass)
    TextView mTvClassnameActivityOneofclass;
    @BindView(R.id.rb_new)
    RadioButton mRbNew;
    @BindView(R.id.rb_soon)
    RadioButton mRbSoon;
    @BindView(R.id.rb_synthesize)
    RadioButton mRbSynthesize;
    @BindView(R.id.rb_least)
    RadioButton mRbLeast;
    @BindView(R.id.rg_activity_oneofclass)
    RadioGroup mRgActivityOneofclass;
    @BindView(R.id.fl_activity_oneofclass)
    FrameLayout mFlActivityOneofclass;

    private static final String KEY_FRAGMENT_TAG = "fragment_tag";
    private static final String FRAGMENT_TAG_NEW = "fragment_new";
    private static final String FRAGMENT_TAG_SOON = "fragment_soon";
    private static final String FRAGMENT_TAG_SYNTHESIZE = "fragment_synthesize";
    private static final String FRAGMENT_TAG_LEAST = "fragment_least";
    private Intent mIntent;
    private String[] mFragmentTags = new String[]{FRAGMENT_TAG_NEW, FRAGMENT_TAG_SOON, FRAGMENT_TAG_SYNTHESIZE,FRAGMENT_TAG_LEAST};
    private String mFragmentCurrentTag = FRAGMENT_TAG_NEW;

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mIntent = getIntent();
        mTvClassnameActivityOneofclass.setText(mIntent.getIntExtra("OneOfClassActivity", 0) + "分类");
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_one_of_class;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityOneofclass;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }



    @OnClick({R.id.img_return_activity_oneofclass, R.id.rb_new, R.id.rb_soon, R.id.rb_synthesize, R.id.rb_least})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_oneofclass:
                finish();
                break;
            case R.id.rb_new:
                break;
            case R.id.rb_soon:
                break;
            case R.id.rb_synthesize:
                break;
            case R.id.rb_least:
                break;
        }
    }
}
