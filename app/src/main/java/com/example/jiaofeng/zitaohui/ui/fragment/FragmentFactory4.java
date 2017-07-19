package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.myhistory.AttentionFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.myhistory.HistoryFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.myhistory.JoinFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.myhistory.LookFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FragmentFactory4 {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new AttentionFragment();
                    break;
                case 1:
                    baseFragment = new JoinFragment();
                    break;
                case 2:
                    baseFragment = new LookFragment();
                    break;
                case 3:
                    baseFragment = new HistoryFragment();
                    break;

                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
