package com.example.jiaofeng.zitaohui.ui.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.App;
import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.activity.OneOfClassActivity;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/17.
 */

public class ClassCenterFragment extends BaseFragment {
    @BindView(R.id.rv_classcenter)
    RecyclerView mRvClasscenter;
    Unbinder unbinder;
    private int mInt;
    private List<Entityclass> entityclasses = new ArrayList<>();
    private Intent mIntent;


    public ClassCenterFragment(int anInt) {
        mInt = anInt;
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_classcenter;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {


        mRvClasscenter.setLayoutManager(new GridLayoutManager(getActivity(),4));
        mRvClasscenter.setAdapter(new QuickAdapter());
    }
    public class QuickAdapter extends RecyclerView.Adapter<QuickAdapter.ContactsViewHolder>{


        @Override
        public ContactsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            View view = inflater.inflate(R.layout.item_content_rl, null);
            AutoUtils.autoSize(view);
            return new ContactsViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ContactsViewHolder holder, final int position) {
            List<Entityclass> list = getEetityclasses(mInt);

           holder.tvIndex.setText(list.get(position).getName());
            holder.ivAvatar.setImageResource(list.get(position).getImg() );
            holder.mLayout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
                    mIntent = new Intent(getActivity(), OneOfClassActivity.class);
                    mIntent.putExtra("OneOfClassActivity",position);
                    startActivity(mIntent);


                }
            });
        }

        @Override
        public int getItemCount() {
            return mInt;
        }
        class ContactsViewHolder extends RecyclerView.ViewHolder {
            private LinearLayout mLayout;
            public TextView tvIndex;
            public ImageView ivAvatar;


            public ContactsViewHolder(View itemView) {
                super(itemView);
                mLayout = (LinearLayout) itemView.findViewById(R.id.ll_item);
                tvIndex = (TextView) itemView.findViewById(R.id.tv_name_item);
                ivAvatar = (ImageView) itemView.findViewById(R.id.img_item);

            }
        }
    }

    public class Entityclass {
        private int img;
        private String name;

        public Entityclass(int img, String name) {
            this.img = img;
            this.name = name;
        }

        public int getImg() {
            return img;
        }

        public String getName() {
            return name;
        }

    }
    private List<Entityclass> getEetityclasses(int i) {
        for (int j = 0; j < i; j++) {
            entityclasses.add(new Entityclass(R.drawable.rl_picture, "分类名称"));
        }

        return entityclasses;
    }
}
