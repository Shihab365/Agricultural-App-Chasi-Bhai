package com.chasibhai.bel.chasibhai;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class RainyActivity extends AppCompatActivity {

    ListView summerList;
    ListviewAdapter summerAdapter;
    int[] summImg={R.drawable.ladyfinger,R.drawable.tomato,R.drawable.carrot,
            R.drawable.greenbeans,R.drawable.radish,R.drawable.potatoes,R.drawable.peanut,
            R.drawable.watermelon};
    String[] sumName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rainy);

        Toolbar toolbar=findViewById(R.id.toolbar_id);
        toolbar.setTitle("বর্ষাকাল");

        summerList=findViewById(R.id.listview_rainy_id);
        sumName=getResources().getStringArray(R.array.rainy_item);
        summerAdapter=new ListviewAdapter(this,summImg,sumName);
        summerList.setAdapter(summerAdapter);

        summerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(RainyActivity.this,RainyDetailsActivity.class);
                if(position==0)
                {
                    intent.putExtra("data","0");
                    startActivity(intent);
                }
                else if(position==1)
                {
                    intent.putExtra("data","1");
                    startActivity(intent);
                }
                else if(position==2)
                {
                    intent.putExtra("data","2");
                    startActivity(intent);
                }
                else if(position==3)
                {
                    intent.putExtra("data","3");
                    startActivity(intent);
                }
                else if(position==4)
                {
                    intent.putExtra("data","4");
                    startActivity(intent);
                }
                else if(position==5)
                {
                    intent.putExtra("data","5");
                    startActivity(intent);
                }
                else if(position==6)
                {
                    intent.putExtra("data","6");
                    startActivity(intent);
                }
                else if(position==7)
                {
                    intent.putExtra("data","7");
                    startActivity(intent);
                }
            }
        });
    }
}
