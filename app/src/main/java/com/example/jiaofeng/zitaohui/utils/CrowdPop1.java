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
import java.util.List;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class CrowdPop1 extends PopupWindow {
    RecyclerView mRvRightMenu;
    private Context context;
    public static List<String> mList;
    public View view;
    public static MenuAdapter adapter;
    public OnItemClickListener mOnItemClickListener;
    public interface OnItemClickListener extends MenuAdapter.OnItemClickListener {
        void onItemClick(View view,int position);
    }

    public CrowdPop1(Context context,OnItemClickListener mOnItemClickListener) {
        this.context = context;
        this.mOnItemClickListener = mOnItemClickListener;
        this.view = LayoutInflater.from(context).inflate(R.layout.crowd1, null);
        mRvRightMenu = (RecyclerView) view.findViewById(R.id.rv_crowd1);
        mList = new ArrayList<>();
        mList.add("综合推荐");
        mList.add("最新上线");
        mList.add("金额最多");
        mList.add("支持最多");
        mList.add("即将结束");
        mList.add("即将开始");





        this.setOutsideTouchable(false);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(true);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);
        adapter = new MenuAdapter(mList,view);

        mRvRightMenu.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
        mRvRightMenu.setAdapter(adapter);
        //adapter.setOnItemClickListener(mOnItemClickListener);
        adapter.setOnItemClickListener(mOnItemClickListener);
    }



     static class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
        private List<String> mList;
        private View mView;
         private OnItemClickListener mOnItemClickListener1;



         public interface OnItemClickListener{
             void onItemClick(View view,int position);
         }
         public void setOnItemClickListener(OnItemClickListener mOnItemClickListener){
             this.mOnItemClickListener1 = mOnItemClickListener;
         }

        public MenuAdapter(List<String> list, View view) {
            mList = list;
            mView = view;
            //mOnItemClickListener = onItemClickListener;
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
            if (mOnItemClickListener1 != null){
                holder.mLayout.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int position = holder.getLayoutPosition();
                        mOnItemClickListener1.onItemClick(holder.itemView,position);
                    }
                });
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
    }

}
