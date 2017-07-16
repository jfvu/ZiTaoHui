package com.example.jiaofeng.zitaohui.ui.fragment;

import android.app.usage.UsageEvents;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FragmentFactory2 {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new EventFragment();
                    break;
                case 1:
                    baseFragment = new ConcernFragment();
                    break;
                case 2:
                    baseFragment = new AuctionFragment();
                    break;
                case 3:
                    baseFragment = new PrivateFragment();
                    break;
                case 4:
                    baseFragment = new DelicacyFragment();
                    break;
                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
