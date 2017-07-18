package com.example.jiaofeng.zitaohui.ui.fragment.oneofclass;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/18.
 */

public class SoonFragment extends BaseFragment {
    @BindView(R.id.rv_fragment_soon)
    RecyclerView mRvFragmentSoon;
    Unbinder unbinder;
    private List<SoonFragment.Entity> mList;

    public static SoonFragment newInstance() {
        return new SoonFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_soon;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mList = new ArrayList<>();
        Entity entity = new Entity(R.drawable.item_img,"内容内容内容内容内容内容内容",4000,141,false,false);
        for (int i = 0; i < 6; i++) {
            mList.add(entity);
        }
        mRvFragmentSoon.setLayoutManager(new LinearLayoutManager(getActivity()));
        mRvFragmentSoon.setAdapter(new MyAdapter());
    }

    class Entity{
        private int img;
        private String conten;
        private long price;
        private int heat;
        private boolean priced;
        private boolean add;

        public int getImg() {
            return img;
        }

        public void setImg(int img) {
            this.img = img;
        }

        public String getConten() {
            return conten;
        }

        public void setConten(String conten) {
            this.conten = conten;
        }

        public long getPrice() {
            return price;
        }

        public void setPrice(long price) {
            this.price = price;
        }

        public int getHeat() {
            return heat;
        }

        public void setHeat(int heat) {
            this.heat = heat;
        }

        public boolean isPriced() {
            return priced;
        }

        public void setPriced(boolean priced) {
            this.priced = priced;
        }

        public boolean isAdd() {
            return add;
        }

        public void setAdd(boolean add) {
            this.add = add;
        }

        public Entity(int img, String conten, long price, int heat, boolean priced, boolean add) {
            this.img = img;
            this.conten = conten;
            this.price = price;
            this.heat = heat;
            this.priced = priced;
            this.add = add;
        }
    }
    class MyAdapter extends RecyclerView.Adapter<SoonFragment.MyAdapter.ViewHolder> {

        @Override
        public SoonFragment.MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_fragment_soon, parent, false);
            AutoUtils.autoSize(view);
            return new SoonFragment.MyAdapter.ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(final SoonFragment.MyAdapter.ViewHolder holder, final int position) {
            holder.mView.setImageResource(mList.get(position).getImg());
            holder.mView1.setText(mList.get(position).getConten());
            holder.mView2.setText("￥：" + mList.get(position).getPrice() + "起");
            holder.mView4.setText(mList.get(position).getHeat()+"");
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
                }
            });
            holder.mView4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (mList.get(position).isPriced()){
                        mList.get(position).setPriced(false);
                        mList.get(position).setHeat(mList.get(position).getHeat()-1);
                        holder.mView4.setText(mList.get(position).getHeat()+"");
                        holder.mView4.setTextColor(Color.parseColor("#40121212"));
                        holder.mView3.setImageResource(R.drawable.soon_heat);
                    }else {
                        mList.get(position).setPriced(true);
                        mList.get(position).setHeat(mList.get(position).getHeat()+1);
                        holder.mView4.setText(mList.get(position).getHeat()+"");
                        holder.mView4.setTextColor(Color.parseColor("#ff0000"));
                        holder.mView3.setImageResource(R.drawable.soon_heated);
                    }
                }
            });
            holder.mView6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mList.get(position).isAdd()){
                        mList.get(position).setAdd(false);
                        holder.mView5.setImageResource(R.drawable.soon_car);
                        holder.mView6.setTextColor(Color.parseColor("#40121212"));
                    }else {
                        mList.get(position).setAdd(true);
                        holder.mView5.setImageResource(R.drawable.soon_cared);
                        holder.mView6.setTextColor(Color.parseColor("#ff0000"));
                    }
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
            private ImageView mView3;
            private TextView mView4;
            private ImageView mView5;
            private TextView mView6;

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (ImageView) itemView.findViewById(R.id.img_rv_fragment_soon);
                mView1 = (TextView) itemView.findViewById(R.id.tv_conten_rv_fragment_soon);
                mView2 = (TextView) itemView.findViewById(R.id.tv_price_rv_fragment_new);
                mView3 = (ImageView) itemView.findViewById(R.id.img_img_heat_rv_fragment_soon);
                mView4 = (TextView) itemView.findViewById(R.id.tv_heat_rv_fragment_soon);
                mView5 = (ImageView) itemView.findViewById(R.id.img_add_rv_fragment_soon);
                mView6 = (TextView) itemView.findViewById(R.id.tv_add_rv_fragment_soon);
            }
        }
    }
}
