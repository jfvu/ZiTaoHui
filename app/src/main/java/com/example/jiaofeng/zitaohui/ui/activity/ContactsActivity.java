package com.example.jiaofeng.zitaohui.ui.activity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.adapter.ContactsAdapter;
import com.gjiazhe.wavesidebar.WaveSideBar;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ContactsActivity extends BaseActivity {


    @BindView(R.id.ll_status_activity_contacts)
    LinearLayout mLlStatusActivityContacts;
    @BindView(R.id.img_return_activity_contacts)
    ImageView mImgReturnActivityContacts;
    @BindView(R.id.tv_all)
    TextView mTvAll;
    @BindView(R.id.rv_contacts)
    RecyclerView mRvContacts;
    @BindView(R.id.side_bar)
    WaveSideBar mSideBar;
    @BindView(R.id.rl_next)
    RelativeLayout mRlNext;
    private ArrayList<Contact> contacts = new ArrayList<>();

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        contacts.addAll(Contact.getChineseContacts());

        mRvContacts.setLayoutManager(new LinearLayoutManager(this));
        mRvContacts.setAdapter(new ContactsAdapter(contacts, R.layout.item_friendfragmentrecycleview));

        mSideBar.setOnSelectIndexItemListener(new WaveSideBar.OnSelectIndexItemListener() {
            @Override
            public void onSelectIndexItem(String index) {
                for (int i = 0; i < contacts.size(); i++) {
                    if (contacts.get(i).getIndex().equals(index)) {
                        ((LinearLayoutManager) mRvContacts.getLayoutManager()).scrollToPositionWithOffset(i, 0);
                        return;
                    }
                }
            }
        });
    }

    @Override
    protected int getLayoutId() {
        return R.layout.activity_contacts;
    }

    @Override
    protected LinearLayout getStatusParams() {
        return mLlStatusActivityContacts;
    }

    @Override
    protected int color() {
        return Color.parseColor("#242424");
    }


    @OnClick({R.id.img_return_activity_contacts, R.id.tv_all,R.id.rl_next})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.img_return_activity_contacts:
                finish();
                break;
            case R.id.tv_all:
                break;
            case R.id.rl_next:
                Intent intent = new Intent(this,EditMessageActivity.class);
                startActivity(intent);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // TODO: add setContentView(...) invocation
        ButterKnife.bind(this);
    }

    public static class Contact {
        private String index;
        private String name;

        public Contact(String index, String name) {
            this.index = index;
            this.name = name;
        }

        public String getIndex() {
            return index;
        }

        public String getName() {
            return name;
        }

        public static List<Contact> getEnglishContacts() {
            List<Contact> contacts = new ArrayList<>();
            contacts.add(new Contact("A", "Abbey"));
            contacts.add(new Contact("A", "Alex"));
            contacts.add(new Contact("A", "Amy"));
            contacts.add(new Contact("A", "Anne"));
            contacts.add(new Contact("B", "Betty"));
            contacts.add(new Contact("B", "Bob"));
            contacts.add(new Contact("B", "Brian"));
            contacts.add(new Contact("C", "Carl"));
            contacts.add(new Contact("C", "Candy"));
            contacts.add(new Contact("C", "Carlos"));
            contacts.add(new Contact("C", "Charles"));
            contacts.add(new Contact("C", "Christina"));
            contacts.add(new Contact("D", "David"));
            contacts.add(new Contact("D", "Daniel"));
            contacts.add(new Contact("E", "Elizabeth"));
            contacts.add(new Contact("E", "Eric"));
            contacts.add(new Contact("E", "Eva"));
            contacts.add(new Contact("F", "Frances"));
            contacts.add(new Contact("F", "Frank"));
            contacts.add(new Contact("I", "Ivy"));
            contacts.add(new Contact("J", "James"));
            contacts.add(new Contact("J", "John"));
            contacts.add(new Contact("J", "Jessica"));
            contacts.add(new Contact("K", "Karen"));
            contacts.add(new Contact("K", "Karl"));
            contacts.add(new Contact("K", "Kim"));
            contacts.add(new Contact("L", "Leon"));
            contacts.add(new Contact("L", "Lisa"));
            contacts.add(new Contact("P", "Paul"));
            contacts.add(new Contact("P", "Peter"));
            contacts.add(new Contact("S", "Sarah"));
            contacts.add(new Contact("S", "Steven"));
            contacts.add(new Contact("R", "Robert"));
            contacts.add(new Contact("R", "Ryan"));
            contacts.add(new Contact("T", "Tom"));
            contacts.add(new Contact("T", "Tony"));
            contacts.add(new Contact("W", "Wendy"));
            contacts.add(new Contact("W", "Will"));
            contacts.add(new Contact("W", "William"));
            contacts.add(new Contact("Z", "Zoe"));
            return contacts;
        }

        public static List<Contact> getChineseContacts() {
            List<Contact> contacts = new ArrayList<>();
            contacts.add(new Contact("B", "白虎"));
            contacts.add(new Contact("C", "常羲"));
            contacts.add(new Contact("C", "嫦娥"));
            contacts.add(new Contact("E", "二郎神"));
            contacts.add(new Contact("F", "伏羲"));
            contacts.add(new Contact("G", "观世音"));
            contacts.add(new Contact("J", "精卫"));
            contacts.add(new Contact("K", "夸父"));
            contacts.add(new Contact("N", "女娲"));
            contacts.add(new Contact("N", "哪吒"));
            contacts.add(new Contact("P", "盘古"));
            contacts.add(new Contact("Q", "青龙"));
            contacts.add(new Contact("R", "如来"));
            contacts.add(new Contact("S", "孙悟空"));
            contacts.add(new Contact("S", "沙僧"));
            contacts.add(new Contact("S", "顺风耳"));
            contacts.add(new Contact("T", "太白金星"));
            contacts.add(new Contact("T", "太上老君"));
            contacts.add(new Contact("X", "羲和"));
            contacts.add(new Contact("X", "玄武"));
            contacts.add(new Contact("Z", "猪八戒"));
            contacts.add(new Contact("Z", "朱雀"));
            contacts.add(new Contact("Z", "祝融"));
            return contacts;
        }


    }
}
