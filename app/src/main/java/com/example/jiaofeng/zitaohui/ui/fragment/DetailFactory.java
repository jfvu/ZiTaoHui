package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.detail.AllFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.CashFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.FreezeFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.SolveFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.WithdrawFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class DetailFactory {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new AllFragment();
                    break;
                case 1:
                    baseFragment = new FreezeFragment();
                    break;
                case 2:
                    baseFragment = new SolveFragment();
                    break;
                case 3:
                    baseFragment = new WithdrawFragment();
                    break;
                case 4:
                    baseFragment = new CashFragment();
                    break;

                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
