package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.fragment.oneofclass.LeastFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.oneofclass.NewFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.oneofclass.SoonFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.oneofclass.SynthesizeFragment;
import com.example.jiaofeng.zitaohui.utils.HistoryPop;
import com.example.jiaofeng.zitaohui.utils.PullListPop;

import java.lang.reflect.Method;

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
    @BindView(R.id.img_history_activity_oneofclass)
    ImageView mImgHistoryActivityOneofclass;
    private Intent mIntent;
    private String[] mFragmentTags = new String[]{FRAGMENT_TAG_NEW, FRAGMENT_TAG_SOON, FRAGMENT_TAG_SYNTHESIZE, FRAGMENT_TAG_LEAST};
    private String mFragmentCurrentTag = FRAGMENT_TAG_NEW;
    private LeastFragment mLeastFragment;
    private NewFragment mNewFragment;
    private SoonFragment mSoonFragment;
    private SynthesizeFragment mSynthesizeFragment;
    private PullListPop mPop;
    private HistoryPop mHistoryPop;

    @Override
    protected void init(Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            restoreFragments();
            mFragmentCurrentTag = savedInstanceState.getString(KEY_FRAGMENT_TAG);
        }
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRbNew.setChecked(true);
        mIntent = getIntent();
        mTvClassnameActivityOneofclass.setText(mIntent.getIntExtra("OneOfClassActivity", 0) + "分类");
        onTabSelect(mFragmentCurrentTag);

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


    @OnClick({R.id.img_return_activity_oneofclass, R.id.rb_new, R.id.rb_soon, R.id.rb_synthesize, R.id.rb_least, R.id.img_history_activity_oneofclass})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_oneofclass:
                finish();
                break;
            case R.id.rb_new:
                mFragmentCurrentTag = FRAGMENT_TAG_NEW;
                onTabSelect(mFragmentCurrentTag);
                break;
            case R.id.rb_soon:
                mFragmentCurrentTag = FRAGMENT_TAG_SOON;
                onTabSelect(mFragmentCurrentTag);
                break;
            case R.id.rb_synthesize:
                mFragmentCurrentTag = FRAGMENT_TAG_SYNTHESIZE;
                onTabSelect(mFragmentCurrentTag);
                break;
            case R.id.rb_least:
                //mFragmentCurrentTag = FRAGMENT_TAG_LEAST;
                if (mPop == null) {
                    mPop = new PullListPop(getBaseContext(), onClickListener);

                    mPop.showAtLocation(this.findViewById(R.id.rl_1), Gravity.TOP, 0, 0);
                } else {
                    mPop.dismiss();
                }
                break;
            case R.id.img_history_activity_oneofclass:
               /* SlidingMenu slidingMenu = new SlidingMenu(this);
                slidingMenu.setMode(SlidingMenu.RIGHT);
                slidingMenu.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);
                slidingMenu.setShadowWidthRes(R.dimen.shadow_width);
                slidingMenu.setShadowDrawable(R.color.colorAccent);
                slidingMenu.setBehindOffsetRes(R.dimen.slidingmenu_offset);
                slidingMenu.setFadeDegree(0.35f);
                slidingMenu.attachToActivity(this,SlidingMenu.SLIDING_CONTENT);
                slidingMenu.setMenu(R.layout.right_menu);*/
                if (mHistoryPop == null) {
                    mHistoryPop = new HistoryPop(getApplicationContext());
                }
                mHistoryPop.showAtLocation(this.findViewById(R.id.rl_title_activity_oneofclass), Gravity.RIGHT, 0, 0);
                break;
        }

    }

    /**
     * 恢复fragment
     */
    private void restoreFragments() {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        for (int i = 0; i < mFragmentTags.length; i++) {
            Fragment fragment = manager.findFragmentByTag(mFragmentTags[i]);
            if (fragment == null)
                return;
            if (fragment instanceof LeastFragment) {
                mLeastFragment = (LeastFragment) fragment;
            } else if (fragment instanceof NewFragment) {
                mNewFragment = (NewFragment) fragment;
            } else if (fragment instanceof SoonFragment) {
                mSoonFragment = (SoonFragment) fragment;
            } else if (fragment instanceof SynthesizeFragment) {
                mSynthesizeFragment = (SynthesizeFragment) fragment;
            }
            transaction.hide(fragment);
        }
        transaction.commit();
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        outState.putString(KEY_FRAGMENT_TAG, mFragmentCurrentTag);
        super.onSaveInstanceState(outState, outPersistentState);
    }

    /**
     * 先全部隐藏
     *
     * @param fragmentManager
     * @param transaction
     */
    private void hideFragments(FragmentManager fragmentManager, FragmentTransaction transaction) {
        for (int i = 0; i < mFragmentTags.length; i++) {
            Fragment fragment = fragmentManager.findFragmentByTag(mFragmentTags[i]);
            if (fragment != null && fragment.isVisible()) {
                transaction.hide(fragment);
            }
        }
    }

    private void selectedFragment(FragmentTransaction transaction, Fragment fragment, Class<?> clazz, String tag) {
        if (fragment == null) {
            try {
                Method newInstanceMethod = clazz.getDeclaredMethod("newInstance");
                fragment = (Fragment) newInstanceMethod.invoke(null);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
            transaction.add(R.id.fl_activity_oneofclass, fragment, tag);
        }
        transaction.show(fragment);
        transaction.commit();
    }

    public void onTabSelect(String tag) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        hideFragments(manager, transaction);
        if (tag == FRAGMENT_TAG_NEW) {
            selectedFragment(transaction, mNewFragment, NewFragment.class, tag);
            mRbNew.setChecked(true);
        } else if (tag == FRAGMENT_TAG_SOON) {
            selectedFragment(transaction, mSoonFragment, SoonFragment.class, tag);
            mRbSoon.setChecked(true);
        } else if (tag == FRAGMENT_TAG_SYNTHESIZE) {
            selectedFragment(transaction, mSynthesizeFragment, SynthesizeFragment.class, tag);
            mRbSynthesize.setChecked(true);
        } else if (tag == FRAGMENT_TAG_LEAST) {
            selectedFragment(transaction, mLeastFragment, LeastFragment.class, tag);
            mRbLeast.setChecked(true);
        }
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.ll_qr_share:
                    mPop.dismiss();
                    break;
                case R.id.ll_link_share:
                    mPop.dismiss();
                    break;
            }
        }
    };


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (mHistoryPop != null && mHistoryPop.isShowing()) {
            mHistoryPop.dismiss();
            mHistoryPop = null;
        }
        return true;
    }
}
