package com.nwar.dsm2018.undefined_homework_1;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ItemViewHolder> {
    ArrayList<RecyclerItem> mItems;
    public RecyclerAdapter (ArrayList<RecyclerItem> items)
    {
        this.mItems = items;
    }
    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new ItemViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull RecyclerAdapter.ItemViewHolder holder, int position){
        RecyclerItem r = mItems.get(position);
        holder.mainTitle.setText(r.getMainTitle());
        holder.subTitle.setText(r.getSubTitle());
        holder.imageView.setImageResource(r.getImage());
    }
    @Override
    public int getItemCount(){
        return mItems.size();
    }
    class ItemViewHolder extends RecyclerView.ViewHolder{
        TextView mainTitle, subTitle;
        ImageView imageView;
        public ItemViewHolder(View itemView){
            super(itemView);
            mainTitle = (TextView) itemView.findViewById(R.id.mainTitle);
            subTitle = (TextView) itemView.findViewById(R.id.subTitle);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
