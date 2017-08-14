package com.example.jiaofeng.zitaohui.ui.fragment;



/**
 * Created by jiaofeng on 2017/7/16.
 */

public class FragmentFactory3 {
    public static BaseFragment createFragment(int pos){
        BaseFragment baseFragment = null;
        switch (pos) {
            case 0:
                baseFragment = new ClassCenterFragment(24);
                break;
            case 1:
                baseFragment = new ClassCenterFragment(8);
                break;
            case 2:
                baseFragment = new ClassCenterFragment(33);
                break;
            case 3:
                baseFragment = new ClassCenterFragment(55);
                break;
            case 4:
                baseFragment = new ClassCenterFragment(66);
                break;
            case 5:
                baseFragment = new ClassCenterFragment(88);
                break;
        }
        return baseFragment;
    }
}
