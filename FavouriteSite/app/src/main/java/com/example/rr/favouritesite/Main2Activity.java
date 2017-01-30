package com.example.rr.favouritesite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {
    Button btnRes,btnBlog,btnSports,btnNews;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        btnBlog=(Button)findViewById(R.id.buttonBlog);
        btnNews=(Button)findViewById(R.id.buttonNews);
        btnRes=(Button)findViewById(R.id.buttonRes);
        btnSports=(Button)findViewById(R.id.buttonSp);



        btnBlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ut= new Intent(Main2Activity.this,BlogActivity.class);
                startActivity(ut);
            }
        });

            btnNews.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent in = new Intent(Main2Activity.this,NewspaperActivity.class);
                    startActivity(in);
                }
            });
        btnRes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this,RstrurntActvty.class);
                startActivity(intent);
            }
        });
        btnSports.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent inn = new Intent(Main2Activity.this,SportsActivity.class);
                startActivity(inn);
            }
        });

    }
}
