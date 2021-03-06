package com.example.jiaofeng.zitaohui.ui.fragment;

import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.activity.CrowdFundingActivity;
import com.example.jiaofeng.zitaohui.ui.activity.OptimalStoreActivity;
import com.example.jiaofeng.zitaohui.ui.activity.PickerActivity;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FindFragment extends BaseFragment {
    @BindView(R.id.tv_delicacy_fragment_find)
    TextView tvDelicacyFragmentFind;
    @BindView(R.id.rl_delicacy_fragment_find)
    RelativeLayout rlDelicacyFragmentFind;
    @BindView(R.id.tv_good_fragment_find)
    TextView tvGoodFragmentFind;
    @BindView(R.id.rl_good_fragment_find)
    RelativeLayout rlGoodFragmentFind;
    @BindView(R.id.tv_bug_fragment_find)
    TextView tvBugFragmentFind;
    @BindView(R.id.rl_bug_fragment_find)
    RelativeLayout rlBugFragmentFind;
    @BindView(R.id.tv_crowd_fragment_find)
    TextView tvCrowdFragmentFind;
    @BindView(R.id.rl_crowd_fragment_find)
    RelativeLayout rlCrowdFragmentFind;
    Unbinder unbinder;
    private Intent mIntent;
    public static int flag;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_find;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {

    }


    @OnClick({R.id.rl_delicacy_fragment_find, R.id.rl_good_fragment_find, R.id.rl_bug_fragment_find, R.id.rl_crowd_fragment_find})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.rl_delicacy_fragment_find:
              /*  mIntent = new Intent();
                mIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
                mIntent.setClass(getActivity(),MainActivity.class);
                mIntent.putExtra("MainActivity",4);
                startActivity(mIntent);*/
                flag = 4;
                ViewPager viewById = (ViewPager) getActivity().findViewById(R.id.vp_activity_main);
                viewById.setCurrentItem(0);

                break;
            case R.id.rl_good_fragment_find:
                startActivity(new Intent(getActivity(), OptimalStoreActivity.class));
                break;
            case R.id.rl_bug_fragment_find:
                startActivity(new Intent(getActivity(), PickerActivity.class));
                break;
            case R.id.rl_crowd_fragment_find:
                startActivity(new Intent(getActivity(), CrowdFundingActivity.class));
                break;
        }
    }
}
