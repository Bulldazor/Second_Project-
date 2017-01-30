package com.example.rr.favouritesite;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class BlogActivity extends AppCompatActivity {
    Button btnPc, btnSome,btnTech,btnAmr,btnggo;
    EditText extEn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);
        btnPc=(Button)findViewById(R.id.buttonPc);
        btnSome=(Button)findViewById(R.id.buttonSome);
        btnTech=(Button)findViewById(R.id.buttonTech);
        btnAmr=(Button)findViewById(R.id.buttonAmr);
        btnggo=(Button)findViewById(R.id.buttonGo);

        extEn=(EditText)findViewById(R.id.editTextEnter);

        btnPc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iin = new Intent(Intent.ACTION_VIEW, Uri.parse("http;//www.pchelplinebd.com"));
                startActivity(iin);

            }
        });
        btnSome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent un = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.somewhereinblog.net"));
                startActivity(un);

            }
        });
        btnTech.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http:// www.techtunes.com.bd"));
                startActivity(intent);
            }
        });
        btnAmr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intt = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.amarblog.com"));
                startActivity(intt);
            }
        });
        btnggo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url=extEn.getText().toString();
                Intent in = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(in);

            }
        });

    }
}
