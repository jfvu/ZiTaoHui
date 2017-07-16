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

import com.example.jiaofeng.zitaohui.R;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class SharePop extends PopupWindow {
    private Context context;
    private View view;
    private LinearLayout tv1,tv2;
    private Button button;

    public SharePop(Context context,View.OnClickListener onClickListener){
        this.view = LayoutInflater.from(context).inflate(R.layout.share_share,null);

        tv1 = (LinearLayout) view.findViewById(R.id.ll_qr_share);
        tv2 = (LinearLayout) view.findViewById(R.id.ll_link_share);
        button = (Button) view.findViewById(R.id.btn_cancal_share);


        tv1.setOnClickListener(onClickListener);
        tv2.setOnClickListener(onClickListener);
        button.setOnClickListener(onClickListener);

        this.setOutsideTouchable(false);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(false);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);

    }
}
