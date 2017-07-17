package com.example.jiaofeng.zitaohui.ui.fragment;

import android.graphics.Color;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.example.jiaofeng.zitaohui.R;
import com.zhy.autolayout.utils.AutoUtils;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by jiaofeng on 2017/7/16.
 */

public class ClassFragment extends BaseFragment {
    @BindView(R.id.et_input_fragment_class)
    EditText etInputFragmentClass;
    /*@BindView(R.id.lv_class_fragment_class)
    ListView lvClassFragmentClass;*/
    @BindView(R.id.tv_classname_fragment_class)
    TextView tvClassnameFragmentClass;
    @BindView(R.id.rv_content_fragment_class)
    RecyclerView rvContentFragmentClass;
    Unbinder unbinder;
    private List<ClassName> classNames;
    private MyClassNameAdapter myClassNameAdapter;
    private ArrayList<Integer> number = new ArrayList<>();
    private List<Entityclass> entityclasses;
    private MyRlAdapter myRlAdapter;
    private int flag = 0;


    @Override
    protected int getLayoutId() {
        return R.layout.fragment_class;
    }

    @Override
    protected void initData() {
        myRlAdapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                Toast.makeText(getActivity(), ""+position, Toast.LENGTH_SHORT).show();
            }
        });
        /*myRlAdapter.setOnLoadMoreListener(new BaseQuickAdapter.RequestLoadMoreListener() {
            @Override
            public void onLoadMoreRequested() {
                if (flag != classNames.size() ){
                    flag = flag +1;
                    entityclasses.clear();
                    getEetityclasses(number.get(flag));
                    myRlAdapter.notifyDataSetChanged();
                }

            }
        });
        myRlAdapter.setUpFetchListener(new BaseQuickAdapter.UpFetchListener() {
            @Override
            public void onUpFetch() {
                if (flag != 0){
                    flag = flag -1;
                    entityclasses.clear();
                    getEetityclasses(number.get(flag));
                    myRlAdapter.notifyDataSetChanged();

                }
            }
        });*/
    }

    @Override
    protected void initView() {
        classNames = new ArrayList<>();
        ClassName name = new ClassName("推荐分类");
        ClassName name1 = new ClassName("明星分类");
        ClassName name2 = new ClassName("其他分类");
        ClassName name3 = new ClassName("精选分类");
        ClassName name4 = new ClassName("热销分类");
        ClassName name5 = new ClassName("关注分类");
        classNames.add(name);
        classNames.add(name1);
        classNames.add(name2);
        classNames.add(name3);
        classNames.add(name4);
        classNames.add(name5);

        entityclasses = new ArrayList<>();
        entityclasses.add(new Entityclass(R.drawable.rl_picture,"分类名称"));
        number.add(24);
        number.add(8);
        number.add(33);
        number.add(55);
        number.add(66);
        number.add(77);


        /*myClassNameAdapter = new MyClassNameAdapter();
        lvClassFragmentClass.setAdapter(new MyClassNameAdapter());
        tvClassnameFragmentClass.setText(classNames.get(0).getName());
        lvClassFragmentClass.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                for (int i = 0; i < classNames.size(); i++) {
                    parent.getChildAt(i).setBackgroundColor(Color.parseColor("#F9F9F9"));
                }
                view.setBackgroundColor(Color.parseColor("#ffffff"));
                tvClassnameFragmentClass.setText(classNames.get(position).getName());
                entityclasses.clear();
                getEetityclasses(number.get(position));
                myRlAdapter.notifyDataSetChanged();
                flag = position;

            }
        });*/
        myRlAdapter = new MyRlAdapter(R.layout.item_content_rl,getEetityclasses(number.get(0)));
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        //linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        rvContentFragmentClass.setLayoutManager(new GridLayoutManager(getActivity(),4));
        rvContentFragmentClass.setAdapter(myRlAdapter);

    }

    private List<Entityclass> getEetityclasses(int i) {
        for (int j = 0; j < i; j++) {
            entityclasses.add(new Entityclass(R.drawable.rl_picture,"分类名称"));
        }

        return entityclasses;
    }

    class ClassName{
        private String name;

        public ClassName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    class Entityclass{
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

    private class MyClassNameAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return classNames.size();
        }

        @Override
        public Object getItem(int position) {
            return classNames.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LinearLayout linearLayout;
            TextView textView;
            View view = null;
            if (convertView !=null){
                view = convertView;
            }else {
                view = View.inflate(getContext(), R.layout.item_classnamelv,null);
            }
            AutoUtils.autoSize(view);
            linearLayout = (LinearLayout) view.findViewById(R.id.ll_classname_lv);

            textView = (TextView) view.findViewById(R.id.tv_classname_lv);
            textView.setText(classNames.get(position).getName());
            view.setBackgroundColor(Color.parseColor("#F9F9F9"));
            if (position == 0){
                view.setBackgroundColor(Color.parseColor("#ffffff"));
            }
            return view;
        }
    }
    public class MyRlAdapter extends BaseQuickAdapter<Entityclass,BaseViewHolder>{

        public MyRlAdapter(@LayoutRes int layoutResId, @Nullable List<Entityclass> data) {
            super(R.layout.item_content_rl, entityclasses);
        }

        @Override
        protected void convert(BaseViewHolder helper, Entityclass item) {


        }
    }
}
