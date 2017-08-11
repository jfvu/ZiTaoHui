package com.example.jiaofeng.zitaohui.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class CrowdPop3 extends PopupWindow {
    RecyclerView mRvRightMenu;
    private Context context;
    private ArrayList<String> mList;
    private View view;
    private View.OnClickListener mOnClickListener;
    private int i;


    public CrowdPop3(Context context, View.OnClickListener onClickListener, ArrayList<String> mList, int i) {
        this.context = context;
        this.mOnClickListener = onClickListener;
        this.view = LayoutInflater.from(context).inflate(R.layout.crowd3, null);
        this.mList = mList;
        this.i = i;
        mRvRightMenu = (RecyclerView) view.findViewById(R.id.rv_crowd3);
        mRvRightMenu.setLayoutManager(new GridLayoutManager(view.getContext(),4));
        mRvRightMenu.setAdapter(new MyAdapter());



        this.setOutsideTouchable(false);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.WRAP_CONTENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(true);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);


    }





    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(view.getContext()).inflate(R.layout.item_crowd3, parent, false);
            AutoUtils.autoSize(view1);
            return new ViewHolder(view1);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mBox.setText(mList.get(position));
            holder.mBox.setTag(position);

            if (position == i){
                holder.mBox.setChecked(true);

            }
            holder.mBox.setOnClickListener(mOnClickListener);

        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private CheckBox mBox;

            public ViewHolder(View itemView) {
                super(itemView);
                mBox = (CheckBox) itemView.findViewById(R.id.cb_pop);


            }
        }
    }
}
