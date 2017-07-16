package com.example.jiaofeng.zitaohui.ui.fragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FragmentFactory {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new MainFragment();
                    break;
                case 1:
                    baseFragment = new ClassFragment();
                    break;
                case 2:
                    baseFragment = new FindFragment();
                    break;
                case 3:
                    baseFragment = new MyFragment();
                    break;
                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
