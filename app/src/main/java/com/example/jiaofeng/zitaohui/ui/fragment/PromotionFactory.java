package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.detail.AllFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.CashFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.FreezeFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.SolveFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.WithdrawFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.promotion.NoValidFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.promotion.ValidFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class PromotionFactory {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new ValidFragment();
                    break;
                case 1:
                    baseFragment = new NoValidFragment();
                    break;


                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
