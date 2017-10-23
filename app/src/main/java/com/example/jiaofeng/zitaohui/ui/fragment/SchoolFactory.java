package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.school.HelpFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.school.HundredFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.sellorder.AllFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.sellorder.FreezeFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.sellorder.NoPayFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.sellorder.SendFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.sellorder.TakeFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class SchoolFactory {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new HundredFragment();
                    break;
                case 1:
                    baseFragment = new HelpFragment();
                    break;

                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
