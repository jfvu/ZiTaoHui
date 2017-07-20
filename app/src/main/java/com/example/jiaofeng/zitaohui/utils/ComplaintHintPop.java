package com.example.jiaofeng.zitaohui.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class ComplaintHintPop extends PopupWindow {
    private Context context;
    private View view;
    private TextView mCancel,mSure;

    public ComplaintHintPop(Context context, View.OnClickListener onClickListener){
        this.view = LayoutInflater.from(context).inflate(R.layout.complaint_hint,null);

        mCancel = (TextView) view.findViewById(R.id.tv_cancel_hint);
        mSure = (TextView) view.findViewById(R.id.tv_sure_hint);

        AutoUtils.autoSize(view);
        mCancel.setOnClickListener(onClickListener);
        mSure.setOnClickListener(onClickListener);

        this.setOutsideTouchable(false);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(false);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);

    }
}
