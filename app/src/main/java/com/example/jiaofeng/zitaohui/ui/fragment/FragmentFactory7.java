package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.shop.ShopAllFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.shop.ShopMainFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.shop.ShopSoonFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FragmentFactory7 {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new ShopMainFragment();
                    break;
                case 1:
                    baseFragment = new ShopSoonFragment();
                    break;
                case 2:
                    baseFragment = new ShopAllFragment();
                    break;

                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
