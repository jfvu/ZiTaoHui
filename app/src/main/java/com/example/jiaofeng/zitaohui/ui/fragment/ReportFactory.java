package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.report.Lest30DayFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.report.LestMouthFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.report.LestWeekFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.report.ThisMouthFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.school.HelpFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.school.HundredFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class ReportFactory {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new LestWeekFragment();
                    break;
                case 1:
                    baseFragment = new LestMouthFragment();
                    break;
                case 2:
                    baseFragment = new ThisMouthFragment();
                    break;
                case 3:
                    baseFragment = new Lest30DayFragment();
                    break;

                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
