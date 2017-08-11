package com.example.jiaofeng.zitaohui.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class CrowdPop1 extends PopupWindow {
    RecyclerView mRvRightMenu;
    private Context context;
    private ArrayList<String> mList;
    private View view;
    private View.OnClickListener mOnClickListener;
    private int i;


    public CrowdPop1(Context context, View.OnClickListener onClickListener,ArrayList<String> mList,int i) {
        this.context = context;
        this.mOnClickListener = onClickListener;
        this.view = LayoutInflater.from(context).inflate(R.layout.crowd1, null);
        this.mList = mList;
        this.i = i;
        mRvRightMenu = (RecyclerView) view.findViewById(R.id.rv_crowd1);
        mRvRightMenu.setLayoutManager(new LinearLayoutManager(view.getContext()));
        mRvRightMenu.setAdapter(new MyAdapter());



        this.setOutsideTouchable(false);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.WRAP_CONTENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(true);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);


    }



     /*static class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
        private ArrayList<String> mList;
        private View mView;

         public MenuAdapter(ArrayList<String> list) {
             mList = list;
         }

         @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(mView.getContext()).inflate(R.layout.item_crowd1, parent, false);
            AutoUtils.autoSize(view1);

            return new ViewHolder(view1);
        }

        @Override
        public void onBindViewHolder(final ViewHolder holder, final int position) {
            holder.itemView.setTag(position);
          holder.mView.setText(mList.get(position));
            //holder.mView.setTag(position);
            holder.mView1.setVisibility(View.GONE);
            if (mOnClickListener != null){
                holder.mLayout.setOnClickListener(mOnClickListener);
            }

        }

        @Override
        public int getItemCount() {
            return mList.size();
        }



        class ViewHolder extends RecyclerView.ViewHolder {
            private TextView mView;
            private ImageView mView1;
            private RelativeLayout mLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (TextView) itemView.findViewById(R.id.tv_item_crowd1);
                mView1 = (ImageView) itemView.findViewById(R.id.img_yes_crowd1);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_crowd1);

            }
        }
    }*/


    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(view.getContext()).inflate(R.layout.item_crowd1, parent, false);
            AutoUtils.autoSize(view1);
            return new ViewHolder(view1);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mView.setText(mList.get(position));
            holder.mLayout.setTag(position);

            if (position == i){
                holder.mView1.setVisibility(View.VISIBLE);
                holder.mView.setTextColor(Color.parseColor("#242424"));
            }
            holder.mLayout.setOnClickListener(mOnClickListener);

        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private TextView mView;
            private ImageView mView1;
            private RelativeLayout mLayout;

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (TextView) itemView.findViewById(R.id.tv_item_crowd1);
                mView1 = (ImageView) itemView.findViewById(R.id.img_yes_crowd1);
                mLayout = (RelativeLayout) itemView.findViewById(R.id.rl_crowd1);

            }
        }
    }
}
