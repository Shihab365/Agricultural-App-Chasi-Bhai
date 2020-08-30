package com.chasibhai.bel.chasibhai;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.database.*;
import com.squareup.picasso.Picasso;

public class SpringDetailsActivity extends AppCompatActivity {

    TextView detText_1,detText_2;
    ImageView detImg;
    DatabaseReference dfr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spring_details);

        detText_1=(TextView)findViewById(R.id.details_text_1);
        detText_2=(TextView)findViewById(R.id.details_text_2);
        detImg=(ImageView)findViewById(R.id.details_img_id);

        Bundle bundle=getIntent().getExtras();
        if(bundle!=null)
        {
            String str=(String)bundle.get("data");
            if(str.matches("0"))
            {
                dfr=FirebaseDatabase.getInstance().getReference("spring").child("2");
                dfr.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String str1=dataSnapshot.child("descr1").getValue().toString();
                        String str2=dataSnapshot.child("descr2").getValue().toString();
                        String str3=dataSnapshot.child("img").getValue().toString();
                        detText_1.setText(str1);
                        detText_2.setText(str2);
                        Picasso.get().load(str3).into(detImg);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
            else if(str.matches("1"))
            {
                dfr=FirebaseDatabase.getInstance().getReference("spring").child("3");
                dfr.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String str1=dataSnapshot.child("descr1").getValue().toString();
                        String str2=dataSnapshot.child("descr2").getValue().toString();
                        String str3=dataSnapshot.child("img").getValue().toString();
                        detText_1.setText(str1);
                        detText_2.setText(str2);
                        Picasso.get().load(str3).into(detImg);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
            else if(str.matches("2"))
            {
                dfr=FirebaseDatabase.getInstance().getReference("spring").child("4");
                dfr.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String str1=dataSnapshot.child("descr1").getValue().toString();
                        String str2=dataSnapshot.child("descr2").getValue().toString();
                        String str3=dataSnapshot.child("img").getValue().toString();
                        detText_1.setText(str1);
                        detText_2.setText(str2);
                        Picasso.get().load(str3).into(detImg);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
            else if(str.matches("3"))
            {
                dfr=FirebaseDatabase.getInstance().getReference("spring").child("5");
                dfr.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String str1=dataSnapshot.child("descr1").getValue().toString();
                        String str2=dataSnapshot.child("descr2").getValue().toString();
                        String str3=dataSnapshot.child("img").getValue().toString();
                        detText_1.setText(str1);
                        detText_2.setText(str2);
                        Picasso.get().load(str3).into(detImg);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
            else if(str.matches("4"))
            {
                dfr=FirebaseDatabase.getInstance().getReference("spring").child("6");
                dfr.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String str1=dataSnapshot.child("descr1").getValue().toString();
                        String str2=dataSnapshot.child("descr2").getValue().toString();
                        String str3=dataSnapshot.child("img").getValue().toString();
                        detText_1.setText(str1);
                        detText_2.setText(str2);
                        Picasso.get().load(str3).into(detImg);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
            else if(str.matches("5"))
            {
                dfr=FirebaseDatabase.getInstance().getReference("spring").child("7");
                dfr.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String str1=dataSnapshot.child("descr1").getValue().toString();
                        String str2=dataSnapshot.child("descr2").getValue().toString();
                        String str3=dataSnapshot.child("img").getValue().toString();
                        detText_1.setText(str1);
                        detText_2.setText(str2);
                        Picasso.get().load(str3).into(detImg);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
            else if(str.matches("6"))
            {
                dfr=FirebaseDatabase.getInstance().getReference("spring").child("8");
                dfr.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {
                        String str1=dataSnapshot.child("descr1").getValue().toString();
                        String str2=dataSnapshot.child("descr2").getValue().toString();
                        String str3=dataSnapshot.child("img").getValue().toString();
                        detText_1.setText(str1);
                        detText_2.setText(str2);
                        Picasso.get().load(str3).into(detImg);
                    }
                    @Override
                    public void onCancelled(DatabaseError databaseError) {

                    }
                });
            }
        }
    }
}
