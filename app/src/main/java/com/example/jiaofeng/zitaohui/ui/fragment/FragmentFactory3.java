package com.example.jiaofeng.zitaohui.ui.fragment;



/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FragmentFactory3 {
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = null;
        switch (pos) {
            case 0:
                baseFragment = ClassCenterFragment.newInstance(24);
                break;
            case 1:
                baseFragment = ClassCenterFragment.newInstance(8);
                break;
            case 2:
                baseFragment = ClassCenterFragment.newInstance(33);
                break;
            case 3:
                baseFragment = ClassCenterFragment.newInstance(55);
                break;
            case 4:
                baseFragment = ClassCenterFragment.newInstance(66);
                break;
            case 5:
                baseFragment = ClassCenterFragment.newInstance(88);
                break;
        }
        return baseFragment;
    }
}
