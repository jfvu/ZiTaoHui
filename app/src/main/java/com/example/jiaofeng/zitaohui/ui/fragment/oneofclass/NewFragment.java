package com.example.jiaofeng.zitaohui.ui.fragment.oneofclass;

import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
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

public class NewFragment extends BaseFragment {
    @BindView(R.id.img_fragment_new)
    ImageView imgFragmentNew;
    @BindView(R.id.rv_fragment_new)
    RecyclerView rvFragmentNew;
    Unbinder unbinder;
    @BindView(R.id.img_triangle)
    ImageView mImgTriangle;
    Unbinder unbinder1;
    private List<Entity> mList;

    public static NewFragment newInstance() {
        return new NewFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_new;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mImgTriangle.bringToFront();
        mList = new ArrayList<>();
        Entity entity = new Entity(R.drawable.item_img, "名称名称", 4000);
        for (int i = 0; i < 6; i++) {
            mList.add(entity);
        }
        rvFragmentNew.setLayoutManager(new GridLayoutManager(getActivity(), 3));
        rvFragmentNew.setAdapter(new MyAdapter());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        unbinder1 = ButterKnife.bind(this, rootView);
        return rootView;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        unbinder1.unbind();
    }

    class Entity {
        private int img;
        private String name;
        private long price;

        public int getImg() {
            return img;
        }

        public String getName() {
            return name;
        }

        public long getPrice() {
            return price;
        }

        public Entity(int img, String name, long price) {
            this.img = img;
            this.name = name;
            this.price = price;
        }
    }

    class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(getActivity()).inflate(R.layout.item_rv_fragment_new, parent, false);
            AutoUtils.autoSize(view);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {
            holder.mView.setImageResource(mList.get(position).getImg());
            holder.mView1.setText(mList.get(position).getName());
            holder.mView2.setText("￥" + mList.get(position).getPrice() + "起");
            holder.mView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "" + position, Toast.LENGTH_SHORT).show();
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

            public ViewHolder(View itemView) {
                super(itemView);
                mView = (ImageView) itemView.findViewById(R.id.img_rv_fragment_new);
                mView1 = (TextView) itemView.findViewById(R.id.tv_name_rv_fragment_new);
                mView2 = (TextView) itemView.findViewById(R.id.tv_price_rv_fragment_new);
            }
        }
    }
}
