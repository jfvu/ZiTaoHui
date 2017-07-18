package com.example.jiaofeng.zitaohui.ui.fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.MyFregmentAdapter3;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import q.rorbin.verticaltablayout.VerticalTabLayout;
import q.rorbin.verticaltablayout.adapter.TabAdapter;
import q.rorbin.verticaltablayout.widget.ITabView;
import q.rorbin.verticaltablayout.widget.TabView;


/**
 * Created by jiaofeng on 2017/7/16.
 */

public class ClassFragment extends BaseFragment {
    @BindView(R.id.et_input_fragment_class)
    EditText etInputFragmentClass;
    @BindView(R.id.tv_classname_fragment_class)
    TextView tvClassnameFragmentClass;
    Unbinder unbinder;
    @BindView(R.id.vtl_class_fragment_class)
    VerticalTabLayout mVtlClassFragmentClass;
    @BindView(R.id.yvp_fragment_class)
    fr.castorflex.android.verticalviewpager.VerticalViewPager mYvpFragmentClass;
    Unbinder unbinder1;



    private List<ClassName> classNames;
    private ArrayList<Integer> number = new ArrayList<>();
    private MyFregmentAdapter3 myFregmentAdapter3;

    private int flag = 0;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_class;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        classNames = new ArrayList<>();
        ClassName name = new ClassName("推荐分类");
        ClassName name1 = new ClassName("明星分类");
        ClassName name2 = new ClassName("其他分类");
        ClassName name3 = new ClassName("精选分类");
        ClassName name4 = new ClassName("热销分类");
        ClassName name5 = new ClassName("关注分类");
        classNames.add(name);
        classNames.add(name1);
        classNames.add(name2);
        classNames.add(name3);
        classNames.add(name4);
        classNames.add(name5);
        tvClassnameFragmentClass.setText(classNames.get(0).getName());

        number.add(24);
        number.add(8);
        number.add(33);
        number.add(55);
        number.add(66);
        number.add(77);
        myFregmentAdapter3 = new MyFregmentAdapter3(getChildFragmentManager(),getActivity());
        mYvpFragmentClass.setAdapter(myFregmentAdapter3);

        mVtlClassFragmentClass.addOnTabSelectedListener(new VerticalTabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabView tab, int position) {
                tvClassnameFragmentClass.setText(classNames.get(position).getName());
                mYvpFragmentClass.setCurrentItem(position);
            }

            @Override
            public void onTabReselected(TabView tab, int position) {

            }
        });
        mVtlClassFragmentClass.setTabAdapter(new TabAdapter() {
            @Override
            public int getCount() {
                return classNames.size();
            }

            @Override
            public ITabView.TabBadge getBadge(int position) {
                return null;
            }

            @Override
            public ITabView.TabIcon getIcon(int position) {
                return null;
            }

            @Override
            public ITabView.TabTitle getTitle(int position) {
                return new ITabView.TabTitle.Builder().setContent(classNames.get(position).getName()).setTextSize(14).
                        setTextColor(Color.parseColor("#242424"), Color.parseColor("#242424")).build();
            }

            @Override
            public int getBackground(int position) {
                return 0;
            }
        });

            mYvpFragmentClass.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
            mVtlClassFragmentClass.setTabSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }


    class ClassName {
        private String name;

        public ClassName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }




}
