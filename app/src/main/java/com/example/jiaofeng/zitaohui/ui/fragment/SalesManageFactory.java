package com.example.jiaofeng.zitaohui.ui.fragment;

import com.example.jiaofeng.zitaohui.ui.fragment.detail.AllFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.CashFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.FreezeFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.SolveFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.detail.WithdrawFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.salesmanage.CutOutFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.salesmanage.DraftFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.salesmanage.FelidFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.salesmanage.RunOffFragment;
import com.example.jiaofeng.zitaohui.ui.fragment.salesmanage.SalesingFragment;

import java.util.HashMap;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class SalesManageFactory {
    public static HashMap<Integer,BaseFragment> fragmentHashMap = new HashMap<>();
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = fragmentHashMap.get(pos);
        if (baseFragment == null){
            switch (pos){
                case 0:
                    baseFragment = new SalesingFragment();
                    break;
                case 1:
                    baseFragment = new CutOutFragment();
                    break;
                case 2:
                    baseFragment = new RunOffFragment();
                    break;
                case 3:
                    baseFragment = new FelidFragment();
                    break;
                case 4:
                    baseFragment = new DraftFragment();
                    break;

                default:
                    break;
            }
            fragmentHashMap.put(pos,baseFragment);
        }
        return baseFragment;
    }
}
