package com.example.summit.baseballgame_02;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.example.summit.baseballgame_02.databinding.RowResultItemBinding;

import java.util.ArrayList;


class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHolder> {
    Context mContext;
    ArrayList<RoundItem> mArrRoundResultItem;


    public MyRecyclerViewAdapter(Context context, ArrayList<RoundItem> arrRoundResultItem) {
        mContext = context;
        mArrRoundResultItem = arrRoundResultItem;
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(mContext);
        RowResultItemBinding binding = DataBindingUtil.inflate(inflater, R.layout.row_result_item, parent, false);

        MyViewHolder holder = new MyViewHolder(binding);

        return holder;
    }


    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        RoundItem item = mArrRoundResultItem.get(position);
        RowResultItemBinding binding = holder.mBiding;

        binding.roundInputTv.setText(item.input);
        binding.roundResultTv.setText(item.result);
    }

    @Override
    public int getItemCount() {
        return mArrRoundResultItem.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        RowResultItemBinding mBiding;

        public MyViewHolder(RowResultItemBinding binding) {
            super(binding.getRoot());

            mBiding = binding;
        }
    }

}
