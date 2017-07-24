package com.example.jiaofeng.zitaohui.utils;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class CrowdPop2 extends PopupWindow {
    RecyclerView mRvRightMenu;
    private Context context;
    private List<Entity> mList;
    public View view;


    public CrowdPop2(Context context) {
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.right_menu, null);
        mRvRightMenu = (RecyclerView) view.findViewById(R.id.rv_right_menu);
        mList = new ArrayList<>();
        Entity entity = new Entity(R.drawable.item_menu_img,"内容内容内容内容内容内容内容","￥：4000起");
        for (int i = 0; i < 10; i++) {
            mList.add(entity);
        }



        this.setOutsideTouchable(true);

        this.setContentView(this.view);
        this.setHeight(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setWidth(RelativeLayout.LayoutParams.MATCH_PARENT);
        this.setFocusable(true);
        ColorDrawable drawable = new ColorDrawable(Color.parseColor("#99121212"));
        this.setBackgroundDrawable(drawable);

        mRvRightMenu.setLayoutManager(new LinearLayoutManager(view.getContext(),LinearLayoutManager.VERTICAL,false));
        mRvRightMenu.setAdapter(new MenuAdapter());
    }


    class Entity{
        private int img;
        private String content;
        private String price;

        public int getImg() {
            return img;
        }

        public String getContent() {
            return content;
        }

        public String getPrice() {
            return price;
        }

        public Entity(int img, String content, String price) {
            this.img = img;
            this.content = content;
            this.price = price;
        }

    }
    class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view1 = LayoutInflater.from(view.getContext()).inflate(R.layout.item_rv_rightmenu, parent, false);
            AutoUtils.autoSize(view1);
            return new ViewHolder(view1);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mView.setImageResource(mList.get(position).getImg());
            holder.mView1.setText(mList.get(position).getContent());
            holder.mView2.setText(mList.get(position).getPrice());
            holder.mButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "找相似", Toast.LENGTH_SHORT).show();
                }
            });
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, ""+position, Toast.LENGTH_SHORT).show();
                }
            });

        }

        @Override
        public int getItemCount() {
            return mList.size();
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            private ImageView mView;
            private TextView mView1;
            private TextView mView2;
            private Button mButton;

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (ImageView) itemView.findViewById(R.id.img_menu);
                mView1 = (TextView) itemView.findViewById(R.id.tv_content_menu);
                mView2 = (TextView) itemView.findViewById(R.id.tv_price_menu);
                mButton = (Button) itemView.findViewById(R.id.btn_find_menu);
            }
        }
    }

}
