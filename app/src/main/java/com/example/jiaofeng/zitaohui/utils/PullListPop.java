package com.example.jiaofeng.zitaohui.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class PullListPop extends PopupWindow {
    private Context context;
    private View view;
    private TextView tv1,tv2;
    private LinearLayout mLayout;


    public PullListPop(Context context, View.OnClickListener onClickListener){

        this.view = LayoutInflater.from(context).inflate(R.layout.list_pulldown,null);

        tv1 = (TextView) view.findViewById(R.id.tv_1);
        tv2 = (TextView) view.findViewById(R.id.tv_2);
        mLayout = (LinearLayout) view.findViewById(R.id.ll_status);
        ViewGroup.LayoutParams params = mLayout.getLayoutParams();
        params.height = 20;


        tv1.setOnClickListener(onClickListener);
        tv2.setOnClickListener(onClickListener);

        AutoUtils.autoSize(view);
        this.setOutsideTouchable(true);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(true);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);

    }
    /*public int getStatusBarHeight(){
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0){
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }*/
}
