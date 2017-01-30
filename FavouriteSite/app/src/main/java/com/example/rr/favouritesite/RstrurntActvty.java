package com.example.rr.favouritesite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RstrurntActvty extends AppCompatActivity {
    Button btnPizza, btnDom, btnKFC, btnSub, btnGo;
    EditText extUr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rstrurnt_actvty);
        btnSub = (Button) findViewById(R.id.buttonSub);
        btnKFC = (Button) findViewById(R.id.buttonKFC);
        btnDom = (Button) findViewById(R.id.buttonDom);
        btnPizza = (Button) findViewById(R.id.buttonPizzza);
        btnGo = (Button) findViewById(R.id.buttonGo);




        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.subway.com"));
                startActivity(in);
            }
        });
        btnKFC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.kfc.com"));
                startActivity(in);
            }
        });
        btnDom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.dominos.co.in"));
                startActivity(in);
            }
        });
        btnPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.pizzahut.com"));
                startActivity(in);
            }
        });


    }
}
