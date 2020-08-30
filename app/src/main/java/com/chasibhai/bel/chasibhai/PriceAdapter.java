package com.chasibhai.bel.chasibhai;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PriceAdapter extends RecyclerView.Adapter<PriceAdapter.MyAdapter> {

    Context context;
    int[] i_img;
    String[] i_name;
    String[] i_price;


    public PriceAdapter(Context context, int[] i_img, String[] i_name, String[] i_price) {
        this.context = context;
        this.i_img = i_img;
        this.i_name = i_name;
        this.i_price = i_price;
    }

    @Override
    public MyAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(context);
        View view=inflater.inflate(R.layout.marketprice_recy,parent,false);
        return new MyAdapter(view);
    }

    @Override
    public void onBindViewHolder(MyAdapter holder, int position) {
        holder.imageView.setImageResource(i_img[position]);
        holder.textView1.setText(i_name[position]);
        holder.textView2.setText(i_price[position]);
    }

    @Override
    public int getItemCount() {
        return i_name.length;
    }

    class MyAdapter extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView textView1;
        TextView textView2;

        public MyAdapter(View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.price_image_id);
            textView1=itemView.findViewById(R.id.item_name_id);
            textView2=itemView.findViewById(R.id.item_price_id);
        }
    }
}
