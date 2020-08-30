package com.chasibhai.bel.chasibhai;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.*;
import com.firebase.ui.auth.AuthUI;
import com.firebase.ui.auth.IdpResponse;
import com.google.firebase.database.*;

import java.util.Arrays;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    List<AuthUI.IdpConfig> providers;
    public static final int MY_REQUEST_CODE=7117;
    RecyclerView recy_season;
    Spinner spinner;
    String[] divName, seasonName;
    int[] gridImg = {R.drawable.summer_button, R.drawable.rain_button, R.drawable.autumn_button, R.drawable.late_autumn,
            R.drawable.winter_button, R.drawable.spring_button};
    RecyclerAdapter customAdapter;
    LinearLayout callClick, priceClick, webClick, feedbackClick;
    TextView wStatus,wTemp,wHum,wRain,wWind;
    DatabaseReference wRef;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        providers=Arrays.asList(
                new AuthUI.IdpConfig.GoogleBuilder().build(),
                new AuthUI.IdpConfig.EmailBuilder().build(),
                new AuthUI.IdpConfig.PhoneBuilder().build()
        );
        showSignIn();

        wStatus=findViewById(R.id.w_status_id);
        wTemp=findViewById(R.id.w_temp_id);
        wHum=findViewById(R.id.w_humi_id);
        wRain=findViewById(R.id.w_rain_id);
        wWind=findViewById(R.id.w_wind_id);

        callClick = findViewById(R.id.call_id);
        priceClick = findViewById(R.id.price_id);
        webClick = findViewById(R.id.website_id);
        feedbackClick = findViewById(R.id.feedback_id);

        callClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callIntent = new Intent(Intent.ACTION_CALL);
                callIntent.setData(Uri.parse("tel:16123"));
                if (ActivityCompat.checkSelfPermission(HomeActivity.this, android.Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                    return;
                }
                startActivity(callIntent);
            }
        });
        priceClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,PriceActivity.class));
            }
        });
        webClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,WebActivity.class));
            }
        });
        feedbackClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HomeActivity.this,FeedbackActivity.class));
            }
        });

        seasonName=getResources().getStringArray(R.array.season_button);
        recy_season=findViewById(R.id.recycler_season_id);
        spinner=findViewById(R.id.spinner_id);
        divName=getResources().getStringArray(R.array.division_name);
        ArrayAdapter arrayAdapter=new ArrayAdapter(this,R.layout.spinner_text,R.id.spinner_text_id,divName);
        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                if(position==0)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("1");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                else if(position==1)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("2");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                else if(position==2)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("3");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                else if(position==3)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("4");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                else if(position==4)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("5");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                else if(position==5)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("6");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                else if(position==6)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("7");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
                else if(position==7)
                {
                    wRef=FirebaseDatabase.getInstance().getReference("weather").child("8");
                    wRef.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(DataSnapshot dataSnapshot) {
                            String str1=dataSnapshot.child("status").getValue().toString();
                            String str2=dataSnapshot.child("temp").getValue().toString();
                            String str3=dataSnapshot.child("hum").getValue().toString();
                            String str4=dataSnapshot.child("rain").getValue().toString();
                            String str5=dataSnapshot.child("wind").getValue().toString();
                            wStatus.setText(str1);
                            wTemp.setText(str2);
                            wHum.setText(str3);
                            wRain.setText(str4);
                            wWind.setText(str5);
                        }

                        @Override
                        public void onCancelled(DatabaseError databaseError) {

                        }
                    });
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        customAdapter=new RecyclerAdapter(this,gridImg,seasonName);
        recy_season.setAdapter(customAdapter);
        recy_season.setLayoutManager(new GridLayoutManager(HomeActivity.this,2));

        customAdapter.setOnItemClickListener(new RecyclerAdapter.ClickListener() {
            @Override
            public void onItemClickListener(int pos, View v) {
                if(pos==0)
                {
                    startActivity(new Intent(HomeActivity.this,SummerActivity.class));
                }
                else if(pos==1)
                {
                    startActivity(new Intent(HomeActivity.this,RainyActivity.class));
                }
                else if(pos==2)
                {
                    startActivity(new Intent(HomeActivity.this,AutumnActivity.class));
                }
                else if(pos==3)
                {
                    startActivity(new Intent(HomeActivity.this,LateAutumnActivity.class));
                }
                else if(pos==4)
                {
                    startActivity(new Intent(HomeActivity.this,WinterActivity.class));
                }
                else if(pos==5)
                {
                    startActivity(new Intent(HomeActivity.this,SpringActivity.class));
                }
            }
        });
    }

    public void showSignIn()
    {
        startActivityForResult(
                AuthUI.getInstance().createSignInIntentBuilder()
                        .setAvailableProviders(providers)
                        .setTheme(R.style.MyTheme)
                        .build(),MY_REQUEST_CODE
        );
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if(requestCode==MY_REQUEST_CODE)
        {
            IdpResponse response=IdpResponse.fromResultIntent(data);

            if(resultCode==RESULT_OK)
            {

            }
            else
            {
                Toast.makeText(this, ""+response.getError().getMessage(), Toast.LENGTH_SHORT).show();
            }
        }
    }
}
