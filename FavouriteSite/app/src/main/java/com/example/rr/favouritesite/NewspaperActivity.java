package com.example.rr.favouritesite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NewspaperActivity extends AppCompatActivity {
    Button btnBd,btnKal,btnPro,btnDaily,btndaily;
    EditText ext1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newspaper);
        btnBd=(Button)findViewById(R.id.buttonBd);
        btnDaily=(Button)findViewById(R.id.buttonDaily);
        btnKal=(Button)findViewById(R.id.buttonKaler);
        btnPro=(Button)findViewById(R.id.buttonAlo);
        btndaily=(Button)findViewById(R.id.buttonDaily);


        btnBd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://bangla.bdnews24.com"));
                startActivity(in);

            }
        });
        btnDaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.thedailystar.net"));
                startActivity(in);

            }
        });
        btnKal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.kalerkantho.com"));
                startActivity(in);
            }
        });
        btnPro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.prothom-alo.com"));
                startActivity(in);
            }
        });
        btndaily.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.daily-sun.com/"));
                startActivity(in);
            }
        });


    }
}
