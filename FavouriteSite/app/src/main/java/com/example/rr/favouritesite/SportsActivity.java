package com.example.rr.favouritesite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SportsActivity extends AppCompatActivity {
    Button btnCricInfo,btnBuzz,btnGoal,btnSccr,btnGo;
    EditText ext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports);

        btnCricInfo=(Button)findViewById(R.id.buttonCricInfo);
        btnBuzz=(Button)findViewById(R.id.buttonCricBuzz);
        btnGoal=(Button)findViewById(R.id.buttonGoal);
        btnSccr=(Button)findViewById(R.id.buttonSoccer);
        btnGo=(Button)findViewById(R.id.buttonGo);


        btnCricInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/MGzYnU"));
                startActivity(in);
            }
        });
        btnBuzz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.cricbuzz.com"));
                startActivity(in);
            }
        });
        btnGoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.goal.com"));
                startActivity(in);
            }
        });
        btnSccr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.soccer.com"));
                startActivity(in);

            }
        });


    }
}
