package com.example.rr.cgpacounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity3 extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8,txt9;
    EditText ext1,ext2,ext3,ext4,ext5,ext6,ext7,ext8,ext9,ext10,ext11,ext12;
    Button btn1,btn2;
    public  float number1=0, number2=0,number3=0,number4=0,result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        txt1=(TextView)findViewById(R.id.textViewInfo);
        txt2=(TextView)findViewById(R.id.textViewSubject);
        txt3=(TextView)findViewById(R.id.textViewCreditHour);
        txt4=(TextView)findViewById(R.id.textViewGpa);
//        txt5=(TextView)findViewById(R.id.textViewTCRDTHR);
//        txt6=(TextView)findViewById(R.id.textViewGPAFinal);
//        txt7=(TextView)findViewById(R.id.textViewFinalToGoOther);
        ext1=(EditText)findViewById(R.id.editTextSub1);
        ext2=(EditText)findViewById(R.id.editTextSub2);
        ext3=(EditText)findViewById(R.id.editTextSub3);
        ext4=(EditText)findViewById(R.id.editTextSub4);
        ext5=(EditText)findViewById(R.id.editTextCrdtHr1);
        ext6=(EditText)findViewById(R.id.editTextCrdtHr2);
        ext7=(EditText)findViewById(R.id.editTextCrHr3);
        ext8=(EditText)findViewById(R.id.editTextCrHr4);
        ext9=(EditText)findViewById(R.id.editTextGPA1);
        ext10=(EditText)findViewById(R.id.editTextGPA2);
        ext11=(EditText)findViewById(R.id.editTextGPA3);
        ext12=(EditText)findViewById(R.id.editTextGPA4);
       btn1=(Button)findViewById(R.id.buttonTotal);

        btn2=(Button)findViewById(R.id.buttonGPA);
//        txt9=(TextView)findViewById(R.id.textViewResult);

//        txt8=(TextView)findViewById(R.id.textViewFinalToGoOther);

        btn1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                CrdtHour();
                result=number1+number2+number3+number4;
                txt9.setText("Result is : "+result);

            }
        });



    }
    public void CrdtHour(){
        // Number field empty or not???
        if(ext5.equals(0)&&ext6.equals(0)&&ext7.equals(0)&&ext8.equals(0) ){
            return;
        }


        //Puttong the value
        else {
            number1 = Float.parseFloat(ext5.getText().toString());
            number2 = Float.parseFloat(ext6.getText().toString());
            number3= Float.parseFloat(ext7.getText().toString());
            number4 = Float.parseFloat(ext8.getText().toString());
        }

    }

    }



