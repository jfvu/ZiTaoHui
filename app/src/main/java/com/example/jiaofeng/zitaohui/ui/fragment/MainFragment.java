package com.example.jiaofeng.zitaohui.ui.fragment;


import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter2;
import com.example.jiaofeng.zitaohui.ui.activity.SeachActivity;

import butterknife.BindView;
import butterknife.OnClick;
import butterknife.Unbinder;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class MainFragment extends BaseFragment {
    @BindView(R.id.img_seach_fragemnt_main)
    ImageView imgSeachFragemntMain;
    @BindView(R.id.tv_title_fragment_main)
    TextView tvTitleFragmentMain;
    @BindView(R.id.tl_fragment_main)
    TabLayout tlFragmentMain;
    @BindView(R.id.vp_fragment_main)
    ViewPager vpFragmentMain;
    Unbinder unbinder;
    private MyFregmentAdapter2 myFregmentAdapter2;
    private Intent mIntent;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        myFregmentAdapter2 = new MyFregmentAdapter2(getChildFragmentManager(),getActivity());
        vpFragmentMain.setAdapter(myFregmentAdapter2);
        tlFragmentMain.setupWithViewPager(vpFragmentMain);
        tlFragmentMain.getTabAt(0).setText("活动");
        tlFragmentMain.getTabAt(1).setText("关注");
        tlFragmentMain.getTabAt(2).setText("专场拍");
        tlFragmentMain.getTabAt(3).setText("私人订制");
        tlFragmentMain.getTabAt(4).setText("精选");
        tlFragmentMain.setTabGravity(TabLayout.GRAVITY_FILL);
        vpFragmentMain.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tlFragmentMain));
        tlFragmentMain.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(vpFragmentMain));

      /*  mIntent = getActivity().getIntent();
        int i = mIntent.getIntExtra("MainActivity",0);
        vpFragmentMain.setCurrentItem(i);*/
    }




    @OnClick(R.id.img_seach_fragemnt_main)
    public void onViewClicked() {
        startActivity(new Intent(getActivity(), SeachActivity.class));
    }

    @Override
    public void onResume() {
        super.onResume();
        if (FindFragment.flag == 4){
            vpFragmentMain.setCurrentItem(4);
        }
    }
}
