package com.chasibhai.bel.chasibhai;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class SummerActivity extends AppCompatActivity {

    ListView summerList;
    ListviewAdapter summerAdapter;
    int[] summImg={R.drawable.radish,R.drawable.cauliflower,R.drawable.cucumber,
            R.drawable.cabbage,R.drawable.kohlrabi,R.drawable.tomato,R.drawable.eggplant,
            R.drawable.zucchini};
    String[] sumName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summer);

        Toolbar toolbar=findViewById(R.id.toolbar_id);
        toolbar.setTitle("গ্রীষ্মকাল");

        summerList=findViewById(R.id.listview_summer_id);
        sumName=getResources().getStringArray(R.array.summer_item);
        summerAdapter=new ListviewAdapter(this,summImg,sumName);
        summerList.setAdapter(summerAdapter);

        summerList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent=new Intent(SummerActivity.this,SummerDetailsActivity.class);
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
