package com.example.jiaofeng.zitaohui.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class SelectReasonPop extends PopupWindow {
    private Context context;
    private View view;
    private RelativeLayout mtv,mtv1;

    public SelectReasonPop(Context context, View.OnClickListener onClickListener){
        this.view = LayoutInflater.from(context).inflate(R.layout.select_reason,null);

        mtv = (RelativeLayout) view.findViewById(R.id.rl_1_reason);
        mtv1 = (RelativeLayout) view.findViewById(R.id.rl_2_reason);



        mtv.setOnClickListener(onClickListener);
        mtv1.setOnClickListener(onClickListener);


        this.setOutsideTouchable(false);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(true);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);

    }
}
