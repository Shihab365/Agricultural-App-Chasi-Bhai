package com.chasibhai.bel.chasibhai;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyAdapter> {

    private static ClickListener clickListener;
    Context context;
    int[] gridImg;
    String[] seasonName;
    CardView cardView;


    public RecyclerAdapter(Context context, int[] gridImg, String[] seasonName) {
        this.context = context;
        this.gridImg = gridImg;
        this.seasonName = seasonName;
    }

    @Override
    public MyAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.weather_card,parent,false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter holder, int position) {
        holder.imageView.setImageResource(gridImg[position]);
        holder.textView.setText(seasonName[position]);
    }

    @Override
    public int getItemCount() {
        return seasonName.length;
    }

    class MyAdapter extends RecyclerView.ViewHolder implements View.OnClickListener{

        ImageView imageView;
        TextView textView;

        public MyAdapter(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.grid_image_id);
            textView=itemView.findViewById(R.id.grid_text_id);
            cardView=itemView.findViewById(R.id.grid_cardview_id);

            cardView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            clickListener.onItemClickListener(getAdapterPosition(),v);
        }
    }
    public interface ClickListener{

        void onItemClickListener(int pos,View v);
    }
    public void setOnItemClickListener(ClickListener clickListener)
    {
        RecyclerAdapter.clickListener=clickListener;
    }

}

