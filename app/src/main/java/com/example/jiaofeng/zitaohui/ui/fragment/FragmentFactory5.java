package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.buyorder.AfterSaleFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.buyorder.NoEvaluateFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.buyorder.NoPayFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.buyorder.SendFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.buyorder.TakeFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FragmentFactory5 {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new NoPayFragment();
                    break;
                case 1:
                    baseFragment = new SendFragment();
                    break;
                case 2:
                    baseFragment = new TakeFragment();
                    break;
                case 3:
                    baseFragment = new NoEvaluateFragment();
                    break;
                case 4:
                    baseFragment = new AfterSaleFragment();
                    break;
                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
