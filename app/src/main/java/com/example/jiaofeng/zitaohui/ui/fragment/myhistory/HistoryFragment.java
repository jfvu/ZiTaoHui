package com.example.jiaofeng.zitaohui.ui.fragment.myhistory;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.jiaofeng.zitaohui.R;
import com.example.jiaofeng.zitaohui.ui.fragment.BaseFragment;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.Unbinder;

/**
 * Created by Administrator on 2017/7/19.
 */

public class HistoryFragment extends BaseFragment {
    @BindView(R.id.rv_fragment_history)
    RecyclerView mRvFragmentHistory;
    Unbinder unbinder;
    private MyAdapter myAdapter;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_history;
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initView() {
        mRvFragmentHistory.setLayoutManager(new GridLayoutManager(getActivity(),2));
        myAdapter = new MyAdapter();
        mRvFragmentHistory.setAdapter(myAdapter);
        setHeader(mRvFragmentHistory);
        myAdapter.setOnItemClickListener(new MyAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position, String data) {
                Toast.makeText(getActivity(), data, Toast.LENGTH_SHORT).show();
            }
        });

    }
    public static class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        public static final int TYPE_HEADER = 0;
        public static final int TYPE_NORMAL = 1;

        private ArrayList<String> mDatas = new ArrayList<>();

        private View mHeaderView;

        private OnItemClickListener mListener;

        public void setOnItemClickListener(OnItemClickListener li) {
            mListener = li;
        }

        public void setHeaderView(View headerView) {
            mHeaderView = headerView;
            notifyItemInserted(0);
        }

        public View getHeaderView() {
            return mHeaderView;
        }

        public void addDatas(ArrayList<String> datas) {
            mDatas.addAll(datas);
            notifyDataSetChanged();
        }

        @Override
        public int getItemViewType(int position) {
            if(mHeaderView == null) return TYPE_NORMAL;
            if(position == 0) return TYPE_HEADER;
            return TYPE_NORMAL;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            if(mHeaderView != null && viewType == TYPE_HEADER) return new Holder(mHeaderView);
            View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv_fragment_look, parent, false);
            return new Holder(layout);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, final int position) {
            if(getItemViewType(position) == TYPE_HEADER) return;

            final int pos = getRealPosition(viewHolder);

            if(viewHolder instanceof Holder) {

                if(mListener == null) return;
                viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        mListener.onItemClick(pos, position+"");
                    }
                });
            }
        }

        public int getRealPosition(RecyclerView.ViewHolder holder) {
            int position = holder.getLayoutPosition();
            return mHeaderView == null ? position : position - 1;
        }

        @Override
        public int getItemCount() {
            return mHeaderView == null ? 5 : 5 + 1;
        }

        class Holder extends RecyclerView.ViewHolder {

            TextView text;

            public Holder(View itemView) {
                super(itemView);
                if(itemView == mHeaderView) return;
                text = (TextView) itemView.findViewById(R.id.text);
            }
        }

        interface OnItemClickListener {
            void onItemClick(int position, String data);
        }
        @Override
        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
            super.onAttachedToRecyclerView(recyclerView);
            RecyclerView.LayoutManager manager = recyclerView.getLayoutManager();
            if(manager instanceof GridLayoutManager) {
                final GridLayoutManager gridManager = ((GridLayoutManager) manager);
                gridManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                    @Override
                    public int getSpanSize(int position) {
                        return getItemViewType(position) == TYPE_HEADER
                                ? gridManager.getSpanCount() : 1;
                    }
                });
            }
        }
    }
    private void setHeader(RecyclerView view) {
        View header = LayoutInflater.from(getActivity()).inflate(R.layout.header, view, false);
        myAdapter.setHeaderView(header);
    }
}
