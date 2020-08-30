package com.chasibhai.bel.chasibhai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class PriceActivity extends AppCompatActivity {

    RecyclerView recyPrice;
    int[] i_Img={R.drawable.radish,R.drawable.cauliflower,R.drawable.cucumber,R.drawable.cabbage,
            R.drawable.kohlrabi,R.drawable.tomato,R.drawable.eggplant,R.drawable.onion,R.drawable.potatoes,
            R.drawable.carrot,R.drawable.pumpkin,R.drawable.pear,R.drawable.greenbeans};
    String[] i_name,i_price;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_price);

        recyPrice=findViewById(R.id.recy_price_id);
        i_name=getResources().getStringArray(R.array.item_name);
        i_price=getResources().getStringArray(R.array.item_price);

        PriceAdapter adapter=new PriceAdapter(this,i_Img,i_name,i_price);
        recyPrice.setLayoutManager(new LinearLayoutManager(this));
        recyPrice.setAdapter(adapter);
    }
}
